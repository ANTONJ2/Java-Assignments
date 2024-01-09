package Assignment13;

class transaction extends bank{

int t_id;
int t_amt;
String t_name;

public transaction(int t_id, int t_amt,String t_name) {
super(1,"star",500);
this.t_id=t_id;
this.t_amt=t_amt;
this.t_name=t_name;
super.showval();//calling the super constructor

}
public void showval(){
	System.out.println("**********This is the showval method of transaction*******");
	System.out.println("transaction id is  "+t_id);
	System.out.println("transaction amount is  "+t_amt);
	System.out.println("transaction name is  "+t_name);
}
}
