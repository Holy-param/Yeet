
import java.util.Scanner;
public class string_add
{
 String str="";
 int ans=0;
 Scanner sc=new Scanner(System.in);
  void input()
  {
  System.out.println("input the number u wanna ad the digits off");  
   str= sc.next();
 }
 void compute()
 {
  for(int temp=0;temp<str.length();temp++)
  {
   ans=ans+(int)str.charAt(temp);
 }
  System.out.println(ans);
 }
 static void main()
 {
   string_add obj=new string_add();
   obj.input();
   obj.compute();
 }
}

