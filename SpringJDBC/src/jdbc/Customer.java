package jdbc;

public class Customer {
	private Integer cid;
	private String cname;
	private String cmobile;

	public Customer() {

	}

	public Customer(Integer cid, String cname, String cmobile) {
		this.cid = cid;
		this.cname = cname;
		this.cmobile = cmobile;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCmobile() {
		return cmobile;
	}

	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}

}
