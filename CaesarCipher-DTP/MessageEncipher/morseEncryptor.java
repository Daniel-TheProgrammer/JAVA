/*How to:
morseEncryptor.populateTable(); has to be done before encryption.

String input = "input here";
Options 1-3.

String output = encrypt(input, option);
to encrypt

String output = decrypt(input);
to decrypt
*/


public class morseEncryptor{
    
    public static String [] morseTable = new String [36];
    
    public void populateTable(){
        morseTable[0] = ".-";
        morseTable[1] = "-...";
        morseTable[2] = "-.-.";
        morseTable[3] = "-..";
        morseTable[4] = ".";
        morseTable[5] = "..-.";
        morseTable[6] = "--.";
        morseTable[7] = "....";
        morseTable[8] = "..";
        morseTable[9] = ".---";
        morseTable[10] = "-.-";
        morseTable[11] = ".-..";
        morseTable[12] = "--";
        morseTable[13] = "-.";
        morseTable[14] = "---";
        morseTable[15] = ".--.";
        morseTable[16] = "--.-";
        morseTable[17] = ".-.";
        morseTable[18] = "...";
        morseTable[19] = "-";
        morseTable[20] = "..-";
        morseTable[21] = "...-";
        morseTable[22] = ".--";
        morseTable[23] = "-..-";
        morseTable[24] = "-.--";
        morseTable[25] = "--..";
    }
    
    public static String toMorse(String input){
        input = input.toLowerCase();
        input = morseTable[input.charAt(0)-97];
        return input;
    }
    
    public static String stringToMorse(String input){
        input = input.toLowerCase();
        String output = "";
        
        for (int x = 0; x < input.length(); x++){
            if(input.substring(x, x+1).equals(" ")){
                output += "   ";
            }
            else{
                output += toMorse(input.substring(x, x+1)) + " ";
            }
        }
        return output;
    }
    
    public static String morseToString(String input){
        for(int x = 0; x < 26; x++){
            if(input.equals(morseTable[x])){
                return Character.toString((char) (x+97));
            }
        }
        return "";
    }
    
    public static String deMorse(String input){
        String output = "";
        int start = 0;
        for (int x = 0; x < input.length(); x++){
            if(input.substring(x,x+1).equals(" ")){
                output += morseToString(input.substring(start,x)) + " ";
                start = x+1;
            }
            output += morseToString(input.substring(start));
        }
        
        return output;
    }

    public static String invert(String input){
        String output = "";
        for(int x = 0; x < input.length(); x++){
            if(input.substring(x, x+1).equals("-")){
                output += ".";
            }
            else if(input.substring(x, x+1).equals(".")){
                output += "-";
            }
            else{
                output += " ";
            }
        }
        return output;
    }

    public static String encrypt1(String input){
        String output = invert(input);
        output += "--.--";
        return output;
    }
    
    public static String decrypt1(String input){
        String output = input.substring(0, input.length()-5);
        output = invert(output);
        output = deMorse(output);
        return output;
    }
    
    public static String reverse(String input){
        String output = "";
        for(int x = 0; x < input.length(); x++){
            output += input.substring(input.length()-1-x, input.length()-x);
        }
        return output;
    }
    
    public static String encrypt2(String input){
        String output = reverse(input);
        output += ".-..-";
        return output;
    }
    
    public static String decrypt2(String input){
        String output = input.substring(0, input.length()-5);
        output = reverse(output);
        output = deMorse(output);
        return output;
    }
    
    public static String swap(String input){
        String output = "";
        for(int x = 0; x < input.length(); x++){
            if(x%2==1){
               output += input.substring(x,x+1);
               output += input.substring(x-1, x);
            }
        }
        if(input.length()%2==1){
            output += input.substring(input.length()-1,input.length());
        }
        return output;
    }
    
    public static String encrypt3(String input){
        String output = swap(input);
        output += "--..-";
        return output;
    }
    
    public static String decrypt3(String input){
        String output = input.substring(0, input.length()-5);
        output = swap(output);
        output = deMorse(output);
        return output;
    }
    
    public String encrypt(String input, int option){
        input = stringToMorse(input);
        if(option == 1){
            return encrypt1(input);
        }
        if(option == 2){
            return encrypt2(input);
        }
        if(option == 3){
            return encrypt3(input);
        }
        else{
            return input;
        }
    }
    
    public static String decrypt(String input){
        String key = input.substring(input.length()-5, input.length());
        if(key.equals("--.--")){
            return decrypt1(input);
        }
        else if (key.equals(".-..-")){
            return decrypt2(input);
        }
        else if (key.equals("--..-")){
            return decrypt3(input);
        }
        else{
            return input;
        }
    }
}
