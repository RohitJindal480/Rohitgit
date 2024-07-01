package Javaprograms;

//Parametrized and Non parameterized methods

public class Testcalculater {
 
	int a=20;
	int b=10;
	
   public void sum(int x, int y){// parameterized method
	   
	   int z=x+y;
	   System.out.println("Sum is: "+z);
	   
   }
   
   public void subt(){// Non parameterized
	   int c=a-b;
	   System.out.println("Subt of two numbers is "+c);
   }
	public static void main(String[] args){
		
		Testcalculater tc1=new Testcalculater();
		tc1.subt();
		tc1.sum(50,30);
	}


}
