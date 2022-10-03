package ques2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class TestProduct {
	public static void main(String[] args) throws Exception {
		ProductLoader.loadProduct();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of Product :");
		String id=sc.nextLine();
		if(ProductLoader.searchProduct(id)!=null)
		{
			System.out.println(ProductLoader.searchProduct(id));
		}
		else {
			String productId = id;
            System.out.println("enter the name of product ");
            String product_name = sc.nextLine();
            
            System.out.println("enter the product price ");
            String price=sc.nextLine();
            
            System.out.println("enter the quantity ");
            String quantity =sc.nextLine();
            
            String str = "\n"+productId+","+product_name+","+price+","+quantity;
            
            String filename = "src/ques2/product.txt";
            BufferedWriter out = new BufferedWriter(new FileWriter(filename, true));
            
            out.write(str);
            out.close();
            
			
		}
		
		
	}

}
