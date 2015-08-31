package business.cleaning.enums;

import business.cleaning.interfaces.IGenEnum;
import business.logic.builder.AProductBuilder;
import business.logic.builder.ProductBanColombia;
import business.logic.builder.ProductBancoBogota;
import business.logic.builder.ProductUndefined;

public enum Products implements IGenEnum<Products> {

	UNDEFINED(new ProductUndefined()),
	PRODUCT1( new ProductBancoBogota()),
	PRODUCT2(new ProductBanColombia()),
	PRODUCT3(new ProductBancoBogota());
	

	private AProductBuilder product;
	
	public AProductBuilder getProduct() {
		return product;
	}

	public void setProduct(AProductBuilder product) {
		this.product = product;
	}

	private Products(AProductBuilder product) {
		this.product = product;
	}

	@Override
	public Products getUndefined() {
		return Products.UNDEFINED;
	}

	@Override
	public Products valOf(String key){
		return Products.valueOf(key);
	}
	

}
