
 //1+2    1+2+3...n
 //---- + ---------
 //1*2    1*2*3....n
import java.util.Scanner;
public class series8
{
    double n;
    double i=0;
    double e=0;
    double p=0;
  void input()
  {
   Scanner sc= new Scanner(System.in);
   sc.nextDouble();
  }
  void compute()
  {
   for(int a=2;a<=n;a++)
   {
    for(double b=1;b<=a;b++)
    {
     i=i+b;
     for(double c=1;c<a;c++)
     {
      e=e*c;
     }
     p=p+i/e;
    }
    } 
   System.out.println("the ans is "+p);
  }
  public static void main()
  {
   series8 pp=new series8();
   pp.input();
   pp.compute();
  }
}
