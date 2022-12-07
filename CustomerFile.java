import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.NoSuchElementException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.lang.*;
import java.io.IOException;

/** NAME:CustomerFile
 PURPOSE: This class messes with the files. Reads and Writes
 INVARIANT: none
*/
public class CustomerFile {
	// variables
	private String Name_of_file;
	public Customer[] Array_of_customer;
	private Customer object_is_temp;
	private Orders object_is_temp2;
	public Orders[] order;
	private int count_of_customer;
	private int order_of_customercount;
	public String tempName_of_First;
	private String tempName_of_Last;
	private String temptype_of_customer;
	private String tempspecial_cust_type;
	private String tempAddress_of_Email;
	private String tempNumber_of_Phone;
	private int customer_array_size=0;
	private int order_size_array=0;
	public String numbe2r;
	// default constructor


	// getters
	public String getName_of_file() {
		return this.Name_of_file;
	}
	public int getArraysize()
	{
		return this.customer_array_size;
	}

	public Customer getArrayelement(int i)
	{
		return Array_of_customer[i];
	}

	public int getcount_of_customer()
	{
		return count_of_customer;
	}

/** NAME: CustomerFile
 PARAMETERS: 
 PURPOSE: default constructor 
 PRECONDITION: none
 POSTCONDITION: assigns values to constructors
*/
	public CustomerFile() {
		Name_of_file = "newcustomers.txt";
		Array_of_customer = new Customer[10];
		order= new Orders[10];
	}

/** NAME: readcustomerfile
 PARAMETERS: Name_of_file
 PURPOSE: read the file, and store the required stuff in array of objects
 PRECONDITION: the file must be found and has stuff in it
 POSTCONDITION: array of an object must have something, and exceptions are handled
*/

	public void readcustomerfile(String Name_of_file) {

		int i = 0;
		try { //FileNotFoundException
			File pointer = new File(Name_of_file);
			Scanner pointRead = new Scanner(pointer); // opens file
			count_of_customer= Integer.parseInt(pointRead.nextLine());
			try{ //ArrayIndexOutOfBoundsException	
			try{ //NoSuchElementException
			while (pointRead.hasNextLine()) 
			{
				
				tempName_of_First= pointRead.nextLine();
				tempName_of_Last= pointRead.nextLine();
				temptype_of_customer= pointRead.nextLine();
				// check if these are equal
				if(temptype_of_customer.equals("Senior"))
				{
					Array_of_customer[i]= new Elderly(tempName_of_First,tempName_of_Last,temptype_of_customer,pointRead.nextLine(),pointRead.nextLine(),pointRead.nextLine());
				
				}
				else if(temptype_of_customer.equals("Military"))
				{
					Array_of_customer[i]= new Military(tempName_of_First,tempName_of_Last,temptype_of_customer,pointRead.nextLine(),pointRead.nextLine(),pointRead.nextLine());
					
				}
				else if(temptype_of_customer.equals("Student"))
				{
					Array_of_customer[i]= new Student(tempName_of_First,tempName_of_Last,temptype_of_customer,pointRead.nextLine(),pointRead.nextLine(),pointRead.nextLine());
				
				}
				else if(temptype_of_customer.equals("Regular"))
				{
					Array_of_customer[i]= new Regular(tempName_of_First,tempName_of_Last,temptype_of_customer,pointRead.nextLine(),pointRead.nextLine(),pointRead.nextLine());
					
				}
				i++;
				customer_array_size++;
			}
				
			}
			catch(NoSuchElementException f) // if element isnt found
			{
				System.out.println("No such element exception,");
			}
			
		pointRead.close();
		} 
		catch(ArrayIndexOutOfBoundsException f) // if we go past array
		{
			return;
		}
		}
		catch (FileNotFoundException e) // if file dne
		{
			System.out.println("File not found.");
		}
		
		for (int k = 0; k < (count_of_customer-1); k++) //alphabetize by last name
        {
            for (int j = k + 1; j < customer_array_size; j++) { 
                if (Array_of_customer[k].getName_of_Last().compareTo(Array_of_customer[j].getName_of_Last())>0) 
                {
                    object_is_temp = Array_of_customer[k];
                    Array_of_customer[k] = Array_of_customer[j];
										object_is_temp2=  order[k];
										order[k]= order[j];
										order[j]= object_is_temp2;
                    Array_of_customer[j] = object_is_temp;
										
                }
            }
	}
	}


  /** NAME: writecustomerorders
 PARAMETERS: none
 PURPOSE: The function makes a new txt file for important stuff
 PRECONDITION: none
 POSTCONDITION: a txt file will be written
*/
	public void writecustomerorders()
	{
	try {
      FileWriter myWriter = new FileWriter("customerorders.txt");
			for(int i=0; i<customer_array_size;i++)
			{
		myWriter.write(Array_of_customer[i].toString());	
		myWriter.write(calculator(order[i],Array_of_customer[i]));
		myWriter.write("\n");
		}
		myWriter.close();
			}
     
     catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
     }
  }


	/**
NAME: readorderstxt
PARAMETERS: Name_of_file
PURPOSE: This function reads the file and stores it in an object array
PRECONDITION: txt file must exit and has stuff in it
POSTCONDITION: array must be stored
*/
	public void readorderstxt(String Name_of_file)
	{
		int i=0;
		try
		{
		File pointer = new File(Name_of_file);
		Scanner pointRead = new Scanner(pointer); // opens file
		order_of_customercount= Integer.parseInt(pointRead.nextLine()); // for for loop
			while (pointRead.hasNextLine()) // while stuff is readable
			{
			order[i]= new Orders(pointRead.next(),pointRead.next(),pointRead.next(),pointRead.next(),pointRead.next()); // put stuff in an object
			i++;
			}
			pointRead.close(); // close
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found"); 
		}
		for (int k = 0; k < (count_of_customer-1); k++) //alphabetize by last name
        {
            for (int j = k + 1; j < customer_array_size; j++) { 
                if (order[k].getFIRSTNAME().compareTo(order[j].getFIRSTNAME())>0) 
                {
                    
										object_is_temp2=  order[k];
										order[k]= order[j];
										order[j]= object_is_temp2;
                
                }
	}
				}
	}

	 
		
	

/** NAME: calculator
 PARAMETERS: orders j customer k
 PURPOSE: returns string
 PRECONDITION: both j and k have to obe filled
 POSTCONDITION: returns what the cheapest value is 
*/
public String calculator(Orders j, Customer k)
{

double answer3;
	double answer1= ((Integer.parseInt(j.getWEEKDAY_TRIP())*k.getmiddle_o_week()*5)+(Integer.parseInt(j.getWEEKEND_TRIP())*k.getend_o_week()))*Integer.parseInt(j.getWEEKDAY_TRIP());
	double answer2= Integer.parseInt(j.getMONTH_TRIP())*k.getweeklypass();
	if(Integer.parseInt(j.getMONTH_TRIP()) >=4)
	answer3= (Integer.parseInt(j.getMONTH_TRIP())/4)*k.getmonthlypass();
	else
	answer3= 10000;
if(answer1<answer2 && answer1<answer3 )
{
	return " PAYG Card at $" +  Double.toString(answer1/Integer.parseInt(j.getMONTH_TRIP())) + " a week";
}
else if(answer2<answer1 && answer2<answer3)
{
	return " Weekly Pass at $" + Double.toString(answer2) + " a week";
}
else if(answer3<answer2 && answer3<answer1){
	return "Monthly Pass at $" + Double.toString(answer3) + " a month";
}
else
{
	return "sheesh";
}
	}



}