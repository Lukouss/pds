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
import javax.servlet.http.HttpSession;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import capadenegocio.Contacto;
import capadeservicios.Metodo;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.getAttribute("usuario");

		PrintWriter out = response.getWriter();
		PersistentTransaction t = null;
		String nombre = "";
		String apellido = "";
		String mail = "";
		String telefono = "";
		String cargo = "";
		String dirrecion = "";
		String rut = "";

		Ingresar1 ingreso = new Ingresar1();

		try {
			nombre = request.getParameter("nombre");
			apellido = request.getParameter("apellido");
			mail = request.getParameter("mail");
			telefono = request.getParameter("telefono");
			rut = request.getParameter("rut");
			cargo = request.getParameter("cargo");
			dirrecion = request.getParameter("dirrecion");

			ingreso.validateEmail(mail);
			ingreso.esEntero(telefono);
			ingreso.Letras(nombre);
			ingreso.Letras(apellido);
			ingreso.Letras(cargo);
			ingreso.Letras(dirrecion);
			
			
			

			if (nombre.trim().equals("") || apellido.trim().equals("")
					|| mail.trim().equals("") || telefono.trim().equals("") || cargo.trim().equals("") || dirrecion.trim().equals("")) {
				System.out.println("variable vacia");
				RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
				rd.forward(request, response);
			} else {
				if (nombre.length() > 25 && apellido.length() > 25
						&& mail.length() > 30 && telefono.length() > 25 && cargo.length() > 25 && dirrecion.length() > 25) {
					System.out
							.println("Los campos ingresados sobrepasan el límite de caracteres permitidos...");
					RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
					rd.forward(request, response);
				} else {

					if (nombre.equals(null) || apellido.equals(null)
							|| mail.equals(null) || telefono.equals(null) || cargo.equals(null) || dirrecion.equals(null)) {

						System.out.println("variable vacia");
						RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
						rd.forward(request, response);
					} else {
						out.println(" Hola tu nombre es " + nombre
								+ ". Saludos!!!");

						Metodo ingresar = new Metodo();

						ingresar.agregarContacto(nombre, apellido, mail,
								telefono,cargo,dirrecion,rut);
						RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
						rd.forward(request, response);
					}

				}

			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Método que permite validar el formato de un mail
	 * 
	 * @param email
	 *            = cadena con el mail recibido
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
	 * Método que permite validar que el formato de la cadena ingresada sea
	 * numérico
	 * 
	 * @param cad
	 *            = cadena ingresada
	 * @return
	 */
	public boolean esEntero(String cad) {
		for (int i = 0; i < cad.length(); i++)
			if (Character.isDigit(cad.charAt(i))) {
				return true;
			}
		return false;
	}

	public boolean Letras(String cad) {
		for (int i = 0; i < cad.length(); i++)
			if (Character.isLetter(cad.charAt(i))) {
				return true;
			}
		return false;
	}

}
