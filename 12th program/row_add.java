//additon of rows

import java.util.Scanner;
public class row_add
{
 Scanner sc=new Scanner(System.in);
 int arr[][];
 void input()
 { 
  int n=0;
  System.out.println("enter the size of nXn array");
  n=sc.nextInt();
  arr=new int[n][n];
  System.out.println("enther the vales of the array");
  for(int i=0;i<n;i++)
   for(int j=0;j<n;j++)
    arr[i][j]=sc.nextInt();
 }
 void compute()
 {
  for(int i=0;i<arr.length;i++)
  {
    int sum=0;
   for(int j=0;j<arr.length;j++)   
   {
       sum=sum+arr[i][j];
   }
   System.out.println("the sum of row "+(i+1)+" is "+sum);
  }
 }
 void main()
 {
  row_add obj=new row_add();
  obj.input();
  obj.compute();
 }
}