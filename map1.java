package practice2;
import java.util.*;

public class map1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		type ob;

		Map <Integer,type> value=new HashMap<Integer,type>();
		 System.out.println("Enter the no of survey members");
		 int a=sc.nextInt();
		 for(int i=1;i<=a;i++) {
			 value.put(i, new type());
		 }
		 for(Map.Entry<Integer,type> entry:value.entrySet()) {
			 int key=entry.getKey();
			 type a1=entry.getValue();
			 System.out.println(key+" Data:");  
	          System.out.println("Name: " + a1.name + "\nAge: " + a1.age + "\ngender: " + a1.type+"\nproduct usage: "+a1.product);
			 
		 }
		type.max();
	}

}
