//14.	Fill an array of size 10 and type double.Print those elements of the array 
//that are larger than the average of the elements of the array 
import java.util.Scanner;
public class q14
{
 double[] ar;
 void input()
 {
  ar=new double[10];
 }
 void compute()
 {
  double mean=0;
  System.out.println("Enter the 10 numbers");
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<ar.length;i++)
  {
   ar[i]=sc.nextDouble();
   mean=mean+ar[i];
  }
  for(int i=0;i<10;i++)
  {
    if(ar[i]>(mean/10))
    {
    System.out.println("the number"+ar[i]+"is larger than the mean of the array");     
    }            
  }
 }
 static void main()
 {
  q14 obj=new q14();
  obj.input();
  obj.compute();
 }
}
