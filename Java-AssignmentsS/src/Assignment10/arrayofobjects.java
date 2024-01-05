package Assignment10;
 class sample{
	int Age;
	String Name;
	
	public sample copyobj(sample s) {
		Age=s.Age;
		Name=s.Name;
		return s;
	}
	
	
	public void show() {
		System.out.println("Age is : "+Age);
		System.out.println("Name: "+Name);
		
	}
}
public class arrayofobjects {

	public static void main(String[] args) {
		//created array of objects
		sample[] s=new sample[4];
		
		//instantiated each object in the array
		 for (int i = 0; i < s.length; i++) {
	            s[i] = new sample();
	        }
		 //assigned values to s[0]
		s[0].Age=25;
		s[0].Name="Josh";
		
		//passing obj as parameters to s1 and returned the values to s[2]
		s[2]=s[1].copyobj(s[0]);
		//using assingment operator values are passed 
		s[3]=s[2];
		
		//for loop to print 
		for(int i=0;i<=3;i++) {
			s[i].show();
			System.out.println("\n");
		}
		
		

	}

}

