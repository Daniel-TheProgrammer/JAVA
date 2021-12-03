//Done By DTP
package binarysearch;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};
        System.out.println("Iterative Binary Search");
        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 35));
        System.out.println(iterativeBinarySearch(intArray, 8888));
        System.out.println(iterativeBinarySearch(intArray, 1));
        System.out.println("Recursive Binary Search");
        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 35));
        System.out.println(iterativeBinarySearch(intArray, 8888));
        System.out.println(iterativeBinarySearch(intArray, 1));
    }
    
    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;
        
        while(start < end) {
            int midpoint = (start + end) / 2;
            
            if(input[midpoint] == value) {
                return midpoint;
            }
            else if(input[midpoint] > value){
                end = midpoint;
            }
            else {
                start = midpoint + 1;
            }
        }
       return -1;
    }
    
    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }
    
    public static int recursiveBinarySearch(int[] input, int start, int end, int value)
    {
        if(start > end)
            return -1;
        
        int mid = (start + end) / 2;
        
        if(input[mid] == value)
            return mid;
        
        else if(input[mid] > value)
            return recursiveBinarySearch(input, start=mid+1, end, value);
        
        else
            return recursiveBinarySearch(input, start, end=mid, value);
    }
}
