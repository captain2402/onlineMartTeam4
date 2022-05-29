package mart.model;

public class RegistrationModel {
	
	private String name;
	private String email;
	private String phone;
	private String pass1;
	
	public RegistrationModel(String name,String email,String phone,String pass1) {
		super();
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.pass1=pass1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
