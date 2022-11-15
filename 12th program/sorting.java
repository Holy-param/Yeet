
//both the sorting methods
//selection needs to be compleated


import java.util.Scanner;
public class sorting
{
 Scanner sc=new Scanner(System.in); 
 int arr[];
 void input()
 { 
  int n=0;
  System.out.println("enter the size of array");
  n=sc.nextInt();
  arr=new int[n];
  System.out.println("enther the vales of the array"); 
  for(int i=0;i<n;i++)
  arr[i]=sc.nextInt();
  System.out.println("Enter the option number for ur preffered method of sorting \n 1)selction sort \n 2)binary sort");
  int a=sc.nextInt();
 switch(a)
  {
  case 1:
       for(int i=0;i<arr.length;i++)
  {    
   for(int j=0;j<arr.length-1;j++)
   {
    if(arr[j]>arr[j+1])
    {
     int temp=arr[j];
     for(int p=j;p>0;p--)
     {
      arr[p]=arr[p-1];
     }
     arr[0]=temp;
    }
   }
  }
  for(int i=0;i<arr.length;i++)
  System.out.println(arr[i]);
  break;
  case 2:
  bubble();
  break;
  default:
  System.exit(0);
 }
}

  void selection()
  {
   for(int i=0;i<arr.length;i++)
   {    
    for(int j=0;j<arr.length-1;j++)
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
 void bubble()
 {
  for(int i=0;i<arr.length-1;i++)
  {    
   for(int j=0;j<arr.length-1;j++)
   {
    if(arr[j]>arr[j+1])
    {
    int temp=arr[j];
     arr[j]=arr[j+1];
     arr[j+1]=temp;
    }
   }
  }
  for(int i=0;i<arr.length;i++)
  System.out.println(arr[i]);
 }
 }
