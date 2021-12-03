package stablecountingsort;

import java.util.Arrays;

public class StableCountingSort 
{
    public static void main(String[] args) 
    {
        int unsortedArray[] = new int[]{2,5,9,8,2,8,7,10,4,3};
        System.out.println(Arrays.toString(unsortedArray));
        stableCountingSort(unsortedArray, 2, 10);
        System.out.println(Arrays.toString(unsortedArray)); 
    }  
    
    static void stableCountingSort(int[] unsortedArray, int min, int max)
    {
        // Create counting array that keeps track of the counts
        int[] countArray = new int[(max-min)+1];
        
        // Traverse through the given array and begin to count the number of occurrances for each number
        for(int i = 0; i < unsortedArray.length; i++){
            countArray[unsortedArray[i]-min]++;
        }
         
         
        for(int i = 1; i < countArray.length; i++){
            countArray[i]+=countArray[i-1];
        }
        
        
        int temp[]= new int[unsortedArray.length];
        
        for(int i = temp.length-1; i >=0; i--)
        {
            temp[--countArray[unsortedArray[i]-min]] = unsortedArray[i];
        }
        
        // Copies the elements of the temp array to the original array
        for(int i = 0; i < temp.length; i++)
        {
            unsortedArray[i] = temp[i];
        }
    }
}
