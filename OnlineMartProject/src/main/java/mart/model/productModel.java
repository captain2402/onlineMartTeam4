package mart.model;

public class productModel {
	
	private String pname;
	private String category;
	private int pid;
	private int cost;
	private int qut;
	public productModel(String pname, String category, int pid, int cost,int qut) {
		super();
		this.pname = pname;
		this.category = category;
		this.pid = pid;
		this.cost = cost;
		this.qut = qut;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQut() {
		return qut;
	}
	public void setQut(int qut) {
		this.qut = qut;
	}
	

}
