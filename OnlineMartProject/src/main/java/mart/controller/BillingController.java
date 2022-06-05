package mart.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mart.dao.CustomerDao;
import mart.model.productModel;

/**
 * Servlet implementation class BillingController
 */
@WebServlet("/BillingController")
public class BillingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillingController() {
        super();
      }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			List<productModel> listlog=new ArrayList<productModel>();
		
		CustomerDao cd1=new CustomerDao();
		listlog=(List<productModel>)cd1.displaycartItems();
	    //listlog=(List<productModel>) cd.displaycartItems();
	    
	    HttpSession session = request.getSession();
		session.setAttribute("cartitem", listlog);
		response.sendRedirect("billing.jsp");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
