package business.cleaning.enums;

public enum SalesChannel {
	
	TELEMARKETING("TMK telemarketing"),
	HALL("venta por hall "),
	INTERNET("venta por internet");
	
	private String name;
	private SalesChannel (String name){
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
