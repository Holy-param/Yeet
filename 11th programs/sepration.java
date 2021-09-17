
import java.util.Scanner;
public class sepration
{
  String str="";
  Scanner sc=new Scanner(System.in);
  void input()
  {
  System.out.println("enter the word u wanna seprate");
  str=sc.next();
 }
  void compute()
  {
   for(int temp=0;temp<str.length();temp++)
   {
   int temp2=(int)str.charAt(temp);
   if(temp2==65||temp2==97)
    System.out.println(str.charAt(temp)+" is a vowel");
   else if(temp2==69||temp2==101)
    System.out.println(str.charAt(temp)+" is a vowel");
     else if(temp2==73||temp2==105)
    System.out.println(str.charAt(temp)+" is a vowel");
    else if(temp2==79||temp2==111)
    System.out.println(str.charAt(temp)+" is a vowel");
    else if(temp2==85||temp2==117)
    System.out.println(str.charAt(temp)+" is a vowel");
   else
    System.out.println(str.charAt(temp)+" is a consonent");
  }
 }
 void main()
 {
  sepration obj= new sepration();
  obj.input();
  obj.compute();
 }
}
