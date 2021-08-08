package linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        
        System.out.println(linearSearch(intArray, -15));
        System.out.println(linearSearch(intArray, 1));
        System.out.println(linearSearch(intArray, 8888));
        System.out.println(linearSearch(intArray, -22));
    }
    
    public static int linearSearch(int[] intArray, int num) {
            for(int i = 0; i < intArray.length; i++) {
                if(intArray[i] == num)
                    return i;
            }
        return -1;
    }    
}
