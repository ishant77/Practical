package ques2;

import java.io.*;
import java.util.*;

class ProductLoader{
	private static List<Product> ls=new ArrayList<>();
	public static void loadProduct() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("src/ques2/product.txt")));
        ls.clear();
        String line;
        while((line=br.readLine())!=null) {
        	String starr[]=line.split(",");
        	Product pr=new Product(starr[0],starr[1],Double.parseDouble(starr[2]),Integer.parseInt(starr[3]));
        	ls.add(pr);
        }       
	}
	public static List<Product> getProductList(){
		return ls;
	}
	public static Product searchProduct(String productID) {
		List<Product> temp=getProductList();
		for (Product p : temp) {
			if(p.productID.equals(productID)) {
				return p;
			}
		}
		return null;
		
	}
	
	
	
}

public class Product {
String productID,productName;
double price;
int quantity;
public Product(String productID,String productName,double price,int quantity) {
	this.productID=productID;
	this.productName=productName;
	this.price=price;
	this.quantity=quantity;
}
public String getProductID() {
	return productID;
}


public String getProductName() {
	return productName;
}


public double getPrice() {
	return price;
}


public int getQuantity() {
	return quantity;
}

@Override
public String toString() {
	return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", quantity="
			+ quantity + "]";
}
public static void main(String[] args) throws Exception {
      
      ProductLoader.loadProduct();
      System.out.println(ProductLoader.searchProduct("P102"));
      
	
}


}
