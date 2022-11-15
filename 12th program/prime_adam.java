import java.util.*; 
public class prime_adam
{
  Scanner sc=new Scanner(System.in);
  boolean prime(int n)
 {
    int count=0,j;
   for(j=1;j<=n;j++)
   {
    if(n%j==0)
     count++;
   }
  if(count>2)
  {
   return false;
  }
   else 
   return true;
 }
 void input()
 {
  int n=sc.nextInt();
  if(!prime(n))
  {System.out.println("not a prime number"); System.exit(0);}
  
  if(compute(n))
  {System.out.println("it is a prime adam number");}
  else
  {System.out.println("it is not a prim,e adam number");}
 }
 boolean compute(int n)
 {
  int squre1=n*n,temp=0,temp2=0;
  while(n!=0)
  {
   temp=(temp*10)+n%10;
   n=n/10;
   
  }
  while(temp!=0)
  {
   temp2=(temp2*10)+temp%10;
   temp=temp/10;
   
  }
  if(squre1==temp2*temp2)
  return true;
  else 
  return false;
 }
}
