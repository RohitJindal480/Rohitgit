//calling static and non static methods

package Javaprograms;

public class TestBankCustomer {

	public static void main(String[] args) {
		BankManager.managerName="Arpit";
		BankManager.createAccount();
		
		Customer c1=new Customer();
		c1.name="Sanket";
		c1.accountNo=1725753753;
		c1.withdraw();
		
		Customer c2=new Customer();
		c2.name="Rajinder";
		c2.accountNo=47868475;
		c2.withdraw();
		
	}

}
