package onlineOrderProcessing;

import java.util.Scanner;

public class OrderService {

	
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderService order = new OrderService();
		ProductDBStore db = new ProductDBStore();

System.out.println("Please enter the product id");
Scanner sc = new Scanner(System.in);
int prdctId = sc.nextInt();

System.out.println("Please enter the quantity");
int quntity = sc.nextInt();
System.out.println(db.takeProductDetails(prdctId, quntity));



	}
}

