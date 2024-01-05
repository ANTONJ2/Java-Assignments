package Assignment7;

class B{
	int bid;
	String bname;
	int amt;
	int sal;
	B(int id, String name, int Samt, int Bsal){
		bid=id;
		bname=name;
		amt=Samt;
		sal=Bsal;
	}
	public int getBid() {
		return bid;
	}
	
	public String getBname() {
		return bname;
	}
	
	public int getAmt() {
		return amt;
	}
	
	public int getSal() {
		return sal;
	}
	//method for printing 
	void print() {
		System.out.println("bid is :"+getBid());
		System.out.println("bid is :"+getBname());
		System.out.println("bid is :"+getAmt());
		System.out.println("bid is :"+getSal());
	}
	
	//second constructor
	B(String name, int salary){
		System.out.println("\n"+"this is second constructor");
		System.out.println("This is bname: "+name+ "\nThis is salary: "+ salary);
	}
}



public class assignment7 {

	public static void main(String[] args) {
		B b=new B(5, "jake",60, 700000);
		b.print();
		B c=new B("josh", 70000);
		

	}

}
