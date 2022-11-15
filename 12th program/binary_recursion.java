//binery serch by recursion

import java.util.Scanner;
public class binary_recursion
{
    Scanner sc=new Scanner(System.in);
    int arr[];
    int n=0,c=0;
    void input()
    { 
     System.out.println("ennter the length of the array");
     c=sc.nextInt();
     arr=new int[c];
     System.out.println("enter the sorted element of the array");
     for(int i=0;i<c;i++)
     {
      arr[i]=sc.nextInt();    
     }
     System.out.println("enter the value we need to serch");
     n=sc.nextInt();
    }
    int curse(int mid)
    {
     if(arr[mid]==n)
     {
      return mid;
     }
     else if(arr[mid]>n)
     {
       mid=n/2;
       curse(n/2);
     }
     else  
     {
        mid=(n/2)+n/4;
        curse((n/2)+n/4);
     }
     return n;
    }
    void main()
    {
     binary_recursion obj=new binary_recursion();
     obj.input();
     System.out.println("the number is present on index no. "+curse(c/2));
    }
}
