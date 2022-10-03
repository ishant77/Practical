package ques1;

import java.util.*;

class RegularMember{
	String name;
	int Memshipfees=0,Enrollfees=0,months;
	int servicechr=20000;
	public RegularMember(String name,int months) {
		this.name=name;
		this.months=months;
		
	}
	
	double CalculateBill(int noOfmonths) {
		System.out.println("Name: "+name);
		System.out.println("membership fees: "+Memshipfees);
		System.out.println("enrollment fees: "+Enrollfees);
		System.out.println("servicecharge fees: "+servicechr);
		double total=this.Memshipfees+this.Enrollfees+(this.servicechr*noOfmonths);
		System.out.println("Total bill for the member is: "+total);
		return total;
	}
}
class GoldMember extends RegularMember{
	int Memshipfees=90000,Enrollfees=10000,servicechr=10000;;
	public GoldMember(String name,int months){
		super(name,months);
	}
		@Override
		double CalculateBill(int noOfmonths) {
			System.out.println("Name: "+name);
			System.out.println("membership fees: "+this.Memshipfees);
			System.out.println("enrollment fees: "+this.Enrollfees);
			System.out.println("servicecharge fees (fees applicable if months>6) : "+this.servicechr);
			double total;
			if (noOfmonths>6) {
				total=this.Memshipfees+this.Enrollfees;
			}
			else {
				total=this.Memshipfees+this.Enrollfees+((noOfmonths-6)*this.servicechr);		
		}
			System.out.println("Total bill for the member is: "+total);
			return total;
		
		
	}
}
class SilverMember extends RegularMember{
	int Memshipfees=15000,Enrollfees=5000,servicechr=20000;;
	public SilverMember(String name,int months){
		super(name,months);
	}
	@Override
	double CalculateBill(int noOfmonths) {
		System.out.println("Name: "+name);
		System.out.println("membership fees: "+this.Memshipfees);
		System.out.println("enrollment fees: "+this.Enrollfees);
		System.out.println("servicecharge fees (fees applicable if months>6) : "+this.servicechr);
		double total;
		if (noOfmonths>6) {
			total=this.Memshipfees+this.Enrollfees;
		}
		else {
			total=this.Memshipfees+this.Enrollfees+((noOfmonths-6)*this.servicechr);
	}
		System.out.println("Total bill for the member is: "+total);
		return total;	
}
	
}


public class golf {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type of membership you want gold,regular or silver :");
		String a=sc.nextLine();
		System.out.println("Enter the name :");
		String b=sc.nextLine();
		System.out.println("Enter the no of months :");
		int c=sc.nextInt();
		RegularMember ob;
		switch(a) {
		case "regular":
			ob=new RegularMember(b,c);
			ob.CalculateBill(c);
			break;
		case "gold":
			ob=new GoldMember(b,c);
			ob.CalculateBill(c);
			break;
		default:
			ob=new SilverMember(b,c);
			ob.CalculateBill(c);
			break;
			
		}
		
		
		
		
		
		
		
	}

}
