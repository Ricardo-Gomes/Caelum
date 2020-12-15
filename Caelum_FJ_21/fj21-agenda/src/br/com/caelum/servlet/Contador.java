package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Contador extends HttpServlet {

	private int contador = 0;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		{
			contador++;
		}

		PrintWriter print = response.getWriter();

		print.println("<html>");
		print.println("<body>");
		print.println("Contador agora é: "+ contador);
		print.println("</body>");
		print.println("</html>");
	}
}
