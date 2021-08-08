package quicksort;

import java.util.Arrays;

public class QuickSort 
{
    public static void main(String[] args) 
    {
        int unsortedArray[] = new int[]{20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(unsortedArray));
        quickSort(unsortedArray, 0, unsortedArray.length);
        System.out.println(Arrays.toString(unsortedArray));
    }
    
    public static void quickSort(int[] array, int startIndex, int endIndex)
    {
        //Checks to see if the array has more than on element
        // If there is only one element then there is no need to sort
        // since it is already sorted
        if(endIndex-startIndex < 2)
            return;
        
        // This sorts the array and places the pivot index in the correct position in the array
        //It places all elements less than the pivot to the left of the pivot and all elements greater
        // than the pivot to the right of the pivot.
        // It then calls the quick sort algorithm to get a new pivot from the unsorted left side of the current pivot
        // and calls the quick sort algorithm again fo rthe right side of the current pivot.

        int pivotIndex = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, pivotIndex);
        quickSort(array, pivotIndex+1, endIndex);
    }
    
    public static int partition(int[] array, int startIndex, int endIndex)
    {
        //In this version of quick sort, we will choose the first element as the pivot
        int pivot = array[startIndex];
        int i = startIndex;
        int j = endIndex;
        
        while(i < j)
        {
            // This loops looks decrements j until it finds an element less than 
            // the pivot. 
            while(i < j && array[--j] >= pivot);
            
            //Checks to make sure that the reason the while loop ended is because
            // it found an element less than the pivot and not because j crossed over to i.
            if(i < j)
            {
                array[i] = array[j];
            }
            
            while(i < j && array[++i] <= pivot);
            if(i < j)
            {
                array[j] = array[i];
            }
        }
        
        // Sets the pivot in its permanent position in the array
        array[j] = pivot;
        
        // Returns the position of the pivot
        return j;
    }
}
