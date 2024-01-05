package Assignment3;

public class assignment3 {

	public static void main(String[] args) {
		//pattern question with while loop
		int i=1;

		while(i<=5) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;

		}

		System.out.println(" ");


		//fibonacci series using do while loop is shown below


		int n=10;
		int firstTerm=0;
		int secondTerm=1;
		int nextTerm;
		int count=0;
		System.out.println("fibonacci series");
		do {
			System.out.print(firstTerm + " ");
			nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			count++;


		}while(count<=n);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Star pattern");

		//star pattern using for loop

		for(int a=8;a>=1;a--) {
			for(int b=1;b<a;b++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		//Array assignment
		String[] students= {"Josh", "Hamedani","trist","kong","jones"};
		//using a foreach to iterate through the array.            
		//for(String g : students) {
		//	System.out.println(g);
		//}

		System.out.println("2nd student from index 0 has been found: " + students[2]);
	}

}