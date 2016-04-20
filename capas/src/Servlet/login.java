package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //me llega la url "proyecto/login/out"
        String action=(request.getPathInfo()!=null?request.getPathInfo():"");
        HttpSession sesion = request.getSession();
        if(action.equals("/out")){
            sesion.invalidate();
            response.sendRedirect("/home.jsp");
        }else{
 
        }
        // TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession sesion = request.getSession();
	     String usu, pass;
	     usu = request.getParameter("user");
	     pass = request.getParameter("password");
	     //deberíamos buscar el usuario en la base de datos, pero dado que se escapa de este tema, ponemos un ejemplo en el mismo código
	     // TODO Auto-generated method stub
	     if(usu.equals("admin") && pass.equals("admin")/* && sesion.getAttribute("usuario") == null*/){
	            //si coincide usuario y password y además no hay sesión iniciada
	            sesion.setAttribute("usuario", usu);
	            //redirijo a página con información de login exitoso
	            response.sendRedirect("loginExito.jsp");
	        }else{
	        	response.sendRedirect("LoginFallido.jsp");//lógica para login inválido
	        }
	}

}
