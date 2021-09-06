
import java.util.Scanner;
public class unique
{
 Scanner sc=new Scanner(System.in);
 int m=0,n=0;
 void input()
 {
  System.out.println("enter the m&n");
  m=sc.nextInt();
  n=sc.nextInt();
 }
 void check()
 {
  if(!(m<n))
   System.exit(0);
  if(!(m<30000&&n<30000))
   System.exit(0);
  if(m<0||n<0)
   System.exit(0);
 }
 void compute()
 {
  int count=0;
  for(int a=m;a<=n;a++)
  {
   String temp= String.valueOf(a);
   int k=0;
   for(int b=0;b<temp.length()-1;b++)
   {
     for(int c=b+1;c<temp.length();c++)
     {if(temp.charAt(b)==temp.charAt(c))
      {
       k++; 
       break;
      }
     }
     if(k>0)
      break;
    }
   if(k==0)
   {
    System.out.print(a+", ");
    count++;
   }
  }
  System.out.println("\n total no. of unique digit nos present- "+count);
 }
 static void main()
 {
  unique obj=new unique();
  obj.input();
  obj.check();
  obj.compute();
 }
}
