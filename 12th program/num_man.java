import java.util.Scanner;
public class num_man
{
 Scanner sc=new Scanner(System.in);
 void input()
 { 
  System.out.println("enter n and m");   
   int n=sc.nextInt();
   int m=sc.nextInt();
   compute(n,m);
 }
 void compute(int n,int m)
 {
  for(int i=m+1;i<m+1000;i++)
  {
   sum(i,n);  
  }
 }
 void sum(int i,int n)
 {  
    int sum=0;
    int te=i;
    while(i!=0)
    {
     sum=sum+i%10;
     i=i/10;
    }
    if(sum==n)
    {
     System.out.println(te);
     System.exit(0);
    }
 }
}
