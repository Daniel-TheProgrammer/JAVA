
import java.util.*;
public class cypherIterator {
    
    Random rand = new Random();
    int num = rand.nextInt(25) + 1;
    Cypher n = new Cypher();
    String input;
    
    public cypherIterator(String in){
        input = in;
    }
    
    public String convertWithRandomTable(){
        
        return Cypher.convertWithRandomTable(input);
    }
    
    public String setIncrease(){
        
        return Cypher.setIncrease(num, input);
    }
    
    public String setDecrease(){
        
        return Cypher.setDecrease(num, input);
    }
    
    public String completeRand(){
        
        return Cypher.completeRand(input);
    }    
}
