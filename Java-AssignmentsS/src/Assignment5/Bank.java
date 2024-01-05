package Assignment5;

public class Bank {
	//variables
	int acc_no;
	String acc_name;
	int dep;
	int amt;
	int trans;
	//setvalue method to set the values
	public void setval() {	
		acc_no=5;
		acc_name="Josh";
		dep=1;
		amt=7;
		trans=5;
	}
	//Getvalue method to get the values
	public void getvalue() {
		System.out.println("ACC_NO."+acc_no);
		System.out.println("ACC_NAME "+acc_name);
		System.out.println("Amount :"+amt);
		System.out.println("Department "+dep);
		System.out.println("Transaction:"+trans);
	}

//getvalue and setvalue methods are called in the main method
	public static void main(String[] args) {

		Bank b=new Bank();
		b.setval();
		b.getvalue();

	}

}