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

	private String rut;

	private String cargo;

	private String dirrecion;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDirrecion() {
		return dirrecion;
	}

	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public void setUid(int value) {
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

	public static String ingresar(Contacto contacto) throws PersistentException {
		String ingreso = "contacto " + contacto.getNombre() + " ingresado";
		PersistentTransaction t = orm.EjercicioPersistentManager.instance()
				.getSession().beginTransaction();
		try {
			orm.Contacto oRMcontacto = orm.ContactoDAO.createContacto();
			oRMcontacto.setUid(contacto.getUid());
			oRMcontacto.setNombre(contacto.getNombre());
			oRMcontacto.setApellido(contacto.getApellido());
			oRMcontacto.setMail(contacto.getMail());
			oRMcontacto.setTelefono(contacto.getTelefono());
			oRMcontacto.setCargo(contacto.getCargo());
			oRMcontacto.setDirrecion(contacto.getDirrecion());
			oRMcontacto.setRut(contacto.getRut());// Initialize the properties
													// of the persistent object
													// here
			orm.ContactoDAO.save(oRMcontacto);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return ingreso;
	}

	private static final int ROW_COUNT = 100;

	public List mostrar() throws PersistentException {
		List<orm.Contacto> listaURM = orm.ContactoDAO.queryContacto(null, null);
		List<Contacto> lcontacto = new ArrayList<Contacto>();

		for (orm.Contacto contactoUrm : listaURM) {
			Contacto contactoadd = new Contacto();
			contactoadd.setUid(contactoUrm.getUid());
			contactoadd.setNombre(contactoUrm.getNombre());
			contactoadd.setApellido(contactoUrm.getApellido());
			contactoadd.setMail(contactoUrm.getMail());
			contactoadd.setTelefono(contactoUrm.getTelefono());
			contactoadd.setCargo(contactoUrm.getCargo());
			contactoadd.setDirrecion(contactoUrm.getDirrecion());
			contactoadd.setRut(contactoUrm.getRut());

			lcontacto.add(contactoadd);
		}

		return lcontacto;
	}

	public static String eliminar(Contacto contacto) throws PersistentException {

		String eliminar = "";
		PersistentTransaction t = orm.EjercicioPersistentManager.instance()
				.getSession().beginTransaction();
		try {
			orm.Contacto oRMEntidad = orm.ContactoDAO.loadContactoByQuery(
					"rut = '" + contacto.getRut() + "'", null);
			orm.ContactoDAO.delete(oRMEntidad);
			t.commit();
			System.out.println("contacto " + eliminar + " eliminado");
		} catch (Exception e) {
			t.rollback();
		}
		return eliminar;
	}

	public static String Actualizar(Contacto contacto)
			throws PersistentException {
		String cambio = "contacto " + contacto.getNombre() + " cambiado";
		PersistentTransaction t = orm.EjercicioPersistentManager.instance()
				.getSession().beginTransaction();
		try {
			orm.Contacto oRMEntidad = orm.ContactoDAO
					.getContactoByORMID(contacto.getUid());

			oRMEntidad.setUid(contacto.getUid());
			oRMEntidad.setNombre(contacto.getNombre());
			oRMEntidad.setApellido(contacto.getApellido());
			oRMEntidad.setMail(contacto.getMail());
			oRMEntidad.setTelefono(contacto.getTelefono());
			oRMEntidad.setCargo(contacto.getCargo());
			oRMEntidad.setDirrecion(contacto.getDirrecion());

			oRMEntidad.setRut(contacto.getRut());

			orm.ContactoDAO.save(oRMEntidad);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return cambio;
	}

}
