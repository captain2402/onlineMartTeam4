package mart.model;

public class LoginModel {
	
	private String phone;
	private String pass1;
	
	public LoginModel(String phone, String pass1) {
		super();
		this.phone = phone;
		this.pass1 = pass1;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPass1() {
		return pass1;
	}
	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}

}
