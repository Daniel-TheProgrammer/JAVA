package shellsort;

import java.util.Arrays;

public class ShellSort
{
    public static void main(String[] args) 
    {
        int unsortedArray[] = new int[]{20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(unsortedArray));
        shellSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }  
    
    public static void shellSort(int array[])
    {
        //Creates the gap to compare the elements
        for (int gap = array.length/2; gap > 0; gap/=2)
        {
            // Compares the value located in the gap and swaps the values if it is larger
            for(int i = gap; i < array.length; i++)
            {
                int temp = array[i];
                int j = i;
                
                while(j >= gap && array[j-gap] > temp)
                {
                    array[j] = array[j-gap];
                    j-=gap;
                }
                array[j] = temp;
            }
        }
    }
}
