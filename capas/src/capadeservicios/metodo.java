package capadeservicios;

import java.util.List;

import org.orm.PersistentException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import capadenegocio.Contacto;
import capadenegocio.Usuario;

public class metodo {

	public String listar(String listar) {
		String salida = "";
		Contacto contacto = new Contacto();
		Gson gson = new GsonBuilder().create();
		try {
			List<Contacto> contactos = contacto.mostrar();
			salida = gson.toJson(contactos);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salida;

	}


	  public String eliminarContacto(String nombre,String apellido) {
	        String respuesta = "";
	        Contacto contacto = new Contacto();
	        contacto.setNombre(nombre);
	        contacto.setApellido(apellido);

	        try {
	            Contacto.eliminar(contacto);
	      
	            }
	         catch (PersistentException ex) {
	        	// TODO Auto-generated catch block
	 			ex.printStackTrace();
	        }
	        return respuesta;
	    }
	  
	   public String agregarContacto(String nombre,String apellido,String mail,String telefono){
	        String respuesta = "no se pudo almacenar el contacto";
	        
	        Contacto contacto = new Contacto();
	        contacto.setNombre(nombre);
	        contacto.setApellido(apellido);
	        contacto.setTelefono(telefono);
	        contacto.setMail(mail);


	        try {
	            Contacto.ingresar(contacto);
	           
	        } catch (PersistentException ex) {
	        	// TODO Auto-generated catch block
	 			ex.printStackTrace();
	        }
	        return respuesta;
	    }
	   
	   public String editarContactoServicioWeb(int uid,String nombre,String apellido,String mail,String telefono) {

	        String respuesta = "";
	    
	        Contacto contacto = new Contacto();
	        contacto.setUid(uid);
	        contacto.setNombre(nombre);
	        contacto.setApellido(apellido);
	        contacto.setTelefono(telefono);

	        try {
	         Contacto.Actualizar(contacto);
	          
	        } catch (PersistentException ex) {
	        	// TODO Auto-generated catch block
	 			ex.printStackTrace();
	        }
	        return respuesta;
	    }
	   
	   public String listaru(String listar) {
			String salida = "";
			Usuario usuario = new Usuario();
			Gson gson = new GsonBuilder().create();
			try {
				List<Usuario> usuarios = usuario.mostrar();
				salida = gson.toJson(usuarios);

			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return salida;

		}
		public String eliminarUsuario(int uid) {
	        String respuesta = "";
	        Usuario usuario= new Usuario();
	        usuario.setUid(uid);

	        try {
	            Usuario.eliminar(usuario);
	      
	            }
	         catch (PersistentException ex) {
	        	// TODO Auto-generated catch block
	 			ex.printStackTrace();
	        }
	        return respuesta;
	    }
		public String agregarUsuario(String nickname,String password){
	        String respuesta = "no se pudo almacenar el usuario";
	        
	        Usuario usuario = new Usuario();
	        usuario.setnickname(nickname);
	        usuario.setpassword(password);
	                try {
	            Usuario.ingresar(usuario);
	           
	        } catch (PersistentException ex) {
	        	// TODO Auto-generated catch block
	 			ex.printStackTrace();
	        }
	        return respuesta;
	    }
		 public String editarUsuarioServicioWeb(int uid,String nickname,String password) {

		        String respuesta = "";
		    
		        Usuario usuario = new Usuario();
		        usuario.setUid(uid);
		        usuario.setnickname(nickname);
		        usuario.setpassword(password);
		        try {
		         Usuario.Actualizar(usuario);
		          
		        } catch (PersistentException ex) {
		        	// TODO Auto-generated catch block
		 			ex.printStackTrace();
		        }
		        return respuesta;
		    }
	
	
	
	

	
	
}
