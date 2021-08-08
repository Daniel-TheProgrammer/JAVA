package mergesort;

import java.util.Arrays;

public class MergeSort 
{
    public static void main(String[] args) 
    {
        int unsortedArray[] = new int[]{20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(unsortedArray));
        mergeSort(unsortedArray, 0, unsortedArray.length);
        System.out.println(Arrays.toString(unsortedArray));
        descendMergeSort(unsortedArray, 0, unsortedArray.length);
        System.out.println(Arrays.toString(unsortedArray));
    }
    
    // This function divides the array into a right and left partitions until it 
    // reaches a single element. Once it reaches two individual elements, it returns back
    // to the recursive function and begins to merge the right and left partitions into one 
    // sorted partition
    public static void mergeSort(int array[], int start, int end)
    {
        if(end - start < 2)
            return;
        
        int middle = (start + end) / 2;
        mergeSort(array, start, middle);
        mergeSort(array, middle, end);
        merge(array, start, middle, end);
    }
    
    public static void merge(int array[], int start, int middle, int end )
    {
        // This if statement is looking at the last element in the left partition
        // and seeing if it is less than the first element in the right partition.
        // If it is less than the first element in the right partition, then the 
        // order does not need to be changed.
        if(array[middle - 1] <= array[middle])
            return;
        
        int i = start;
        int j = middle;
        int tempIndex = 0;
        int tempArray[] = new int[end-start];
        
        // Traverses through the left and right partitons and compares the first element 
        // of each of the partitions. Whichever is of lesser value, it gets copied to the
        // temp array.
        while(i < middle && j < end)
        {
            tempArray[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        
       
        System.arraycopy(array, i, array, start + tempIndex, middle - i);
        System.arraycopy(tempArray, 0, array, start, tempIndex);
    }
    
    public static void descendMergeSort(int array[], int start, int end)
    {
        if(end - start < 2)
            return;
        
        int middle = (start + end) / 2;
        descendMergeSort(array, start, middle);
        descendMergeSort(array, middle, end);
        descendMerge(array, start, middle, end);
    }
    
    public static void descendMerge(int array[], int start, int middle, int end )
    {
        if(array[middle - 1] >= array[middle])
            return;
        
        int i = start;
        int j = middle;
        int tempIndex = 0;
        int tempArray[] = new int[end-start];

        while(i < middle && j < end)
        {
            tempArray[tempIndex++] = array[i] >= array[j] ? array[i++] : array[j++];
        }
        
       
        System.arraycopy(array, i, array, start + tempIndex, middle - i);
        System.arraycopy(tempArray, 0, array, start, tempIndex);
    }
}
