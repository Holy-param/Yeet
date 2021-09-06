
import java.util.Scanner;
public class goldbatch
{
 Scanner sc=new Scanner(System.in);
 int n=0;
 
 void input()
 {
  System.out.print("enter the number u want to check");
  n=sc.nextInt();
  if(((n%2==0)&&(n<50&&n>9))!=true)
  {
    System.out.println("u dumbass");
    System.exit(0);
    }
 }
 void compute()
 {
 for(int t=3;t<n;t=t+2)   
 {
  int flag=0,t3=1;
  for(;t3<t;t3++)
  if(t%t3!=0)
  flag++;
  if(flag==1)
 
    for(int t2=3;t2<n;t2=t2+2) 
   {
     int t4=1,flag1=0;
    for(;t4<t;t4++)
     if(t2%t4!=0)
      flag1++;
    if(flag1==1&&t+t2==n)
     System.out.println(t+","+t2);
    }
 }
 }
 void main()
 {
  goldbatch obj=new goldbatch();
  obj.input();
  obj.compute();
 }
    }

