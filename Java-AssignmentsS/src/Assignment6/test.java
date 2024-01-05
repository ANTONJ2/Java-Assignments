package Assignment6;
class Mydate{
	private int dd=5,mm=7,yy=9;

	public void show(){
		System.out.println("reached here");

		int dd=7;
		int mm=5;
		int yy=8;

		//	dd=this.dd;
		//	mm=this.mm;
		//	yy=this.yy;
		System.out.println(this.dd);

		System.out.println(this.mm);
		System.out.println(this.yy);

	}
}




public class test {
	public static void main(String[] args) {
		Mydate obj=new Mydate();
		obj.show();

	}


}
