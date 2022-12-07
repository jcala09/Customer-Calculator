/** NAME: Regular
 PURPOSE: Customer Subclass
 INVARIANT: Number_of_Reward
*/ 

//rates
public class Regular extends Customer{
private String Number_of_Reward;
public double weekdays=2.5;
	public double end_o_week=1.5;
	public double Pass_o_week=50* .95;
	public double Pass_o_month=100 *.95;

	
	public double getweekdays()
	{
		return this.weekdays;
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

	//
	public Regular(String Name_of_First, String Name_of_Last, String Type_O_Customer, String Number_of_Reward, String Address_of_Email, String Number_of_Phone)
	{
		super(Name_of_First,Name_of_Last,Type_O_Customer,Address_of_Email,Number_of_Phone);
		this.Number_of_Reward= Number_of_Reward;

	}


	public String toString() {
    return (this.getName_of_First() + " " + this.getName_of_Last() + "," + this.getType_O_Customer() +" "+ Number_of_Reward +  "," +  this.getAddress_of_Email() + ","    + this.getNumber_of_Phone() + ",");
  }
}
	//