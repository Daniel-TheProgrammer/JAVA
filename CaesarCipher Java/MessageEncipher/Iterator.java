public class Iterator {
	ConvertStringToNumbers n;
	
	public Iterator(String input){
		n = new ConvertStringToNumbers(input);
	}
	
	public String encrypt(){
		//returns an encrypted string
		return n.convertString();
	}
	
	public String key(){
		//returns a key for the encryption
		return n.key();
	}
	
	public String getIterator(){
		//returns the inputed string
		return n.getString();
	}

}
