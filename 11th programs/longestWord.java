
import java.util.Scanner;
public class longestWord
{
 String str=""; 
 Scanner sc=new Scanner(System.in);
 void input()
 {
  System.out.println("enter the sentance \n please add a blank space after ur last word");
  str=sc.nextLine();
 
  
 }
 void compute()
 {
   String temp="";
   int ansn=0,ws=-1;
   String answ="";
   for(int a=0;a<str.length();a++) 
   {
    if(str.charAt(a)==32) //looking for blank spaces
    {
     temp= str.substring(ws+1,a);//seprating charecter between first white space and a.
     ws=a;
    }
    System.out.println(temp);
    if(temp.length()>ansn)
    {
     ansn=temp.length();
     answ=temp;
     
    }
    }
   System.out.println("the longest word is "+answ+" with the length "+ansn);
 }
 static void main()
 {
   longestWord obj= new longestWord();
   obj.input();
   obj.compute();
 }
}
