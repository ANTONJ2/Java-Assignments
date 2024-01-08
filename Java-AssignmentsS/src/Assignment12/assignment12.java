package Assignment12;
//created human class with the following methods
class human{
	public static void sleep() {
		System.out.println("sleeping");
	}
	public static void eat() {
		System.out.println("eating");
	}
	public static void work() {
		System.out.println("Working");
	}
}
//created otherFunctionsofHuman and created read and speech functions and extended it with human. 
//All other methods inside human class are accessible now in otherFunctionsofHuman method. 
class otherFunctionsofHuman extends human{
	public static void read() {
		System.out.println("reading");
	}
	public static void speech() {
		System.out.println("speaking");
	}
	
	//created constructor of otherFunctionsofHuman so that before object creation all the methods will be called.
	otherFunctionsofHuman(){
		sleep();
		eat();
		work();
		read();
		speech();
	}
}
public class assignment12 {
	

	public static void main(String[] args) {
		otherFunctionsofHuman obj=new otherFunctionsofHuman();
		

	}

}
