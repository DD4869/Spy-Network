public class Spy /*extends SpyFactory*/{
	private int key;
	private String message;
	private String scheme;
	private Homebase hb;
	private Fieldbase fb;
	private SymmentricEn syen;
	
	
	public Spy() { // constructor
		this.scheme = scheme;
		this.key = key;
	}
	
	public void update(String scheme, int key) { //update scheme and key
		this.scheme = scheme;
		this.key = key;
	}
	
	public void dieSpy(Spy spy) { // when spy die, unregister
		System.out.println("die");
		fb.unregisterSpies(spy);
	}
	
	public void deadSpy(Spy spy) { // dead spy can not register
		System.out.println("You died, Not allowed to re-register");
	}
	
	public void Key(Homebase hb) {
		this.key = hb.getKey();
	}
	
	
	public void Scheme(Homebase hb) {
		this.scheme = hb.getScheme();
	}
	
	public String getMessage() { //Get new message
		return message;	
	}
	
	public void setMessage(String message) { // Set new message
		this.message = message;
	}
	
	public String sendMessage(String message, String Towho, int key, String scheme) { //send message
		SymmentricEn syen = new SymmentricEn();
		System.out.println(message);
		syen.encrypt();
		String encryptedMessage = message;
		return encryptedMessage;
	}
	
	public String receiveMessage(String message) { //receive message 
		SymmentricEn syen = new SymmentricEn(); 
		syen.decrypt();
		System.out.println(message);
		String decryptedMessage = message;
		return message;
	}

}