package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;

import capadenegocio.Usuario;

/**
 * Servlet implementation class IngresarU
 */
public class IngresarU extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarU() {
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
		Usuario usuario = new Usuario();
		  
		  usuario.setnickname(request.getParameter("nickname"));
		  usuario.setpassword(request.getParameter("password"));

		  try{
		  usuario.ingresar(usuario);
		  }catch (PersistentException e) {
		  	e.printStackTrace();
		 }
		  RequestDispatcher rd = request.getRequestDispatcher("IngresarU.jsp");
		  rd.forward(request, response);// TODO Auto-generated method stub
	}

}
