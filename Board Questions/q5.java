/**
 * 5.   Write a program to generate the patterns till n terms based upon the user’s choice of triangle to be displayed.                                             
 1                                              a b c d e
 1 2                                            a b c d
 1 2 3                                          a b c
 1 2 3 4                                        a b
 1 2 3 4 5                                      a   
 */
import java.util.Scanner;
public class q5
{
  int n=0;
  char q=' ';
  int a=0;
  void intput_()
  {
    Scanner obj= new Scanner(System.in);
    System.out.println("Enter the pattern number \n 1)a \n 2)1");
     a= obj.nextInt();
    int n=0;
    char q=' ';
    String h;
    if(a==1)
    {
      System.out.println("Enter the n term");
      n = obj.nextInt();
     }
    else
    {
      System.out.println("Enter the last alphabet of your choice(only small letters)");
      h=obj.nextLine();
      h=obj.nextLine();
      q=h.charAt(0);
       System.out.println(q);
    }
     
    if(a==1)
    {
      System.out.println("---------------------------------------------------------------");
      for(int i=1;i<=n;i++)
      {
       for(int t=1;t<=i;t++)
       {
         System.out.print(t);
       }
       System.out.print("\n");
      }
      System.out.println("---------------------------------------------------------------");
     }
     else
     { 
      System.out.println("---------------------------------------------------------------");
      int z=(int)q;
      for(int r=97;z>=r;z--)
      {
        for(;r<=z;r++)
        {
         char u=(char) r;
         System.out.print(u); 
        }
        r=97;
        System.out.println("\n");
      }     
      System.out.println("---------------------------------------------------------------");
     }
   } 
}