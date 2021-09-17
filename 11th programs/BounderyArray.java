import java.util.Scanner;
public class BounderyArray
{
 Scanner sc=new Scanner(System.in);
 int n=0;
 int m=0;
 int[][] ar;
 void input()
 {
  System.out.println("enther the n and m value of the matrix");
  n= sc.nextInt();
  m=sc.nextInt();
  ar=new int[n][m];
  System.out.println("Enter the numbers to fill the matrix"); 
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
  for(int b=0;b<=m-1;b++)
   System.out.println(ar[0][b]); 
  for(int a=0;a<=n-1;a++)
   System.out.println(ar[a][0]);   
  for(int b=m-1;b>0;b--)
   System.out.println(ar[n-1][b]);
  for(int a=n-1;a>0;a--)
  System.out.println(ar[a][m-1]);
 }
 static void main()
 {
  BounderyArray obj=new BounderyArray();
  obj.input();
  obj.compute();
 }
 }

