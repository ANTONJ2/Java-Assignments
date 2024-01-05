package Assignment9;

public class findmatchingstring {

	public static void main(String[] args) {
		String [][] arr= {
				{ "Josh","hopes","kame"
		},{
			"Sec","hoi","triumph"
		},{
			"max","kane","vill"
		}

	};
	String r="kame";
	int found=0; 
	
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr.length-1;j++) {
			if(arr[i][j]==r) {
				
				found++;
			}
			}
		}
	if (found<1) {
		System.out.println(r+" is not found");
	}else {
		System.out.println(r+" is found");
	}
	}

	}


