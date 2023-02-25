public class Main {
	public static void main(String[] arg) {
		Homebase hb = new Homebase();
		SymmentricEn syen = new SymmentricEn(); 
		
		Fieldbase fb1 = new Fieldbase();
		Fieldbase fb2 = new Fieldbase();
		
		Spy spy1 = new Spy();
		Spy spy2 = new Spy();
		
		//hb.setKey();
		hb.setKey(1);
		hb.setScheme("Symmen");
		
		//Message from spy1 to spy2
		spy1.setMessage("Hello Hello");
		spy1.sendMessage(spy1.getMessage(), "spy2",hb.getKey(), hb.getScheme() );
		spy2.receiveMessage(spy1.getMessage());
		
		System.out.println("===============================");
		//Message from Fieldbase1 to Fieldbase2
		fb1.setMessage("Hi Hi");
		fb1.sendMessage(fb1.getMessage(), "fb2",hb.getKey(), hb.getScheme() );
		fb2.receiveMessage(fb1.getMessage());
		
		System.out.println("===============================");
		//Message from Fieldbase1 to Homebase
		fb1.setMessage("Hi Hi");
		fb1.sendMessage(fb1.getMessage(), "hb2",hb.getKey(), hb.getScheme() );
		hb.receiveMessage(fb1.getMessage());
		
		System.out.println("===============================");
		//Message from spy1 to Homebase
		spy1.sendMessage(spy1.getMessage(), "spy2",hb.getKey(), hb.getScheme() );
		hb.receiveMessage(spy1.getMessage());
	}
}