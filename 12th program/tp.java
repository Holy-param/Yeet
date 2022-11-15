//tp
import java.util.Scanner;
public class tp
{
    Scanner sc=new Scanner(System.in);
   int arr[]=new int[5];
    void selection()
 {
  for(int i=0;i<5;i++)
  arr[i]=sc.nextInt();
  for(int i=0;i<arr.length-1;i++)
  {    
   for(int j=0;j<arr.length-2;j++)
   {
    if(arr[j]>arr[j+1])
    {
     int temp=arr[j];
     for(int p=j;p>0;j--)
     {
      arr[p]=arr[p-1];
     }
     arr[0]=temp;
    }
   }
  }
  for(int i=0;i<arr.length;i++)
  System.out.println(arr[i]);
}
void a()
{
 char ch='a';
 int a=(int)ch;
System.out.println(a);
}
}