package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OiMundo extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.println("<html>");
		printWriter.println("<head>");
		printWriter.println("<title>Primeira Servlet</title>");
		printWriter.println("</head>");
		printWriter.println("<body>");
		printWriter.println("<h1>Oi mundo Servlet!</h1>");
		printWriter.println("</body>");
		printWriter.println("</html>");
	}
}
