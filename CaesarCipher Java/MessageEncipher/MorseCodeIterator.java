
public class MorseCodeIterator {
	morseEncryptor n = new morseEncryptor();
	String input;
	
	public MorseCodeIterator(String input){
		this.input = input;
	}
	
	public String encrypt1(){
		n.populateTable();
		return n.encrypt(input, 1);
	}
	
	public String encrypt2(){
		n.populateTable();
		return n.encrypt(input, 2);
	}
	
	public String encrypt3(){
		n.populateTable();
		return n.encrypt(input, 3);
	}
	
	//key generated?
}
