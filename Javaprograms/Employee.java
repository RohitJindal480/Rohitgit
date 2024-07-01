//static and non static data members 
package Javaprograms;

public class Employee {
      
	static String companyName;// Static data member
	String employeeName;//Non static data member
	static long hrMobileNumber;
	int MobileNumber;
	
	public void pritdetails() {
		System.out.println("Name of the company: "+companyName);
		System.out.println("Phone number of HR: "+hrMobileNumber);
		System.out.println("Name of the Employee: "+employeeName);
		System.out.println("Mobile number of Employee: "+MobileNumber);

	}

}
