
// import java.util.Scanner;
// class ArrayInsert 
// {
//     public static void main(String[] args) 
//     {
//         int len, p,e;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter length of an array:");
//         len = sc.nextInt();
//         int arr[] = new int[len+1];
//         System.out.println("Enter "+len+" all the elements:");
//         for(int i = 0; i < len; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter the position where you want to insert an element:");
//         p = sc.nextInt();
//         System.out.print("Enter the element which you want to insert:");
//         e = sc.nextInt();
//         for(int i = len-1; i >= (p-1); i--)
//         {
//             arr[i+1] = arr[i];
//         }
        
//         arr[p-1] = e;
//         System.out.print("After inserting : ");
//         for(int i = 0; i <=len; i++)
//         {
//             System.out.print(arr[i]+",");
//         }
       
//     }

////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class ArrayInsert
{
    public static void main(String[] args) 
    {
        int len,p,e;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        len=sc.nextInt();

        int arr[]=new int[len+1];
        System.out.println("enter all the element");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter position");
        p=sc.nextInt();
        System.out.println("enter element");
        e=sc.nextInt();
        for(int i=len-1;i >= (p-1);i--)
        {
            arr[i+1]=arr[i];
        }
        arr[p-1]=e;
        System.out.println("after inserting..");
        for(int i=0;i<=len;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}