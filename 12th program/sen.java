import java.util.Scanner;
public class sen
{
 void input()
 {Scanner sc=new Scanner(System.in);
  String p=sc.nextLine();   
  compute(p);
 }
 void compute(String str)
 {
  str=str.toUpperCase();
  System.out.println(str);   
  String ans=" ";
 
  Scanner sc=new Scanner(str); 
  while(sc.hasNext())
  {
  String temp=sc.next();
  if(temp.charAt(0)=='A'||temp.charAt(0)=='E'||temp.charAt(0)=='I'||temp.charAt(0)=='O'||temp.charAt(0)=='U')
  {
   temp=temp+"Y ";
   ans=ans+temp+" "; 
   continue;
  }
  for(int i=0;i<temp.length();i++)
  {
   if(temp.charAt(i)=='A'||temp.charAt(i)=='E'||temp.charAt(i)=='I'||temp.charAt(i)=='O'||temp.charAt(i)=='U')   
   {
    String temp2=temp.substring(0,i);
    temp=temp.substring(i)+temp2+"C";
    break;
   }  
   else if(i==temp.length()-1)
   {
    temp=temp+"N";
    break;
   }
  }
  ans=ans+temp+" "; 
 }
 System.out.println(ans
 );
}
}