import java.util.ArrayList;

public class Fieldbase implements FieldbaseOb{
	private ArrayList<Spy> Spies = new ArrayList<>();
	private int key;
	private String message;
	private String scheme;
	private Subject sub;
	private Homebase hb;
	private SymmentricEn syen;
	
	public Fieldbase() { // constructor
		this.scheme = scheme;
		this.key = key;
	}
	
	@Override
	public void update(String scheme, int key) { //update scheme and key
		this.scheme = scheme;
		this.key = key;
		notifySpy();
	}
	
	public void notifySpy() { // notify to spy
		for (Spy spy: Spies) {
			spy.update(scheme, key);
		}
	}
	
	public int getKey() {
		return this.key;
	}
	
	public String getScheme() {
		return this.scheme;
	}
	
	public void goDark(Fieldbase fieldbase) { //unregister Fieldbase
		hb.unregisterFieldbaseOb(fieldbase);
	}
	
	public void goBack(Fieldbase fieldbase) { //re-register Fieldbase
		hb.registerFieldbaseOb(fieldbase);
	}
	
	public void unregisterSpies(Spy spy) { //remove Spy
		Spies.remove(spy);
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
