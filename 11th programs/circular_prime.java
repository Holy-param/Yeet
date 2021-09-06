
import java.util.Scanner;
public class circular_prime
{
 int num=0;
 String l="";
 Scanner sc=new Scanner(System.in);
 String ar[];
 void input()
 {
  l=sc.next();
 }
 void compute()
 {
  int s=l.length();
  ar=new String[l.length()]; 
  for(int aa=0;aa<s;aa++)
  { 
   int temp1= l.charAt(0);
   l= l.substring(1);
   l=l+temp1;
   ar[aa]=l;
  }
 }
 void prime()
 {
  int flag=0;
  int k=0;
   for(int temp=0;temp<ar.length;temp++)
   {
   for(int temp2=2;temp2<Integer.parseInt(ar[temp]);temp2++)
   {
     if(flag>1)
     {
      System.out.println("noob not a circular prime");
      System.exit(0);
     }
     else
     k++;
     }
   
  }
  System.out.println("circular prime");
 }
 static void main()
 {
  circular_prime obj=new circular_prime();
  obj.input();
  obj.compute();
  obj.prime();
 }
}
