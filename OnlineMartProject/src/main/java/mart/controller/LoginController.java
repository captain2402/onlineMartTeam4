package mart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mart.dao.CustomerDao;
import mart.model.LoginModel;
import mart.model.RegistrationModel;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String phone=request.getParameter("phone");
		String pass=request.getParameter("pass");
		
		LoginModel lm=new LoginModel(phone,pass);
		
//		lm.setPhone(phone);
//		lm.setPass1(pass);
		
		List<LoginModel> listlog=new ArrayList<LoginModel>();
		listlog.add(lm);
		
		CustomerDao cd=new CustomerDao();
		
		
		boolean b=cd.validate(listlog);
		if(b) {
			response.sendRedirect("home.jsp");
		}else {
			PrintWriter out=response.getWriter();
			out.println("Not matching...");
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
