//Simple Interest Calculator by DTP
package com.company;

import java.util.Scanner;

public class Main{
     public static void main(String[] args){
      double p,n,r,si;
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the Principal amount");
      p = sc.nextFloat();

      System.out.println("Enter the number of years");
      n = sc.nextFloat();

      System.out.println("Enter the rate of interest");
      r = sc.nextFloat();

      si = (p * n * r)/100;

      System.out.println("The interest amount is" + si);
     }
 }