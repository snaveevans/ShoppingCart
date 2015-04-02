package co.tylerevans;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class SimpleServlet extends HttpServlet {
	String appName = "My Application";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		if(name != null)
			resp.getWriter().write("Hello " + name);
		else
			resp.getWriter().write("Please enter a name value");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		if(name != null && name != "")
			resp.getWriter().write("Hello " + name);
		else
			throw new ServletException("A Name should be Entered");
	}
}
