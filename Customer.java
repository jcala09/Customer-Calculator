import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

/** NAME:Customer
 PURPOSE: Customer with their information
 INVARIANT:none
*/
public class Customer{

	//  variables
  private String Name_of_First;
	private String Name_of_Last;
  private String Type_O_Customer;
	private String Address_of_Email;
	public double discount;
	private String Number_of_Phone;
	private double Pass_o_week=50;
	private double Pass_o_month=100;
	private double middle_o_week;
	private double end_o_week;

	
		/** NAME:Customer
 PARAMETERS: variable names
 PURPOSE: constructor
 PRECONDITION: none
 POSTCONDITION: creates an object
*/
  public Customer(String Name_of_First, String Name_of_Last, String Type_O_Customer, String Address_of_Email, String Number_of_Phone) {
    setName_of_First(Name_of_First);
		setName_of_Last(Name_of_Last);
		setType_O_Customer(Type_O_Customer);
		setAddress_of_Email(Address_of_Email);
	
		setNumber_of_Phone(Number_of_Phone);

  } 

		/** NAME:Customer
 PARAMETERS: none
 PURPOSE: Default constructor
 PRECONDITION: none
 POSTCONDITION: creates an object
*/
  public Customer() {
    setName_of_First("Name_of_First");
    setName_of_Last("Name_of_Last");
		setType_O_Customer("Type_O_Customer");
		setAddress_of_Email("Address_of_Email");
		setdiscount(0.0);
    setNumber_of_Phone("000-000-0000");
		Pass_o_week=50;
  }

	

	/** NAME: Customer
 PARAMETERS:obj
 PURPOSE: For function copy
 PRECONDITION:An object should have already been constructed
 POSTCONDITION:copy the exact object to a new object
*/
  public Customer (Customer obj) {
    setName_of_First(obj.Name_of_First);
		setName_of_Last(obj.Name_of_Last);
		setType_O_Customer(obj.Type_O_Customer);
		setAddress_of_Email(obj.Address_of_Email);
		setdiscount(obj.discount);
		setNumber_of_Phone(obj.Number_of_Phone);
  }

  public Customer(String Name_of_First, String Name_of_Last, String Type_O_Customer, String Address_of_Email, double discount, String Number_of_Phone) {
    setName_of_First(Name_of_First);
		setName_of_Last(Name_of_Last);
		setType_O_Customer(Type_O_Customer);
		setAddress_of_Email(Address_of_Email);
		setdiscount(discount);
		setNumber_of_Phone(Number_of_Phone);}


//getters
public String getName_of_First() {
    return this.Name_of_First;
  }

  public String getName_of_Last() {
   return this.Name_of_Last;
  }

  public String getType_O_Customer() {
    return this.Type_O_Customer;
  }

	public String getAddress_of_Email() {
    return this.Address_of_Email;
  }

	public double getdiscount() {
    return this.discount;
  }

	public String getNumber_of_Phone() {
    return this.Number_of_Phone;
  }
		public double getmiddle_o_week()
	{
		return this.middle_o_week;
	}
	public double getend_o_week()
	{
		return this.end_o_week;
	}
	public double getweeklypass()
	{
		return this.Pass_o_week;
	}

	public double getmonthlypass()
	{
		return this.Pass_o_month;
	}

//setters
  public void setName_of_First(String Name_of_First) {
    this.Name_of_First = Name_of_First;
  }

  public void setName_of_Last(String Name_of_Last) {
    this.Name_of_Last= Name_of_Last;
  }

  public void setType_O_Customer(String Type_O_Customer) {
    this.Type_O_Customer= Type_O_Customer;
  }

	public void setAddress_of_Email(String Address_of_Email) {
    this.Address_of_Email= Address_of_Email;
  }

	public void setdiscount(double Discount	) {
    this.discount= Discount;
  }

	public void setNumber_of_Phone(String Number_of_Phone	) {
    this.Number_of_Phone= Number_of_Phone;
  }



/** NAME: toString()
 PARAMETERS: none
 PURPOSE: make a tostring to write on the .txt file
 PRECONDITION: attributes should have assignments on them
 POSTCONDITION: returns string 
*/
  public String toString() {
    return (this.getName_of_First() + "\n" + this.getName_of_Last() + "\n" + this.getType_O_Customer() + "\n" +  this.getAddress_of_Email() + "\n" +  "\n" + this.getNumber_of_Phone() + "\n");
  }
}

  