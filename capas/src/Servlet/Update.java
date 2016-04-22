package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.orm.PersistentTransaction;

import capadeservicios.Metodo;

/**
 * Servlet implementation class Update
 */
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Update() {
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
		this.doPut(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPut(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.getAttribute("usuario");

		PrintWriter out = response.getWriter();
		PersistentTransaction t = null;
		//String uid = "";
		String nombre = "";
		String apellido = "";
		String mail = "";
		String telefono = "";
		String cargo = "";
		String dirrecion = "";
		String rut = "";

		Ingresar1 actualizar = new Ingresar1();

		try {
			//uid = request.getParameter("uid");
			nombre = request.getParameter("nombre");
			apellido = request.getParameter("apellido");
			mail = request.getParameter("mail");
			telefono = request.getParameter("telefono");
			rut = request.getParameter("rut");
			cargo = request.getParameter("cargo");
			dirrecion = request.getParameter("dirrecion");

			// actualizar.validateEmail(mail);
			// actualizar.esEntero(telefono);
			// actualizar.Letras(nombre);
			// actualizar.Letras(nombre);

			if (nombre.trim().equals("") || apellido.trim().equals("")
					|| mail.trim().equals("") || telefono.trim().equals("")
					|| cargo.trim().equals("") || dirrecion.trim().equals("")) {
				System.out.println("variable vacia");

			} else {
				if (nombre.length() > 20 || apellido.length() > 20
						|| mail.length() > 50 || telefono.length() > 20
						|| cargo.length() > 20 || dirrecion.length() > 30) {
					System.out.println("Los campos ingresados sobrepasan el límite de caracteres permitidos...");
				} else {

					if (nombre.equals(null) && apellido.equals(null)
							&& mail.equals(null) && telefono.equals(null)
							&& cargo.equals(null) && dirrecion.equals(null)) {
						System.out.println("variable vacia");

					} else {
						out.println(" Hola tu nombre es " + nombre
								+ ". Saludos!!!");

						Metodo ingresar = new Metodo();

						ingresar.editarContactoServicioWeb(1, nombre, apellido,
								mail, telefono, cargo, dirrecion, rut);

					}
				}

			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

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
			if (!Character.isDigit(cad.charAt(i))) {
				return false;
			}
		return true;
	}

	public boolean Letras(String cad) {
		for (int i = 0; i < cad.length(); i++)
			if (Character.isLetter(cad.charAt(i))) {
				return true;
			}
		return false;
	}

	// TODO Auto-generated method stub

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
