package business.logic.builder;

public abstract class AProductBuilder {

	protected Product policy;

	public void createNewPolicy() {
		policy = new Product();
	}
	
	public Product getPolicy(){
		return policy;
	}

	public abstract void buildThirdParty();

	public abstract void buildInsuranceObject();

}
