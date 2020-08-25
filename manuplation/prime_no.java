package basic;
import java.util.Scanner;
public class prime_no
{
 
 void main()
 {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  prime_no obj=new prime_no();
  if(obj.compute(a)==1)
  System.out.println("the no is prime");
  else
  System.out.println("the no is not prime");
 }
 int compute(int num)
 {
  int k=0;
  for(int a=2;a<=num;a++)
  if(num%a==0)
   k++;
  else 
   k=0;
  return k;
 }
}
