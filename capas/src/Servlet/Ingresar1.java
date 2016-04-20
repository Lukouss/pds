package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


import capadenegocio.Contacto;

/**
 * Servlet implementation class Ingresar1
 */
public class Ingresar1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ingresar1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		PersistentTransaction t = null;
		String nombre= "";
		String apellido= "";
		String mail= "";
		String telefono= "";

		Ingresar1 ingreso = new Ingresar1();
		
		try{
			nombre= request.getParameter("nombre");
			apellido= request.getParameter("apellido");
			mail= request.getParameter("mail");
			telefono= request.getParameter("telefono");

			ingreso.validateEmail(mail);
			ingreso.esEntero(telefono);
			
			if(nombre.trim().equals("")|| apellido.trim().equals("")||mail.trim().equals("")||
					telefono.trim().equals("")){
				System.out.println("variable vacia");
				
			}else{
				if (nombre.length() <=100 && apellido.length() <=100 && mail.length() <=50 && 
						telefono.length() <= 20 ){
					out.println(" Hola tu nombre es "+ nombre+ ". Saludos!!!");
					
					Contacto ingresar = new Contacto();
					ingresar.setNombre(nombre);
					ingresar.setApellido(apellido);
					ingresar.setMail(mail);
					ingresar.setTelefono(telefono);

					try {
						Contacto.ingresar(ingresar);
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.println("Los campos ingresados sobrepasan el límite de caracteres permitidos...");
				}
				
			}
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		
		
	}

	/**
	 * Método que permite validar el formato de un mail
	 * @param email = cadena con el mail recibido
	 * @return
	 */
	public boolean validateEmail(String email) {
		 
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
 
    }
	
	/**
	 * Método que permite validar que el formato de la cadena ingresada sea numérico
	 * @param cad = cadena ingresada
	 * @return
	 */
	public boolean esEntero(String cad){
		 for(int i = 0; i<cad.length(); i++)
		 if( !Character.isDigit(cad.charAt(i)) ){
			 return false;
		 }
		 return true;
	 }

}
