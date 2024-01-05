package Assignment11;

public class assignment11 {

	public static void main(String[] args) {
		
		String name="INTEL";
		//2nd letter of the string
		System.out.println("2nd letter of the string  "+name.charAt(1));
		
		// letters from 3 to 4 of the string
		System.out.println("\nlast 3 letters of the string");
		for(int i=2;i<name.length();i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		
		
		//Length of the string
		int count=0;
		
		for(int i=0;i<name.length();i++) {
			char Fname=name.charAt(i);
			if(Fname!=0) {
				count++;
			}
			
		}
		System.out.println("\nlength of the string: "+count);
		
		
		//printing string in normal form
		System.out.println("\nString in normal form");
		for(int i=0;i<name.length();i++) {
			char Fname=name.charAt(i);
			System.out.print(Fname);
		}
		System.out.println("\n");
		System.out.println("String reversed");
		//reversing string
		for(int i=name.length()-1;i>=0;i--) {
			char Fname=name.charAt(i);
			System.out.print(Fname);
		}

	}

}
