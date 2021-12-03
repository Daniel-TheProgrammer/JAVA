package radixsort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] unsortedArray = {4725, 4586, 1330, 8792, 1594, 5729};
        System.out.println(Arrays.toString(unsortedArray));
        radixSort(unsortedArray, 9, 4);
        System.out.println(Arrays.toString(unsortedArray));
    }
    
    public static void radixSort(int[] input, int radix, int width)
    {
        for(int i = 0; i < width; i++)
        {
            // Calls this function for each position in the value.
            radixSingleSort(input, i, radix);
        }
    }
    
    public static void radixSingleSort(int[] unsortedArray, int position, int radix)
    {
        
        int numItems = unsortedArray.length;
        int[] countArray = new int[radix];
        
        // For each number in the array, this loop takes the significant digit of that number
        // tallies the number inside the count array so that the count array keeps track of how many
        // occurrances that number appears in the number array according to the digit's place
        for(int value: unsortedArray)
        {
            // Adds 1 to the number of occurances of this digit in the count array
            countArray[getDigit(position, value, radix)]++;
        }
        
        //This loops takes the count array containing the number of occurances and adds it
        // so that it displays how many occurances the number and numbers less than the number appear in the array
        for(int j = 1; j < radix; j++)
        {
            countArray[j] += countArray[j-1];
        }
        
        // Copies the values into a temp array via rigth to left of the array to preserve the order of duplicates
        int temp[] = new int[numItems];
        
        for(int tempIndex = numItems - 1; tempIndex >=0; tempIndex--){
            temp[--countArray[getDigit(position,unsortedArray[tempIndex], radix)]] =
                    unsortedArray[tempIndex];
        }
        
        
        //Copies the values from the temp array to the unsortedArray
        for(int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            unsortedArray[tempIndex] = temp[tempIndex];
        }
        
    }
    
    // Finds the value of the digit
    public static int getDigit(int position, int value, int radix)
    {
        return value/(int)Math.pow(10,position) % radix;
    }
}
