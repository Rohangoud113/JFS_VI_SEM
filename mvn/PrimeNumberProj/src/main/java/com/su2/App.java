package com.su2;

import java.util.*;
// import java.util.Collections;

public class App 
{
    // public static boolean check_prime(int n)
    // {
    //     if (n <= 1)
    //         return false;

    //     for (int i = 2; i <= Math.sqrt(n); i++)
    //     {
    //         if (n % i == 0)
    //             return false;
    //     }
    //     return true;
    // }

    public static void se_prime(int s, int e){
        boolean arr[]=new boolean[e+1];
        Arrays.fill(arr,true);

        for(int i=2;i*i<=e;i++){
            for(int j=i*i;j<=e;j+=i){
                arr[j]=false;
            }
        }
        for(int i=s;i<=e;i++){
            if(arr[i]){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number:");
        // int n = sc.nextInt();

        // if (check_prime(n))
        //     System.out.println("Num = " + n + " is prime");
        // else
        //     System.out.println("Num = " + n + " is NOT prime");

        // sc.close();
        System.out.println("enter starting number");
        int s=sc.nextInt();
        System.out.println("enter ending number");
        int e=sc.nextInt();
        se_prime(s,e);
    }

}