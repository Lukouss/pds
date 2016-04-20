package capadenegocio;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Contacto {
	public Contacto() {
	}
	
	private int uid;
	
	private String nombre;
	
	private String apellido;
	
	private String telefono;
	
	private String mail;
	
	public void setUid (int value) {
		this.uid = value;
	}
	
	public int getUid() {
		return uid;
	}
	
	public int getORMID() {
		return getUid();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setMail(String value) {
		this.mail = value;
	}
	
	public String getMail() {
		return mail;
	}
	
	
	public static  String ingresar(Contacto contacto) throws PersistentException {
		String ingreso = "contacto "+contacto.getNombre()+" ingresado";
		PersistentTransaction t = orm.EjercicioPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Entidad oRMEntidad = orm.EntidadDAO.createEntidad();
			oRMEntidad.setUid(contacto.getUid());
			oRMEntidad.setNombre(contacto.getNombre());
			oRMEntidad.setApellido(contacto.getApellido());
			oRMEntidad.setMail(contacto.getMail());
			oRMEntidad.setTelefono(contacto.getTelefono());// Initialize the properties of the persistent object here
			orm.EntidadDAO.save(oRMEntidad);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		return ingreso;
	}
	
private static final int ROW_COUNT = 100;
	
	public List mostrar() throws PersistentException {
		List<orm.Entidad> listaURM = orm.EntidadDAO.queryEntidad(null, null);
		List<Contacto> lcontacto = new ArrayList<Contacto>();
		
		for( orm.Entidad contactoUrm: listaURM ) {			
			Contacto contactoadd = new Contacto();
			contactoadd.setUid(contactoUrm.getUid());
			contactoadd.setNombre(contactoUrm.getNombre());
			contactoadd.setApellido(contactoUrm.getApellido());
			contactoadd.setMail(contactoUrm.getMail());
			contactoadd.setTelefono(contactoUrm.getTelefono());
			
			lcontacto.add(contactoadd);
			}
		
		return  lcontacto;
	}
	
	public static String eliminar(Contacto contacto) throws PersistentException {
		
		String eliminar = "contacto "+contacto.getNombre()+" eliminado";
		PersistentTransaction t = orm.EjercicioPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Entidad oRMEntidad = orm.EntidadDAO.loadEntidadByQuery("Contacto.nombre = '"+contacto.getNombre()+"' && Contacto.apellido = '" +contacto.getApellido() + "'" , null);
			orm.EntidadDAO.delete(oRMEntidad);
			t.commit();
			System.out.println("contacto "+ eliminar+ " eliminado");
		}
		catch (Exception e) {
			t.rollback();
		}
		return eliminar;
	}
	public static String Actualizar(Contacto contacto) throws PersistentException {
		String cambio = "contacto "+contacto.getNombre()+" cambiado";
		PersistentTransaction t = orm.EjercicioPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Entidad oRMEntidad = orm.EntidadDAO.getEntidadByORMID(contacto.getUid());
			
			oRMEntidad.setUid(contacto.getUid());
			oRMEntidad.setNombre(contacto.getNombre());
			oRMEntidad.setApellido(contacto.getApellido());
			oRMEntidad.setMail(contacto.getMail());
			oRMEntidad.setTelefono(contacto.getTelefono());
			
			orm.EntidadDAO.save(oRMEntidad);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		return cambio;
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Entidad by EntidadCriteria");
		orm.EntidadCriteria oRMEntidadCriteria = new orm.EntidadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMEntidadCriteria.uid.eq();
		System.out.println(oRMEntidadCriteria.uniqueEntidad());
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Entidad by Criteria...");
		orm.EntidadCriteria oRMEntidadCriteria = new orm.EntidadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMEntidadCriteria.uid.eq();
		oRMEntidadCriteria.setMaxResults(ROW_COUNT);
		orm.Entidad[] oRMEntidads = oRMEntidadCriteria.listEntidad();
		int length =oRMEntidads== null ? 0 : Math.min(oRMEntidads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMEntidads[i]);
		}

		
	}
}
