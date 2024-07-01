//calling static and non static variables
package Javaprograms;

public class Employeecard {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.employeeName="Rohit Jindal";
		emp1.MobileNumber=12424225;
		Employee.companyName="infosys";
		Employee.hrMobileNumber=766576989;
		emp1.pritdetails();
		
		System.out.println("*************************");
		Employee emp2=new Employee();
		emp2.employeeName="Raman";
		emp2.MobileNumber=12424225;
		
		emp1.pritdetails();
		

	}

}
