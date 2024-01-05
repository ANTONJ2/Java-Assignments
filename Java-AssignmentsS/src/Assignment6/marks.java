package Assignment6;

public class marks {
	static	int m1;
	static int m2;
	static	int m3;
	static	int total;
	static	int avg;

	//This is Static block
	static {


		m1=10;
		m2=12;
		m3=14;
		total=m1+m2+m3;
		avg=total/3;




	}
	//static method to print the static variables
	static void print() {
		System.out.println("value of m1:"+m1);
		System.out.println("value of m2:"+m2);
		System.out.println("value of m3:"+m3);
		System.out.println("value of total:"+total);
		System.out.println("value of avg:"+avg);

	}

	//No need to create object since print() is a static method.
	public static void main(String[] args) {
		print();




	}

}
