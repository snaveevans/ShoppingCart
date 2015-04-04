package co.tylerevans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<Product> products;
   
	@Override
	public void init() throws ServletException {
		products = new ArrayList<Product>();
		products.add(new Product("CDs"));
		products.add(new Product("DVDs"));
		products.add(new Product("Hard Drive"));
		products.add(new Product("SSD"));
		products.add(new Product("Video Card"));
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("products", products);
		request.getRequestDispatcher("/WEB-INF/products.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
