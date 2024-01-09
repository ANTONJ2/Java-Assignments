package Assignment13;

class bank {

	int acc_id;
	String acc_name;
	int amt;
	//constructor 
	public bank(int acc_id, String acc_name, int amt) {
		this.acc_id=acc_id;
		this.acc_name=acc_name;
		this.amt=amt;
		
	}
	//method created 
	public void showval(){
		System.out.println("*****this is the showval method of bank class******");
		System.out.println("account id is"+acc_id);
		System.out.println("account name is"+acc_name);
		System.out.println("account amount is"+amt);
	}

}
