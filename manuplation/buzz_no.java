
import java.util.Scanner;
public class buzz_no
{
  static void main()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no");
    int a=sc.nextInt();
    buzz_no obj=new buzz_no();
    obj.compute(a);
  }
  void compute(int num)
  {
    if((num%7==0)||(shit(num)))
     System.out.println("the no is a buzz no");
    else 
     System.out.println("the no is not a buzz no");
  }
  boolean shit(int num)
   {
     int a=num%10;
     
     if(a==7)
     return true;
     return false;
   }
  }

