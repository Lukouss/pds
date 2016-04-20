package capadenegocio;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Usuario {
	
	private int uid;
	
	private String nickname;
	
	private String password;
	
	public Usuario() {

	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getnickname() {
		return nickname;
	}

	public void setnickname(String nickname) {
		this.nickname = nickname;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
//INGRESAR USUARIO
	/**
	 * 
	 * @param persona
	 * @return
	 * @throws PersistentException
	 */
	public static  String ingresar(Usuario persona) throws PersistentException {
		String ingreso = "Usuario "+persona.nickname+" ingresado";
		PersistentTransaction t = orm.EjercicioPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Usuario3 oRMusuario = orm.Usuario3DAO.createUsuario3();
			oRMusuario.setUid(persona.getUid());
			oRMusuario.setNickname(persona.getnickname());
			oRMusuario.setNickname(persona.getpassword());
			// Initialize the properties of the persistent object here
			orm.Usuario3DAO.save(oRMusuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		return ingreso;
	}
	//Metodo para listar a los usuarios
private static final int ROW_COUNT = 100;
	
	public List mostrar() throws PersistentException {
		List<orm.Usuario3> listaURM = orm.Usuario3DAO.queryUsuario3(null, null);
		List<Usuario> lUsuario = new ArrayList<Usuario>();
		
		for( orm.Usuario3 usuarioUrm: listaURM ) {			
			Usuario usuarioadd = new Usuario();
			usuarioadd.setUid(usuarioUrm.getUid());
			usuarioadd.setnickname(usuarioUrm.getNickname());
			usuarioadd.setpassword(usuarioUrm.getPassword());

			
			lUsuario.add(usuarioadd);
			}
		
		return lUsuario;
	}
	
	//Metodo para  eliminar a los usuarios
	public static String eliminar(Usuario usuario) throws PersistentException {
		
		String eliminar = "Usuario "+usuario.getnickname()+" eliminado";
		PersistentTransaction t = orm.EjercicioPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Usuario3 oRMusuario = orm.Usuario3DAO.loadUsuario3ByQuery("Usuario.nickname = '"+usuario.getnickname()+"' & Usuario.password = '"+usuario.getpassword()+"'", null);
			orm.Usuario3DAO.delete(oRMusuario);
			t.commit();
			System.out.println("Usuario "+ eliminar+ " eliminado");
		}
		catch (Exception e) {
			t.rollback();
		}
		return eliminar;
	}
//Metodo para actualizar a los usuarios
	public static String Actualizar(Usuario usuario) throws PersistentException {
		String cambio = "Usuario "+usuario.getnickname()+" cambiado";
		PersistentTransaction t = orm.EjercicioPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Usuario3 oRMusuario = orm.Usuario3DAO.loadUsuario3ByQuery("Usuario.nickname = '"+usuario.getnickname()+"' & Usuario.password = '"+usuario.getpassword()+"'", null);
		
			
			oRMusuario.setNickname(usuario.getnickname());
			oRMusuario.setPassword(usuario.getpassword());		
			orm.Usuario3DAO.save(oRMusuario);
			t.commit();
	}
	catch (Exception e) {
		t.rollback();
	}
	return cambio;
}
	
	public List buscar() throws PersistentException {
		Usuario usuario = new Usuario();
		List<orm.Usuario3> listaURM = orm.Usuario3DAO.queryUsuario3("Usuario.nickname = '"+usuario.getnickname()+"' & Usuario.password = '"+usuario.getpassword()+"'", null);
		List<Usuario> lUsuario = new ArrayList<Usuario>();
		
		for( orm.Usuario3 usuarioUrm: listaURM ) {			
			Usuario usuarioadd = new Usuario();
			usuarioadd.setUid(usuarioUrm.getUid());
			usuarioadd.setnickname(usuarioUrm.getNickname());
			usuarioadd.setpassword(usuarioUrm.getPassword());

			
			lUsuario.add(usuarioadd);
			}
		
		return lUsuario;
	}
	
}
