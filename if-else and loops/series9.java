
// 2!-4!+6!-8!....n!
import java.util.Scanner;
public class series9
{
    int n;
    int f=1;
    int s=1;
  void input()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter n");
  n=sc.nextInt();
 }
 void compute()
 {
  for(int i=1;i<=n;i++)
  {
     for(int e=1;e<=i;e++)
     {
       f=f*e;
     }
     if(i%4==0)
      s=s-f;
     else 
      s=s+f;
  }
 }
}
