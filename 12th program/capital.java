import java.util.Scanner;
public class capital
{
 String str;
 void input()
 {  
  Scanner sc=new Scanner(System.in);
  str=sc.nextLine();
 }
 void compute()
 {
  Scanner sc=new Scanner(str);   
  int count=0,temp1;
  while(sc.hasNext())
  {
   String temp=sc.next();
   temp1=temp.charAt(0);
   if(temp1>63&& temp1<91)
    count++;  
  }
  System.out.println("the number of capital words in this sentance is: "+count);
 }
 static void main()
 {
  capital obj=new capital();
  obj.input();
  obj.compute();
 }
}
