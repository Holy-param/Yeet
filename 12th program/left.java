//print the lower left with compute and upper left triangle with compute2
import java.util.Scanner;
public class left
{
 Scanner sc=new Scanner(System.in); 
 int arr[][];
 int n=0;
 void input()
 { 
  
  System.out.println("enter the size of array");
  n=sc.nextInt();
  arr=new int[n][n];
  System.out.println("enter the vales of the array"); 
  for(int i=0;i<n;i++)
   for(int j=0;j<n;j++)
    arr[i][j]=sc.nextInt();  
 }
 void compute()
 {
  for(int i=0;i<arr.length;i++)
   {
   for(int j=0;j<=i;j++)
   {
    System.out.print(arr[i][j]+" ");
   } 
   System.out.println();
  }
 }
 void compute2()
 {
  for(int i=0;i<n;i++)
  {
   for(int j=i;j<n;j++)
   {
    System.out.print(arr[i][j]+" ");
   } 
   System.out.println();
  }
 }
 void main()
    {
  left obj = new left();
  obj.input();
  obj.compute();
  obj.compute2();
 }
}