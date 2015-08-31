package business.cleaning.enums;

public enum Event  {
	
	UNDEFINED("Undefined"), 
	REJECTING("Rejecting"), 
	RENOUNCE("Renounce"), 
	RENEW("Renew");

	private String name;

	private Event(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
