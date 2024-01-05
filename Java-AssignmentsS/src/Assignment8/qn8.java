package Assignment8;

public class qn8 {

	public static void main(String[] args) {
		//1st array
		String[] studentnames=new String[8];
		studentnames[0]="A";
		studentnames[1]="B";
		studentnames[2]="C";
		studentnames[3]="D";
		studentnames[4]="E";
		studentnames[5]="F";
		studentnames[6]="G";
		studentnames[7]="H";
		
		//second array
		int[] studentids={1,2,3,4,5,6,7,8};
		
		//converting int array to string array 
		String[] idstring=new String[studentids.length];
		for(int i=0;i<studentids.length;i++) {
			idstring[i]=String.valueOf(studentids[i]);
			
			
		}
		//created new string array to hold the values of both string arrays
		String[] mergedarray=new String[studentnames.length+idstring.length];
		
		System.out.println("first 8 elements are copied\n\n");
		//used arraycopy to copy 1st and 2nd arrays values to merged array
		System.arraycopy(studentnames, 0, mergedarray, 0, idstring.length);
		for (String element:mergedarray) {
			System.out.println("Element :"+element);
		}
		
		System.out.println("\n\nhere elements copied into 9th to 16th index\n\n ");
		//from studentnames.length copying is done until the length of me
		System.arraycopy(idstring, 0, mergedarray, studentnames.length, idstring.length);
		
		//for printing each element in the mergedarray.
		for (String element:mergedarray) {
			System.out.println("Element :"+element);
		}
		
		
		
		
		
		
		
		

	}

}
