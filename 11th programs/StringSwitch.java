
import java.util.Scanner;
public class StringSwitch
{
 Scanner sc=new Scanner(System.in);
 String in;
 char r;
 void input()
 {
  System.out.println("enter thje word and the letter u want to replace");
  in=sc.next();
  r=sc.next().charAt(0);
 }
 void Joystring()
 {
  String temp,temp1;
  for(int a=0;a<in.length();a++)
   if(in.charAt(a)==r)
   {
     if(a==0)
     {
      temp=in.substring(1);
      in=r+temp;
     }
     else 
     {
      temp=in.substring(0,a);
      temp1=in.substring(a+1);
      in=temp+r+temp1;
    }
    }
 } 
 void main()
 {
  StringSwitch obj=new StringSwitch();
  obj.input();
  obj.Joystring();
 }
}
