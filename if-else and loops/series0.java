
/**
 * Write a description of class series0 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class series0
{
   int n;
 void input()
 {
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
 }
 void compute()
 {
  int p=0;
  for(int i=1;i<=n;i++)
  if (i%2==0)
  p=p-i;
  else
  p=p+i;
  System.out.println("the ans is "+p);
  }
  void main()
  {
   series0 pp=new series0();
   pp.input();
   pp.compute();
  }
}
