

public class Driver {

	public static void main(String[] args) throws NoLetterException {
		// TODO Auto-generated method stub
		LetterToNumber n = new LetterToNumber();
		int x = n.convertLetterToNumber('a');
		System.out.println(x);
		System.out.println(n.letterValue[0]);
		System.out.println(n.convertNumberToLetter(n.letterValue[0]));
		System.out.println(n.convertNumberToLetter(0));
		String s = "Hello";
		ConvertStringToNumbers s1 = new ConvertStringToNumbers(s);
		String a = s1.convertString();
		System.out.println(a);
		System.out.println(s1.convertBack());
		System.out.println(s1.key());
	}

}
