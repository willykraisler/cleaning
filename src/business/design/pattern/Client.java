package business.design.pattern;



import business.cleaning.enums.Products;
import business.utils.EnumUtil;

public class Client {

	public static void main(String[] args) {
		
		Products product = EnumUtil.valueOf("PRODUCT1", Products.UNDEFINED);
		System.out.println(product.getProduct());
		
		
		
		
		//List<? extends  Integer> t = new ArrayList<Integer>();
		//Integer y = t.get(1);
	    //Products p = product.valOf("PRODUCT1");
	}

}
