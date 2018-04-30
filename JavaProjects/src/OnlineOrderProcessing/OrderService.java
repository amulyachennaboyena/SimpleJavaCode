package OnlineOrderProcessing;

import java.util.Scanner;

public class OrderService {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Product[] products = new Product[3];

for(int i=0;i<products.length;i++) {
	products[i] = new Product();
	
}
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


for(int i=0;i<products.length;i++) {
	System.out.println(products[i].toString());
	
}


System.out.println("Please enter the product id");
Scanner sc = new Scanner(System.in);
int prdctId = sc.nextInt();
int newQuantity = 0;
System.out.println("Please enter the quantity");
int quntity = sc.nextInt();

for(int i=0;i<products.length;i++) {
	if(products[i].id == prdctId) {
		if(products[i].getQuantity()<quntity) {
			System.out.println("order cannot be processed");
		}
		else {
			System.out.println("order processed");
			Order order = new Order();
			order.setProductId(prdctId);
			order.setQuantity(quntity);
			order.setOrderId(1);
			newQuantity = products[i].getQuantity()-quntity;
			products[i].setQuantity(newQuantity);
			
            System.out.println(order.toString());
		}
		
	}
}
System.out.println("\n new list after the order \n");
for(int i=0;i<products.length;i++) {
	
	System.out.println(products[i].toString());
	
}

	}
}

