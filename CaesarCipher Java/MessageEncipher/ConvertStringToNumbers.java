

public class ConvertStringToNumbers {
	static LetterToNumber singleChar = new LetterToNumber();
	static String[] encrypted;
	static String encryptedString = "";
	static String decriptedString = "";
	StringBuilder key = new StringBuilder();
	String s;
	
	
	public ConvertStringToNumbers(String s){
		
		this.s = s.toLowerCase();
	}
	
	public String getString(){
		return s;
	}
	
	public String convertString(){
		
		return convertStringUtil(s);
	}
	
	private static String convertStringUtil(String s){
		encrypted = new String[s.length()];
		for(int index = 0; index < s.length(); index++){
			Character c = s.charAt(index);
			if(Character.isLetter(c)){
				int letVal = singleChar.convertLetterToNumber(c);
				encrypted[index] = Integer.toString(singleChar.letterValue[letVal]);
			}	
			else{
				encrypted[index] = c.toString();
			}
		}
		for(int x = 0; x < encrypted.length; x++)
			encryptedString += encrypted[x] + " ";
		return encryptedString;
	}
	
	public String convertBack() throws NoLetterException{
		return convertBackUtil(encrypted);
	}
	
	private static String convertBackUtil(String[] encripted) throws NoLetterException{
		for(int index = 0; index < encripted.length; index++){
			if(encripted[index].equals(" ") )
				decriptedString += " ";
			else{
				int d = Integer.parseInt(encripted[index]);
				decriptedString += singleChar.convertNumberToLetter(d);
			}	
			//System.out.println(decriptedString);
		}
		return decriptedString;
	}
	
	public String key(){
		for(int x = 0; x < singleChar.letterValue.length; x++){
			if(singleChar.letterValue[x] != 0)
				key.append(singleChar.letters[x] + " = " + singleChar.letterValue[x] + " ");
		}
		return key.toString();
	}

}
