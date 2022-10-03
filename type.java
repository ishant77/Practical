package practice2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class type {
	String name,product,type;
	int age,pro;
	static int countcol,countdabur,countpep;
	Scanner sc=new Scanner(System.in);
	public type() {
		System.out.println("Enter the name: ");
		this.name=sc.nextLine();
		System.out.println("Enter the age: ");
		this.age=sc.nextInt();
		System.out.println("Enter product type 1 for colgate, 2 for pepsodent or 3 for dabur: ");
		sc.nextLine();
		this.pro=sc.nextInt();
		if(age<18) {
			this.type="children";
		}
		else {
			System.out.println("customer type male female or children: ");
			sc.nextLine();
			this.type=sc.nextLine();	
		}
		
		if (this.pro==1) {
			this.product="Colgate";
			countcol++;
			}
		
		else if (this.pro==2) {
			this.product="Pepsodent";
			countpep++;
			
		}
			
		else if(this.pro==3){
			this.product="dabur";
			countdabur++;
		}

	}
	public static void max() {
		String pro;
		int max1=Collections.max(Arrays.asList(countcol,countpep,countdabur));
		if (max1==countcol)
			pro="colgate";
		else if(max1==countpep)
			pro="pepsodent";
		else
			pro="dabur";
			
		
		System.out.println("max usage is of product: "+pro+" which is "+ max1);
	}
	
}

