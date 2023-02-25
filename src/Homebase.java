import java.util.ArrayList;

public class Homebase implements Subject{
	private ArrayList<FieldbaseOb> FieldbasesOb = new ArrayList<>(); // List for Filebases
	private int key;
	private String scheme; 
	private String message;
	private SymmentricEn syen;
	
	public Homebase() { //constructor
		getKey();
		getScheme();
	}
	
	@Override
	public void registerFieldbaseOb(FieldbaseOb fieldbaseob) { // add
		FieldbasesOb.add(fieldbaseob);
		
	}

	@Override
	public void unregisterFieldbaseOb(FieldbaseOb fieldbaseob) { //remove
		FieldbasesOb.remove(fieldbaseob);
	}
	
	@Override
	public void notifyFieldbaseOb(int key, String scheme) { //notify to filebase
		for (FieldbaseOb fields: FieldbasesOb) {
			fields.update(scheme, key);
		}
	}
	
	public int getKey() { 
		return key;	
	}
	
	public void setKey(int key) { // Set new key and notify fieldbase
		this.key = key;
		notifyFieldbaseOb(key,scheme);
	}
	
	public String getScheme() {
		return scheme;
	}
	
	public void setScheme (String scheme) { //Set new sheme and notify fieldbase
		this.scheme = scheme;
		notifyFieldbaseOb(key,scheme);
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
