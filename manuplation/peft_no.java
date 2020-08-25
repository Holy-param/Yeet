import java.util.Scanner;
public class peft_no
{
    int s=0;
 void main()
 {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  peft_no obj=new peft_no();
  obj.compute(a);
  if(s==a)
   System.out.println("the no is a perfect no");
   else 
   System.out.println("the no is not a perfect no");
 }
 void compute(int num)
 {
   for(int a=1;a<num;a++)
   {
    if(num%a==0)
    {
    s=s+a;
    } 
   }
 }
}
