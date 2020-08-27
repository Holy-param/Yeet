
/**
 * Write a description of class isbn_no here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class isbn_no
{
  void main()
  {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   isbn_no obj=new isbn_no();
   obj.compute(a);
  }
  void compute(int num)
  {
      int a=0,s=0;
    for(int i=10;num!=0;i--)
    {
    a=num%10;
    num=num/10;
    s=s+(i*a);
    }
    if(s%11==0)
    System.out.println("the number is a ISBN number");
    else
    System.out.println("the number is not a ISBN number");
  }
}