import java.util.*;
import java.util.Arrays;

class delarr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int ar[]= new int[size];
        for(int i=0;i<ar.length;i++)
        {
            System.out.print("Enter the value for array : ");
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.print("Enter the number you want to delete ");
        int newar[] = new int[ar.length-1];
        int del = sc.nextInt();
        
        for(int i=0,k=0;i<ar.length;i++)
        {
            if(ar[i]!=del)
            {
                newar[k]=ar[i];
                k++;
            }
        }
        

        for(int i=0;i<ar.length;i++)
        {
            System.out.print(newar[i]+" ");
        }
        

    }
    
}