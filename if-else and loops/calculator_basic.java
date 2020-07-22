// wap to create the equivalent of a four function calculator.the program requries the user to enter 2 no. and an operator as arguments. It then carries out the specific arithmetical opration;add subtract multiply divide....
import java.util.Scanner;
public class calculator_basic
{
  void main()
  {
    Scanner obj= new Scanner(System.in);
    System.out.println("enter the 2 numbers");
    double a= obj.nextDouble();
    double b= obj.nextDouble();
    for(int k=0;k==0;)
    {
    {
      System.out.println("----------------------------------------------- \n enter the no of the opration you want to use\n 1.addition \n 2.subtraction \n 3.multiplication \n 4.division \n 5. end");
      int i= obj.nextInt();
     if(i==1)
     {
      System.out.println("the addtion is "+(a+b));
     }
     else if(i==2)
     {
      System.out.println("the subtraction is "+(a-b));
     }
     else if(i==3)
     {
      System.out.println("the multiplication is  "+(a*b));
     }
     else if(i==4)
     {
      System.out.println("the division is "+(a/b));
     }
     else if(i==5)
     {
      k++;
      System.out.println("bye :) \n-----------------------------------------------");
     }
     else
     {
      System.out.println("why do you want to do this now you need to restart the program :( \n-----------------------------------------------");
      k++;
     }
    }
   }
  }  
}