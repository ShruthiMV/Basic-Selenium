package basic;

class whatsapp1{
	
	void display() {
	
	
	System.out.println("Single click only");
	
}
	
}

class whatsapp2 extends whatsapp1{
	
	
	
	void calls() {
		
		System.out.println("voice calls");

		
	}
	
}


class whatsapp3 extends whatsapp2{
	

	void display() {
		
		
		System.out.println("Single click and double click3");
		
	}
	
	void calls() {
		
		System.out.println("voice calls and video calls3");

		
	}
	 void status() {
	
			System.out.println("Status gets displayed3");

	
}


}

public class Whatsapp_method_overriding {

	public static void main(String[] args) {
		whatsapp3 w3=new whatsapp3();
		w3.calls();
		w3.display();
		w3.status();

	}


}


