

/*
 * only works for lower case letters
 */
public class LetterToNumber {
	char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	int[] letterValue = new int[letters.length];
	
	
	public int convertLetterToNumber(Character c){
		int beg = 0;
		int end = letters.length;
		while(end >= beg){
			int mid = (beg + end)/2; 
			if(c.equals(letters[mid])){
				if(letterValue[mid] == 0)
					letterValue[mid] = (int)(Math.random() * 101) + 1; 
				return mid;
			}
			else if(c.compareTo(letters[mid]) < 0)
				end = mid - 1;
			else if(c.compareTo(letters[mid]) > 0)
				beg = mid + 1;
		}
		return -1;
	}
	public char convertNumberToLetter(int letterNum) throws NoLetterException{
		for(int x = 0; x < letterValue.length; x++){
			if(letterValue[x] == letterNum)
				return letters[x];
		}
		throw new NoLetterException("This number does not correlate to any letter");
	}
}


