//just print and see the patterns

import java.util.Scanner;
public class pattern
{
    Scanner sc=new Scanner(System.in);
    String str;
    void input()
    {
        System.out.print("Enter word: ");
        str = sc.next();        
    }
    void compute()
    {
        for(int i = 0; i<=str.length()-1; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
    void compute2()
    {
        for(int i = str.length()-1; i>=0; i--)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
    void compute3()
    {           
     for(int i = 0; i<=str.length()-1; i++)
     {
      if(i==0||i==str.length()-1)
      {
         for(int j=0;j<=str.length()-1;j++)
         {
          System.out.print(str.charAt(j));
         }
         System.out.println();
      }
      else
      {
       for(int j=0;j<=str.length()-1;j++)
       {
        if(j==0||j==str.length()-1)
        {
         System.out.print(str.charAt(j));
         if(j==str.length()-1)
         System.out.println();
        }
        else
        {
         char ch=32;
         System.out.print(ch);
        }
       }
      }
     }
    }
    static void main()
    {
        pattern obj = new pattern();
        obj.input();
        obj.compute();
        obj.compute2();
        obj.compute3();
    }
}
