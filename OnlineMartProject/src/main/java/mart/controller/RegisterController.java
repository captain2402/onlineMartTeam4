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
import mart.model.RegistrationModel;


@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RegisterController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String name,email,phone,pass1,pass2
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone= request.getParameter("phone");
		String pass1=request.getParameter("pass1");
		String pass2=request.getParameter("pass2");
		
		PrintWriter out=response.getWriter();
		
		
		
		if(!(pass1.equals(pass2))) {
			out.println("Password Does Not Match!!!");
		}else {
			
			RegistrationModel rm=new RegistrationModel(name,email,phone,pass1);
			
			List<RegistrationModel> lreg=new ArrayList<RegistrationModel>();
			lreg.add(rm);
			
			CustomerDao cd=new CustomerDao();
			
			int i=cd.saveData(lreg);
			
			if(i>0) {
				response.sendRedirect("Login.jsp");
			}else {
				System.out.println("not accepted!!!");
			}
			
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
