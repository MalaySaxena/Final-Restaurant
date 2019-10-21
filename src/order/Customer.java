package order;

/*
 * This is customer class, here customer's behaviour is set up like
 * it's ID, Name, and Mobile number. 
 * For this various getter and setter are added. 
 * */
public class Customer {
	int customerID = 0;
	String customerName = null;
	String customerMobileNumber = null;

//getters
	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

//setters
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

}
