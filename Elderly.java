/** NAME: Elderly
 PURPOSE: Customer Subclass
 INVARIANT: year_of_birth
*/
public class Elderly extends Customer{
	private String year_of_birth;
	public double middle_o_week=1.8;
	public double end_o_week=1;
	public double Pass_o_week=50*.8;
	public double Pass_o_month=100*.8;

	

	//getters

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
	/** NAME: Elderly
 PARAMETERS: customer attributes
 PURPOSE: subclass
 PRECONDITION: customer must be initialized
 POSTCONDITION: elderly 
*/
	public Elderly(String Name_of_First, String Name_of_Last, String Type_O_Customer, String date_of_birth, String Address_of_Email, String Number_of_Phone)
	{
		super(Name_of_First,Name_of_Last,Type_O_Customer,Address_of_Email,Number_of_Phone);
		year_of_birth= date_of_birth;

	}


public String toString() {
   return (this.getName_of_First() + " " + this.getName_of_Last() + "," + this.getType_O_Customer() +" born in "+ year_of_birth +  "," +  this.getAddress_of_Email() + ","    + this.getNumber_of_Phone() + ",");
  }
	//
	  
}