
import java.util.Scanner;
public class dudeney
{
  Scanner sc=new Scanner(System.in);
  int in;
  void input()
  {
   System.out.println("give input");
   in=sc.nextInt();
  }
  void compute()
  {
   int sum=0;
   int temp= in;
   for(int a=1;a<=in;a++)
   {
    sum= sum+ temp%10;
    temp= temp/10;
   }
   if((sum*sum*sum)==in)
    System.out.println("dudeney no.");
   else 
    System.out.println("not a dudeney no.");
  }
  void main()
  {
   dudeney obj=new dudeney();
   obj.input();
   obj.compute();
  }
}

