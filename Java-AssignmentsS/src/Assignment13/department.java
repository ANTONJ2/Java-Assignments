package Assignment13;

public class department extends transaction{
int dept_id;
int dept_amount;
public department(int dept_id, int dept_amt){
	super(5,7000,"buff");
	this.dept_id=dept_id;
	this.dept_amount=dept_amt;
	super.showval();//calling the super constructor
	showval();
}
public void showval() {
	System.out.println("*******This is the showval method of department*********");
	System.out.println("department id is"+this.dept_id);
	System.out.println("department amount is "+this.dept_amount);
}
	public static void main(String[] args) {
		department d=new department(2,9000);
		
		
	}

}
