//Done by Daniel THeProgrammer
//A Program to Find Odd and even numbers from arrays using Loops
//Here,It will print out the Even Numbers Completely then followed by the Odd NUmbers
package com.company;

public class Main{
    public static void main(String[] args){
        int numbers[]={1,2,3,4,5,6,7,8,9};
        int even[] = new int[5];
        int odd[] = new int [6];
        int i=0;
        int j=0;

        for(int a:numbers){
            if (a%2 ==0){
                even[i]=a;
                i++;
            }else{
                odd[j]=a;
                j++;
            }
        }
        for(int x:even){
            System.out.println(x);
        }
        for(int y:odd){
            System.out.println(y);
        }
        }
    }
