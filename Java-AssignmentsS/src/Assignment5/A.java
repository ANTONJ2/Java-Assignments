package Assignment5;

public class A {

	public static void main(String[] args) {
		A a=new A();
		a.studentdetails("x");
		a.studentdetails(5);
		a.studentdetails("J", "S");
		a.studentdetails("J", "SCS",5 );

	}
//method overloading
	// here studentdetails has been overloaded with different signatures
	void studentdetails(String Name) {
		
		System.out.println(Name);
	}
	void studentdetails(String Name, String School) {
		
		System.out.println(Name+"  "+School);
	}
void studentdetails(String Name, String School, int ClassNO) {
		System.out.println(Name+School+ClassNO);
	}
void studentdetails(double CLassno) {
	
	System.out.println(CLassno);
}
	
	
	
	
}