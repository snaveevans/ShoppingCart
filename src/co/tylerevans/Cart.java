package co.tylerevans;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = (String) request.getAttribute("action");
		
		if(action==null)
			action = "view";
		
		switch(action)
		{
		case "addToCart":
			
			break;
		case "emptyCart":
			
			break;
		}
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/Cart.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
