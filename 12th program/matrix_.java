import java.util.Scanner;
public class matrix_
{
 Scanner sc=new Scanner(System.in);
 int ar[][];
 void input()
 {
  System.out.println("enter the zoise of the array");
  int n=sc.nextInt();
  if(n>=10||n<3)
  {System.out.println("dont put any matrix smaller then 4"); System.exit(0);}
  ar=new int[n][n];
  for(int i=0;i<n;i++)
   for(int j=0;j<n;j++)
   ar[i][j]=sc.nextInt();
  main();
 }
 void main()
 {
  int arr[]=new int[(ar.length-2)*(ar.length-2)];
  for(int j=1,p=0;j<ar.length-1;j++)
  for(int i=1;i<ar.length-1;i++,p++)
  {
   arr[p]=ar[j][i];
  }
  for(int i=0;i<arr.length;i++)//extraction print remove it after
   System.out.println(arr[i]);
  for(int j=0;j<arr.length;j++)
  for(int i=0;i<arr.length-2
  ;i++)
  {
   if(arr[i+1]<arr[i])
   {int temp=arr[i]; arr[i]=arr[i+1]; arr[i+1]=temp;}
  }
  for(int j=1,p=0;j<arr.length-1;j++)
   for(int i=1;i<arr.length-1;i++,p++)
   {
    ar[j][i]=arr[p];
   }
   int sum1=0,sum2=0;
  for(int i=0;i<ar.length;i++)
    sum1=sum1+ar[i][i];
  for(int i=ar.length-1;i>=0;i--)
  sum2=sum2+ar[i][i];
  System.out.println(sum1+"\n"+sum2);
  for(int i=0;i<ar.length;i++)
   for(int j=0;j<ar.length;j++)
   System.out.println(ar[i][j]);
 }
}

