//learning of method and object

package Javaprograms;

public class StudentCard {

	public static void main(String[] args) {//main method
		
		Student st1=new Student();
		st1.name="Rohit";
		st1.id=1189740;
		st1.printcard();
		
		
		Student st2=new Student();
		st2.name="Arpit";
		st2.id=786;
		System.out.println("*********************************");
		st2.printcard();
	}

}
