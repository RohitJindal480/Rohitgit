//calling return type=int(primitive) and array

package Javaprograms;

public class TestNameMain {

	public static void main(String[] args) {
    TestName.printName();
    int phoneNumber=TestName.getNumber();
    System.out.println("Received phone number "+phoneNumber);
	
	int[] arrays=TestName.getNumbers();
	
	for(int i=0;i<arrays.length;i++)
	{
		System.out.print(arrays[i]+" ");
		
	}
	
	
	}

}
