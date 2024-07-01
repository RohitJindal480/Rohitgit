package Javaprograms;

public class TestMethod {
    String dog;
    String men;
	
    
    public void bark(){
    	System.out.println("Dog is barking whose name is "+dog);
    }
    
    public void walk(){
    	System.out.println("Men is walking whose name is"+men);
    }
	public static void main(String[] args) {
		
		TestMethod t1=new TestMethod();
		t1.dog="Pitbull";
		t1.men="Rahul Gandhi";
		t1.bark();
		t1.walk();

	}

}
