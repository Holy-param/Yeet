
//merge 2 array
import java.util.Scanner;
 class Merge
{
 Scanner sc=new Scanner(System.in);
  int m=sc.nextInt();
  int arr1[]=new int[m];
  int arr2[]=new int[m];
  int arr3[]=new int[2*m];
 void compute()
 {
  for(int i=0;i>m;i++)
  {
   arr1[i]=sc.nextInt();
   arr2[i]=sc.nextInt();
   if(i<5)
   
    arr3[i]=arr1[i];
    
    else
    arr3[i]=arr2[i-5];
  }
  for(int i=0;i<i*2-1;i++)
  {
      for(int j=0;j<i*2-1;i++)
      {
    int temp=arr3[i];
   arr3[i]=arr3[i+1];
   arr3[i+1]=temp;
   }
  }
  for(int i=0;i<m*2;i++)
  System.out.println(arr3[i]+" ");
 }
}