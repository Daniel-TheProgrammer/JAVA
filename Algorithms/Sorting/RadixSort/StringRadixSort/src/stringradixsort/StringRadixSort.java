/*
/ Name: Sydnee Woodhouse
/ Date: 1/10/2020
/ Description: This program takes an array of string and sorts them
/              using radix sort algorithm.
*/

package stringradixsort;

import java.util.Arrays;

public class StringRadixSort 
{
    public static void main(String[] args) 
    {
        String[] input = {"bcdef","dbaqc","abcde","omadd","bbbbb"};
        System.out.println((int)'a');
        System.out.println(Arrays.toString(input));
        radixSort(5,26,input);
        System.out.println(Arrays.toString(input));
    }   
    
    // This funtion compares the individual chars for each string in the array and 
    // sends the position to the singleSortRadix to arrange th estrings accordingly in 
    // the input array
    public static void radixSort(int width, int radix, String[] array)
    {
        for(int i = width-1; i >= 0; i--)
        {
            singleRadixSort(radix, i, array);
        }
    }
    
    // This function creates a counting array to keep track of how many occurrances 
    // each of the chars appear and places the strings in order according to the
    // counting array
    public static void singleRadixSort(int radix, int position, String[] array)
    {
        int countArray[] = new int[radix];
        
        // Sets up the count array containing the number of occurances for each char in the 
        // string
        for(int i = 0; i < array.length; i++)
        {
            int num = (int)(array[i].charAt(position));
            countArray[num-97]++;
        }
        
        // Adds the number of occurances and number of letters less than the current digit
        for(int i = 1; i < countArray.length; i++)
        {
            countArray[i]+=countArray[i-1];
        }
        
        // Creates a temp array to arrange the order of the array
        String temp[] = new String[array.length];
        
        // Finds the index of where the string should be in the final array
        for(int i = array.length-1; i >=0; i--)
        {
            int num = ((int)(array[i].charAt(position))) - 97;
            temp[--countArray[num]] = array[i];
        }
        
        // Copies the temp array into the final array
        for(int i = 0; i < array.length; i++)
        {
            array[i] = temp[i];
        }
    }
}
