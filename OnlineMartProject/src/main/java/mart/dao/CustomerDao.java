package mart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import mart.model.LoginModel;
import mart.model.RegistrationModel;

public class CustomerDao {
	
	static Connection con;
	
	public int saveData(List<RegistrationModel> lreg) {
		int i=0;
		
		con=MyConnection.myConnection();
		RegistrationModel reg=lreg.get(0);
		try {
			PreparedStatement ps=con.prepareStatement("insert into mCustomer values(?,?,?,?)");
			ps.setString(1, reg.getName());
			ps.setString(2, reg.getEmail());
			ps.setString(3, reg.getPhone());
			ps.setString(4, reg.getPass1());
			
			i=ps.executeUpdate();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return i;
	}
	
	public boolean validate(List<LoginModel> listlog) {
		boolean b=false;
		LoginModel lm=listlog.get(0);
		con=MyConnection.myConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from mCustomer where phone=? and pass=? ");

			ps.setString(1, lm.getPhone());
			ps.setString(2, lm.getPass1());

			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("validation successful");
				b=true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return b;
	}
	
	public List<RegistrationModel> displayAll(){
		List<RegistrationModel> lst=new LinkedList<RegistrationModel>();
		con=MyConnection.myConnection();
		
		String query="select * from mCustomer";
		
		try {
			
			Statement stat=con.createStatement();
			ResultSet result=stat.executeQuery(query);
			
			while(result.next()) {
				lst.add(new RegistrationModel(result.getString(1),result.getString(2),result.getString(3),result.getString(4)));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return lst;
	}
	
	public RegistrationModel searchRecord(String phone){
//		List<RegistrationModel> lst=null;
		con=MyConnection.myConnection();
		RegistrationModel rm=null;
		try {
			
			PreparedStatement ps=con.prepareStatement("select * from mCustomer where phone=?");

			ps.setString(1,phone );
			
			ResultSet result=ps.executeQuery();
			
			if(result.next()) {
				 rm=new RegistrationModel(result.getString(1),result.getString(2),result.getString(3),result.getString(4));
//				lst=new ArrayList<RegistrationModel>();
//				lst.add(rm);	
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return rm;
	}

}
