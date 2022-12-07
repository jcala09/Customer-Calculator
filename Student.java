/** NAME: Student
 PURPOSE: Customer Subclass
 INVARIANT: Name_of_school
*/
public class Student extends Customer{
private String Name_of_school;
public double middle_o_week=2;
	public double end_o_week=1.2;
	public double Pass_o_week=50*.85;
	public double Pass_o_month=100 *.85;

	
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
	//
	public Student(String Name_of_First, String Name_of_Last, String Type_O_Customer, String Name_of_school, String Address_of_Email, String Number_of_Phone)
	{
		super(Name_of_First,Name_of_Last,Type_O_Customer,Address_of_Email,Number_of_Phone);
		this.Name_of_school=Name_of_school;

	}


	public String toString() {
    return (this.getName_of_First() + " " + this.getName_of_Last() + "," + this.getType_O_Customer() +" at "+ Name_of_school +  "," +  this.getAddress_of_Email() + ","    + this.getNumber_of_Phone() + ",");
  }
}
	//