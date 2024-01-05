package Assignment2;

import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		assignment2 a=new assignment2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		//code to check if the person is able to vote
		if (age>17) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println(" You are not eligible to vote");
		}
		//code to check if the number given is odd or even
		System.out.println("Enter the number you want to check for odd or even");
		int num=sc.nextInt();
		if(num%2==0 && num!=0) {
			System.out.println("The number you have entered is Even");
		}else if(num==0) {
			System.out.println("0 is neither odd nor even");
		}
		else {
			System.out.println("The number you have entered is odd");

		}
		//students marks calculation and checking if they have passed the examination or not.
		System.out.println("Enter the first student's name");
		String Sname=sc.next();
		System.out.println("Enter roll no.");
		int rno=sc.nextInt();
		System.out.println("Enter mark1");
		int mark1=sc.nextInt();
		System.out.println("Enter mark2");
		int mark2=sc.nextInt();
		System.out.println("Enter mark3");
		int mark3=sc.nextInt();
		a.marks(Sname, rno, mark1, mark2, mark3);

		System.out.println("Enter the Second student's name");
		String Sname1=sc.next();
		System.out.println("Enter roll no.");
		int rno1=sc.nextInt();
		System.out.println("Enter mark1");
		int Smark1=sc.nextInt();
		System.out.println("Enter mark2");
		int Smark2=sc.nextInt();
		System.out.println("Enter mark3");
		int Smark3=sc.nextInt();
		a.marks(Sname1, rno1, Smark1, Smark2, Smark3);

		System.out.println("Enter the Third student's name");
		String Sname2=sc.next();
		System.out.println("Enter roll no.");
		int rno2=sc.nextInt();
		System.out.println("Enter mark1");
		int Tmark1=sc.nextInt();
		System.out.println("Enter mark2");
		int Tmark2=sc.nextInt();
		System.out.println("Enter mark3");
		int Tmark3=sc.nextInt();
		a.marks(Sname2, rno2, Tmark1, Tmark2, Tmark3);
		sc.close();
		//closed scanner ;

	}


	void marks(String sname, int rno, int mark1, int mark2, int mark3 ) {
		int total=mark1+mark2+mark3;
		int avg=(total/3);
		if(avg>50) {
			System.out.println("Dear "+sname+ " with roll number "+rno+" Your mark1 is "+mark1+" Your mark2 is "+mark2+" Your mark3 is "+mark3+" Your average score is :"+avg+" Your total score is :"+total+" You have passed the examination successfully");
		}else {
			System.out.println("Dear "+sname+" with roll number "+rno+" Your mark1 is "+mark1+"Your mark2 is "+mark2+"Your mark3 is "+mark3+" Your average score is :"+avg+"Your total score is :"+total+" Better luck next time");
		}
	}

}
