
/**Write a program to create an array AW[] of type int and size 8 and fill
 * it with variables.Print those elements which have last digit 3.
 */
import java.util.Scanner;
public class q15
{
 int[] AW;
 void input() 
 {
  Scanner sc=new Scanner(System.in);
  AW=new int[8];
  System.out.println("Enter the 8 numbers for the array");
  for(int i=0;i<=AW.length-1;i++)
  {
   AW[i]=sc.nextInt();
   if(AW[i]%10 == 3)
   {
    }
  }
 }
 static void main()
 {
    
 }
}

 
 