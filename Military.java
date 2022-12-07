/** NAME: Military
 PURPOSE: Customer Subclass
 INVARIANT: branch
*/
public class Military extends Customer{
	// instance variable
private String branch;
//rates
public double middle_o_week=2.3;
	public double end_o_week=1.3;
	public double Pass_o_week=50 * .9;
	public double Pass_o_month= 100* .9;

	

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



	/** NAME: toString()
 PARAMETERS: none
 PURPOSE:  returns string for .txt file
 PRECONDITION: object atributes must have values
 POSTCONDITION: returns string
*/
public String toString() {
   return (this.getName_of_First() + " " + this.getName_of_Last() + "," + this.getType_O_Customer() +" in "+ branch +  "," +  this.getAddress_of_Email() + ","    + this.getNumber_of_Phone() + ",");
  }
	
	


	/** NAME: Military
 PARAMETERS: customer attributes
 PURPOSE: takes input to instance variable 
 PRECONDITION: none
 POSTCONDITION: military subclass is initialized
*/
	public Military(String Name_of_First, String Name_of_Last, String Type_O_Customer, String branch, String Address_of_Email, String Number_of_Phone)
	{
		super(Name_of_First,Name_of_Last,Type_O_Customer,Address_of_Email,Number_of_Phone);
		this.branch= branch;
	}
}