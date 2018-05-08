package onlineOrderProcessing;

import java.util.Scanner;

public class ProductDBStore {
	
	String display;
	 public void setString(String display) {
			this.display = display;	
		    }
	 public String getString() {
		    	return display;
		    }
	 
	 
	 
	 public String takeProductDetails(int prdctId,int quntity ) {
	
		 
		 Product[] products = new Product[3];
System.out.println("list of available products");
	for(int i = 0;i<products.length;i++) {
		products[i] = new Product();
		
	}
	
	
	System.out.println("\n");
	products[0].setId(1);
	products[1].setId(2);
	products[2].setId(3);

	products[0].setQuantity(10);
	products[1].setQuantity(10);
	products[2].setQuantity(10);

	products[0].setPrice(100);
	products[1].setPrice(102);
	products[2].setPrice(103);

	products[0].setName("a");
	products[1].setName("b");
	products[2].setName("c");

	products[0].setDescription("abc");
	products[1].setDescription("bcd");
	products[2].setDescription("cde");


	for(Product i1: products) {
		System.out.println(i1.toString());
		
	}
	System.out.println("\n");
	  ProductDBStore db = new ProductDBStore();

      int newQuantity = 0;
      
      for(Product i2:products) {
	  if(i2.id == prdctId) {
		if(i2.getQuantity()<quntity) {
		return "order cannot be processed because quantity "+quntity+" is more than available quantity"+i2.getQuantity();
	
		}
		else {
			

			Order order = new Order();
			order.setProductId(prdctId);
			order.setQuantity(quntity);
			order.setOrderId(1);
			newQuantity = i2.getQuantity()-quntity;
			i2.setQuantity(newQuantity);
			
			return "order can be processed with productId   "+prdctId+"   quantity    "+quntity;
			
			
		}
		
	}


}
	return null;
	

}

}
