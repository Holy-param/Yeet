

import java.util.Scanner;
public class calculator
{
 void addition(double p,double i)
 {
   double q=p+i;
   System.out.println("addition is "+q);
 }
  void multiplication(double p,double i)
 {
   double q=p*i;
   System.out.println("multiplication is "+q);
 }
 void division(double p,double i)
 {
   double q=p/i;
   System.out.println("division is "+q);
 }
 void subtraction(double p,double i)
 {
   double q=p-i;
   System.out.println("subtraction is "+q);
 }
 public static void main()
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("---------------------------------------- \n enter the 2 num and the first letter of the opration u want to use");
  double a=obj.nextInt();
  double b=obj.nextInt();
  char c=obj.next().charAt(0);
  calculator sc= new calculator();
  System.out.println("---------------------------------------- \n ");
  for(int z=0;z==0;)
  {
  if( c=='a')
  {
    sc.addition(a,b);
     z++;
  }
  else if(c=='s')
  {
   sc.subtraction(a,b);
    z++;
  }
  else if(c=='d')
  {
   sc.division(a,b);
    z++;
  }
  else if(c=='m')
  {
   sc.multiplication(a,b);
    z++;
  }
  else
  {
   System.out.println(":( \n ----------------------------------------");
  }
  }
 }
}
 

