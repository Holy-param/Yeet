  
 import java.util.Scanner;
  public class bouncy
 {
   Scanner sc= new Scanner(System.in);
   int in=0;
   void input()
   {
    System.out.println("Enter the numberthat needs to be checked");
    in=sc.nextInt();
    if(in<100)
    System.exit(0);
   }
   void compute()
   {
    String str= String.valueOf(in);
    if(str.charAt(0)>str.charAt(str.length()-1))
    {
     for(int a=0;a<str.length()-1;a++)
      if(!(str.charAt(a)>=str.charAt(a+1)))
      {
       System.out.println("bouncy number");
       System.exit(0);
      }
    } 
     else if(str.charAt(str.length()-1)>str.charAt(0))
    {
     for(int a=0;a<str.length()-1;a++)
     {  
       if(!(str.charAt(a)<=str.charAt(a+1)))
       {
        System.out.println("bouncy number");
        System.exit(0);
       }
     }
    }
     else if(str.charAt(0)==str.charAt(str.length()-1))
    {
     for(int a=0;a<str.length()-1;a++)
     {  
      if(!(str.charAt(a)==str.charAt(a+1)))
      {
       System.out.println("bouncy number");
       System.exit(0);
      }
     }
    }
    System.out.println("not a bouncy number");
   }
   static void main()
   {
    bouncy obj=new bouncy();
    obj.input();
    obj.compute();
   }
 }

