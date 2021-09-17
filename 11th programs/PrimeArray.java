import java.util.Scanner;
public class PrimeArray
{
 Scanner sc=new Scanner(System.in);
 int[][] ar;
 int n=0,m=0;
 void input()
 {
  System.out.println("enter the n and m for the array");
   n=sc.nextInt();
   m=sc.nextInt();
  ar=new int[n][m];
  System.out.println("enter the values to fill the array");
  for(int a=0;a<n;a++)
  {
   for(int b=0;b<m;b++)
   {
    ar[a][b]=sc.nextInt(); 
   }
  }
 }
 void compute()
 {
     
   for(int a=0;a<n;a++)
    for(int b=0;b<m;b++)
   {
     int c=0;int f=ar[a][b];
     
     for(int i=1;i<=ar[a][b];i++)
        {
            if(f%i==0)
                c++;
            
        } 
     if(c==2)
             System.out.println(ar[a][b]+" is a prime no.");
   }
  } 
 static void main()
 {
  PrimeArray obj=new PrimeArray();
  obj.input();
  obj.compute();
 }
}
