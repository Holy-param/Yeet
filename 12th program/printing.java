import java.util.*;
public class printing
{
  Scanner sc=new Scanner(System.in);
  String ar[]={"one","two","three","four","five","six","seven","eight","nine"};
  String str;
  void input()
  {
    System.out.println("enter the number ");
   str=sc.next();
  } 
  void compute()
  {
      String ans;
   if(str.length()==5)
   {
    if(str.charAt(0)=='0')
    {
     ans=ar[str.charAt(1)]+" Thousand";
    }
    else if(str.substring(0,2).equals(10))
    {
    ans="ten Thousand";
    }
    else if(str.substring(0,2).equals(11))
    {
    ans="eleven Thousand";
    }
    else if(str.substring(0,2).equals(12))
    {
     ans="twelve Thousand";
    }
   }
 }
}
