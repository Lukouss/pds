package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;

import capadenegocio.Usuario;

/**
 * Servlet implementation class MostarU
 */
public class MostarU extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostarU() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final int ROW_COUNT = 100;
		PrintWriter outs = response.getWriter();
		String salida = "";
		Usuario usuario = new Usuario();
		try {
			List<Usuario> lusuario = usuario.mostrar();
			int length = Math.min(lusuario.size(), ROW_COUNT);
			for (int i = 0; i < length; i++) {
				salida += (i + ".- Nombre: "+lusuario.get(i).getnickname());
			}
			outs.println(salida);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
