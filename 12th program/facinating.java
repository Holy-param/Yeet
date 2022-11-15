import java.util.*;
public class facinating
{
 Scanner sc=new Scanner(System.in);
 void input()
 {
  int i=sc.nextInt();
  compute(i);
 }
 void compute(int i)
 {
  int[] ar=new int[9];
  String n="";
  n=String.valueOf(i);
  for(int j=0;j<9;j++)
  {
    ar[j]=0;
  }
  int temp=i;
  while(temp!=0)
   {ar[temp%10]=1; temp=temp/10;}
  for(int j=2;j<10;j++)
  {
    if(ar[j]==0)
     n=n+String.valueOf(j);
     ar[j]=1;
     temp=j*i;
     while(temp!=0)
    {if(ar[temp%10]==0)
      n=n+String.valueOf(temp%10);
     ar[temp%10]=1; temp=temp/10;}
    for(int p=0;p<10;p++)
    {
     int count=0;
     if(ar[p]==1)
     count++;
     if(count==10)
     System.exit(0);
    }
  }
 }
 }
