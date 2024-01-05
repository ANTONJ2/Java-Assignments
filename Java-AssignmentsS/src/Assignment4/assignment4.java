package Assignment4;

import java.util.Scanner;

public class assignment4 {

	public static void main(String[] args) {
		assignment4 as4=new assignment4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter SID");
		int SID=sc.nextInt();
		System.out.println("Enter SName");
		String SName=sc.next();
		System.out.println("Enter rno");
		int rno=sc.nextInt();
		System.out.println("Enter Total marks");
		int total=sc.nextInt();
		System.out.println("Enter Average marks");
		int avg=sc.nextInt();
		as4.showval(SID, SName, rno, total, avg);
		sc.close();

	}

	void showval(int SID, String Sname, int rno, int total, int avg ) {

		System.out.println("Your SID is :"+SID);
		System.out.println("Your Sname is :"+Sname);
		System.out.println("Your rno is:"+rno);
		System.out.println("Your total is:"+total);
		System.out.println("Your average is"+avg);

	}

}