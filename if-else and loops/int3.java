//wap to take three integer and print the values in asending order
/**
 * Write a description of class int3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class int3
{
  void main(int a,int b,int c)
  {
   int l=((a>b)&&(a>c))?a:((b>a)&&(b>c))?b:c;
   int s=((a<b)&&(a<c))?a:((b<a)&&(b<c))?b:c;
   int m=((a>b)&&(a<c))||((a>c)&&(a<b))?a:((b>c)&&(b<a))||((b>a)&&(b<c))?b:c;
   System.out.println("the largest no is "+l+"\n the second largest no. is "+m+"\n the smallest no is "+s);
  }
}
