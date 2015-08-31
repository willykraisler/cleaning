package business.cleaning.enums;

public enum Collector {

	UNDEFINED("Undefined"), 
	VISA("product 1"), 
	MASTER_CARD("product 2");

	private String name;

	private Collector(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
