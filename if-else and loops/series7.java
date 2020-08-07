//s=1+(1+2)+(1+2+3....n)
import java.util.Scanner;
public class series7
{
    double n;
    double p=1;
 void input()
 {
  Scanner sc=new Scanner(System.in);
  n=sc.nextDouble();
 }
 void compute()
 {
 for(int t=2;t<=n;t++)
 {
  for(int i=1;i<=t;i++)
  p=p+i;
 }
 System.out.println(p);
}
 public static void main()
 {
  series7 pp=new series7();
 pp.input();
 pp.compute();
 }
}
/*p=0;
  for(int y=1;y<=n;y++)
  p=p+y;
 * System.out.println(p);
 */