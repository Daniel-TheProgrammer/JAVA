package countingsort;

import java.util.Arrays;

public class CountingSort 
{
    public static void main(String[] args) 
    {
        int unsortedArray[] = new int[]{2,5,9,8,2,8,7,10,4,3};
        System.out.println(Arrays.toString(unsortedArray));
        countingSort(unsortedArray, 2, 10);
        System.out.println(Arrays.toString(unsortedArray));
    }
    
    public static void countingSort(int[] array, int min, int max)
    {
        // Create counting array that keeps track of the counts
        int[] countArray = new int[(max-min)+1];
        
        //Traverse through the given array and begin to count the number of occurrances for each number
        for(int i = 0; i < array.length; i++){
            countArray[array[i]-min]++;
        }
        
        int j = 0;
        for(int i = min; i <= max; i++)
        {
            while(countArray[i - min] > 0)
            {
                array[j++] = i;
                countArray[i-min]--;
            }
        }
    }
    
}
