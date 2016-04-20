package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.orm.PersistentException;

import capadenegocio.Usuario;
import capadeservicios.Metodo;

/**
 * Servlet implementation class BorrarU
 */
public class BorrarU extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BorrarU() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.getAttribute("usuario");

		String nickname = request.getParameter("nickname");
		String password = request.getParameter("password");

		BorrarU bu = new BorrarU();

		bu.Letras(nickname);
		bu.Letras(password);
		if (nickname.trim().equals("") || password.trim().equals("")) {
			System.out.println("variable vacia");

		} else {
			if (nickname.length() > 100 && password.length() > 100) {
				System.out
						.println("Los campos ingresados sobrepasan el límite de caracteres permitidos...");

			} else {

				if (nickname.equals(null) || password.equals(null)) {

					System.out.println("variable vacia");

				} else {
					Metodo borrar = new Metodo();

					borrar.eliminarUsuario(nickname, password);
					RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
					rd.forward(request, response);// TODO Auto-generated method stub
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
