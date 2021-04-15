import java.util.*;
public class Cypher {
	
	static char [] charTable = new char [26];
	static char [] charTableReg = new char [26];
	static Random rand = new Random();
	
	public Cypher(){
		
		int index = 0;
		for(int i=97; i<123; i++){
			charTableReg[index] = (char) i;
			charTable[index] = (char) i;
			index++;
		}
		
	}
	
	private static char[] randomKey(){
		
		int num1;
		int num2;
		char temp;
		
		for(int i=0; i<500; i++){
			
			num1 = rand.nextInt(26);
			num2 = rand.nextInt(26);
			
			temp = charTable[num1];
			charTable[num1] = charTable[num2]; 
			charTable[num2] = temp;
			
		}
		
		
		return charTable;
	}
	
	private static String RandomKey(){
		
		String str = "";
		
		str += "Condensed key version: ";
		
		
		for(int i=0; i<26; i++)
			str += charTable[i];
		
		return str;
		
	}
	
	public static String convertWithRandomTable(String str){
		
		char [] table = randomKey();
		String mixed = "";
		String returnStatement;
		
		for(int i=0; i<str.length(); i++){
			
			if('a' <= (str.charAt(i)) && (str.charAt(i)) <= 'z'){
				
				mixed += table[(int)str.charAt(i)-97];
				
			}
			else if('A' <= (str.charAt(i)) && (str.charAt(i)) <= 'Z'){
				
				mixed += Character.toUpperCase(table[(int) str.charAt(i)-65]);
				
			}
			else
				mixed += str.charAt(i);
			
		}
		
		String key = RandomKey();
		returnStatement = key + "\n" + "The first letter in the key corresponds to a, the second letter corresponds to b, and so on.";
		return  returnStatement + "\n" + mixed;
	}
	
	public static String reverseRandom(String str, String key){
		
		if(key.length() != 26)
			return "Error. Key is invalid";
			
		String original = "";
		String capitalKey = key.toUpperCase();
		
		
		for(int i=0; i<str.length(); i++){
			
			if('a' <= (str.charAt(i)) && (str.charAt(i)) <= 'z'){
				
				original += (char)(key.indexOf((int)str.charAt(i)) + 97);
						
			}
			else if('A' <= (str.charAt(i)) && (str.charAt(i)) <= 'Z'){
				original += (char)(Character.toUpperCase(capitalKey.indexOf((int)str.charAt(i)) + 97));
			}
			else
				original += str.charAt(i);
		}
		
		
		return original;
	}
	
	public static String completeRand(String str){
		
		int adder;
		String mixed = "";
		String key = "";
		int input;
		String completeRandKey = "";
		
		for(int i=0; i<str.length(); i++){
			
			adder = rand.nextInt(26)+1;
			if('a' <= (str.charAt(i)) && (str.charAt(i)) <= 'z'){
				
				input = (int)(str.charAt(i)+adder);
				if (input > 122)
					mixed += (char)(input%123 + 97);
				else
					mixed += (char)(input);
				
				if(adder < 10)
					key += "0" + Integer.toString(adder);
				else
					key += Integer.toString(adder);
						
			}
			else if('A' <= (str.charAt(i)) && (str.charAt(i)) <= 'Z'){
				input = (int)(str.charAt(i)+adder);
				if (input > 90)
					mixed += (char)(input%91 + 65);
				else
					mixed += (char)(input);
				
				if(adder < 10)
					key += "0" + Integer.toString(adder);
				else
					key += Integer.toString(adder);
			}
			else{
				mixed += str.charAt(i);
				key += "!!";
				
			}
			
			
		}
		
		completeRandKey = "key: " + key + "\n";
		
		completeRandKey += "Use every 2 characters in the key and increase the corresponding letters by the amount. " + "\n"
				+ "Exclamation marks mean the character is a non-letter and should not be altered." + "\n";
		
		return completeRandKey + mixed;
	}
	
	public static String reverseCompleteRand(String key, String str){
		
		int input;
		String original = "";
		int keyIndex = 0;
		int adder;
		String twoparts;
		
		if(key.length()/2 != str.length())
			return "Error. Key is not vaid";
		else{
			
			for(int i=0; i<str.length(); i++){
				
				twoparts = key.substring(keyIndex, keyIndex+2);
				if(twoparts.equals("!!"))
					adder = 0;
				else
					adder = 26-Integer.parseInt(twoparts);
				
				keyIndex += 2;
				
				if('a' <= (str.charAt(i)) && (str.charAt(i)) <= 'z'){
					
					input = (int)(str.charAt(i)+adder);
					if (input > 122)
						original += (char)(input%123 + 97);
					else
						original += (char)(input);
							
				}
				else if('A' <= (str.charAt(i)) && (str.charAt(i)) <= 'Z'){
					input = (int)(str.charAt(i)+adder);
					if (input > 90)
						original += (char)(input%91 + 65);
					else
						original += (char)(input);
				}
				else
					original += str.charAt(i);
				
			}
			
		}
			return original;
		
	}
	
	public static String setIncrease(int num, String str){
		
		String mixed = "";
		int input;
		String key = "";
		
		if(num < 1)
			return "Error. Must be a positive number.";
		else{

			for(int i=0; i<str.length(); i++){
			
				if('a' <= (str.charAt(i)) && (str.charAt(i)) <= 'z'){
				
					input = (int)(str.charAt(i)+num);
					if (input > 122)
						mixed += (char)(input%123 + 97);
					else
						mixed += (char)(input);
				
				}
				else if('A' <= (str.charAt(i)) && (str.charAt(i)) <= 'Z'){
				
					input = (int)(str.charAt(i)+num);
					if (input > 90)
						mixed += (char)(input%91 + 65);
					else
						mixed += (char)(input);
				
				
				}
					else
						mixed += str.charAt(i);
				
				}
		}
		key += ("Key: " + "decrease all letters by " + num + "\n");
		
		return key + mixed;
	}
	
	public static String setDecrease(int num, String str){
		
		int input;
		String mixed = "";
		String key = "";
		
		if(num < 1)
			return "Error. Must be a positive number.";
		else{
			
			for(int i=0; i<str.length(); i++){
			
				if('a' <= (str.charAt(i)) && (str.charAt(i)) <= 'z'){
				
					input = (int)(str.charAt(i)-num);
					if (input < 97)
						mixed += (char) (122-(96%input));
					else
						mixed += (char)(input);
				
				}
				else if('A' <= (str.charAt(i)) && (str.charAt(i)) <= 'Z'){
				
					input = (int)(str.charAt(i)-num);
					if (input < 65)
						mixed += (char)(90-(64%input));
					else
						mixed += (char)(input);
				
				
				}
					else
						mixed += str.charAt(i);
				
				}
		}
		
		key += ("Key: " + "increase all letters by ") + num + "\n";
		
		return key + mixed;
	}
	
	
	public static void main(String[] args) {
		
		// test cases 
		
		Cypher cye = new Cypher();
		System.out.println(cye.convertWithRandomTable("ABC"));

		
		//System.out.println(cye.setIncrease(1,"XyZA!A A"));
		
		//System.out.println(cye.setDecrease(7,"abcdefg"));
		
		//System.out.println(reverseRandom("OLY!  AEae", "olyhqzutirkgmfnsjxvwcpbdea"));
		
		//System.out.println(completeRand("av!rbbbYs! REW"));
		
		//System.out.println(reverseCompleteRand("2215!!150802211723!!!!161709", "wk!gjdwPp! HVF"));
		
		
	}
	
	

}
