/***************************************************
Author:  Christopher Emanuel
Filename: Main.java
Specifications:  Develop a Public Transit Application based on the given scenario.
For: CS 2365 - Object Oriented Programming Section 001
Collaborated with Chris Emanuel and Luis Garcia
****************************************************/

/** NAME: Main
 PURPOSE: Main class
 INVARIANT: Main file
*/
class Main {
  public static void main(String[] args) {
		  CustomerFile fyle= new CustomerFile();
			fyle.readcustomerfile("newcustomers.txt");
			fyle.readorderstxt("orders.txt");
			
			System.out.println(fyle.getcount_of_customer());
			System.out.println("newcustomers.txt\n");
		for(int i=0; i<=(fyle.getcount_of_customer()-1); i++)
		{
			System.out.println(fyle.Array_of_customer[i].toString());
			
		}
		System.out.println("\n");

		System.out.println("orders.txt\n");
		for(int i=0; i<=(fyle.getcount_of_customer()-1); i++)
		{
		System.out.println(fyle.order[i].toString());

		}
		System.out.println("\ncustomerorders.txt successfully written\n");
		fyle.writecustomerorders();
		}
  }

