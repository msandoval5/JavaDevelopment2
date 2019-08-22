package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue; 


public class Class1 {
	public String Name;
	public int Years;
	private String lastname;
	
	 public Class1(String n)
     {
         Name = n;
     }
	 public Class1(int years)
	 {
		 Years = years;
	 }
	 public static int Seq(int a)
     {
         int seq = 0;
         for (int i = 0; i <= a; i++)
         {
             seq = i;
             System.out.print(seq);
         }
         return seq;

     }
	 public static int Seq(int a, int b)
     {
         int seq = 0;
         for (int i = a; i <= b; i++)
         {
             seq = i;
             System.out.print(seq);
         }
         return seq;

     }
	
	 public String getLastName() {
		 return this.lastname;
	 }
	 public void setLastName(String lastname) {
		 this.lastname = lastname;
	 }
	 
	 
	 public void oddEven() {
		 //int j =-1;
		 List<Integer> even = new ArrayList<Integer>();
		 List<Integer> odd = new ArrayList<Integer>();
		 List<Integer> list=Arrays.asList(1,4,3,6,9,8,4,7,5,0,9,2,7,4,6,3,8,2,0,3);
		 
		 for (Iterator<Integer> iter = list.iterator(); iter.hasNext(); ) {
	            Integer number = iter.next();
	            if (number % 2 == 0) {
				 
				 even.add(number);
				 
				 
			 }else {
				 
				 odd.add(number);
				 
			 }
		 }
		 System.out.print(even.toString());
		 System.out.printf("%n");
		 System.out.print(odd.toString());
		 System.out.printf("%n");
	 }
	 
	 public void builder() {
		 StringBuilder pattern = new StringBuilder("");
		 String space = "";
		 for(int i=0;i<=20;i++) {
			 System.out.printf("%s%s\n", pattern,i);
	            if (i <=10)
	                pattern.append(" ");
	            else
	                pattern.setLength(pattern.length()-1);
		 }
		 
		 
	 }
	 
	 public static void main(String[] args) {
		 
		 Class1 c1 = new Class1("Mariana");
		 System.out.print(c1.Name);
		 System.out.printf("%n");
		 
		 Class1 c2 = new Class1(23);
		 System.out.print(c2.Years);
		 System.out.printf("%n");
		 
		 c1.setLastName("Sandoval");
		 System.out.print(c1.getLastName());
		 System.out.printf("%n");
		 
		 c1.oddEven();
		 c1.builder();
	 }

}
