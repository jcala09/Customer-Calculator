/**
 * NAME: Orders PURPOSE: Gets information from orders.txt and checks their
 * maximum amount of trips INVARIANT: none
 */
public class Orders {
	private String Number_o_Order;
	private String FIRSTNAME;
	private String Number_of_Phone;
	private String WEEKDAY_TRIP; // MaxTripsWeekday
	private String WEEKEND_TRIP; // maxtripsweekend
	private String MONTH_TRIP; // max travel weeks per month

	public Orders(String FIRSTNAME, String Number_of_Phone, String WEEKDAY_TRIP, String WEEKEND_TRIP, String MONTH_TRIP) {
		setFIRSTNAME(FIRSTNAME);
		setNumber_of_Phone(Number_of_Phone);
		setWEEKDAY_TRIP(WEEKDAY_TRIP);
		setWEEKEND_TRIP(WEEKEND_TRIP);
		setMONTH_TRIP(MONTH_TRIP);
	}

	public String toString() {
		return (FIRSTNAME + " " + Number_of_Phone + "\n Weekday Maximum Trips:" + WEEKDAY_TRIP
				+ "\n Weekend Maximum Trips: " + WEEKEND_TRIP + " \nMonthly Maximum Trips:" + MONTH_TRIP
				+ "\n----------------\n");

	}

	// getters
	public String getNumber_o_Order() {
		return this.Number_o_Order;
	}

	public String getFIRSTNAME() {
		return this.FIRSTNAME;
	}

	public String getNumber_of_Phone() {
		return this.Number_of_Phone;
	}

	public String getWEEKDAY_TRIP() {
		return this.WEEKDAY_TRIP;
	}

	public String getWEEKEND_TRIP() {
		return this.WEEKEND_TRIP;
	}

	public String getMONTH_TRIP() {
		return this.MONTH_TRIP;
	}

	// setters
	public void setNumber_o_Order(String Number_o_Order) {
		this.Number_o_Order = Number_o_Order;
	}

	public void setFIRSTNAME(String FIRSTNAME) {
		this.FIRSTNAME = FIRSTNAME;
	}

	public void setNumber_of_Phone(String phonen) {
		this.Number_of_Phone = phonen;
	}

	public void setWEEKDAY_TRIP(String WEEKDAY_TRIP) {
		this.WEEKDAY_TRIP = WEEKDAY_TRIP;
	}

	public void setWEEKEND_TRIP(String WEEKEND_TRIP) {
		this.WEEKEND_TRIP = WEEKEND_TRIP;
	}

	public void setMONTH_TRIP(String MONTH_TRIP) {
		this.MONTH_TRIP = MONTH_TRIP;
	}
}
