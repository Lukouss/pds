package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.orm.PersistentException;









import capadenegocio.Contacto;

import java.io.PrintWriter;
/**
 * Servlet implementation class Servletmostrar
 */
//@WebServlet("/Servletmostrar") 
public class Servletmostrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletmostrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		 session.getAttribute("usuario");
		
		
		
		
		final int ROW_COUNT = 100;
		PrintWriter outs = response.getWriter();
		String salida = "";
		Contacto Contacto = new Contacto();
		try {
			List<Contacto> lcontacto = Contacto.mostrar();
			int length = Math.min(lcontacto.size(), ROW_COUNT);
			for (int i = 0; i < length; i++) {
				salida += (i + " .- Nombre: "+lcontacto.get(i).getNombre() + " .- apellido: "+lcontacto.get(i).getApellido());
			}
			outs.println(salida);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
			}
	}

