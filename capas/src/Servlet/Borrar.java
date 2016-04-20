package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import capadeservicios.Metodo;

/**
 * Servlet implementation class Borrar
 */
public class Borrar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Borrar() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.getAttribute("usuario");

		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");

		Metodo contacto = new Metodo();
		contacto.eliminarContacto(nombre, apellido); // TODO Auto-generated
														// method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.getAttribute("usuario");
		Borrar B = new Borrar();

		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");

		B.Letras(nombre);
		B.Letras(apellido);

		if (nombre.trim().equals("") || apellido.trim().equals("")) {
			System.out.println("variable vacia");

		} else {
			if (nombre.length() > 100 && apellido.length() > 100) {
				System.out.println("Los campos ingresados sobrepasan el límite de caracteres permitidos...");

			} else {

				if (nombre.equals(null) || apellido.equals(null)) {

					System.out.println("variable vacia");

				} else {
					Metodo contacto = new Metodo();
					contacto.eliminarContacto(nombre, apellido); // TODO
																	// Auto-generated
																	// method
					RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
					rd.forward(request, response);												// stub
				}
			}
		}
	}

	public boolean Letras(String cad) {
		for (int i = 0; i < cad.length(); i++)
			if (Character.isLetter(cad.charAt(i))) {
				return true;
			}
		return false;
	}
}
