//find all the letter a in the sentance

import java.util.Scanner;
public class aa
{
 Scanner sc=new Scanner(System.in);
 String str; 
 void input()
 {
  System.out.println("enter the number");
  str=sc.next();
 }
 void compute()
 {
  int count =0;
  for(int i=0;i<str.length()-1;i++)
  {
   if(str.charAt(i)==97)
   {
    count++;  
   }
  }
  System.out.println(";letter a appered "+count+" times");
 }
 static void main()
 {
  aa obj=new aa();
  obj.input();
  obj.compute();
 }
}
