package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;

import capadenegocio.Usuario;

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
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		  
		  usuario.setnickname(request.getParameter("nickname"));
		  usuario.setpassword(request.getParameter("password"));

		  try{
		  usuario.eliminar(usuario);
		  }catch (PersistentException e) {
		  	e.printStackTrace();
		  }// TODO Auto-generated method stub
	}
	public boolean esEntero(String cad){
		 for(int i = 0; i<cad.length(); i++)
		 if( !Character.isDigit(cad.charAt(i)) ){
			 return false;
		 }
		 return true;
	 }

}
