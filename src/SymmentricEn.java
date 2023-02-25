import java.util.Scanner;

public class SymmentricEn {
	private Homebase hb;
	
	public void SymmentricEn() { //update scheme and key
		encrypt();
		decrypt();
	}
	
	public void encrypt() { //encrypt message
		System.out.println("Message was encrypted by key");
	}
	
	public void decrypt() { //decrypt message	
		Scanner scanner = new Scanner(System.in);
	    System.out.println("input key : ");
	    int input = scanner.nextInt(); //input key to decrypt message
	    	System.out.println("Message was decrypted by the key");
	}

}
