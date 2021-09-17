import java.util.Scanner;
public class StringSort
{
  String in="";
  Scanner sc=new Scanner(System.in);
  void input()
  {
   in=sc.next();  
  }
   void compute()
   {
   for(int a=0;a<in.length();a++)  
   {
     if(in.charAt(a)==97||in.charAt(a)==101||in.charAt(a)==105||in.charAt(a)==111||in.charAt(a)==117)
     {
       System.out.println("this letter is a vowel"+in.charAt(a));
     }
     else if(in.charAt(a)==65||in.charAt(a)==69||in.charAt(a)==73||in.charAt(a)==79||in.charAt(a)==85)
     {  
         System.out.println("this letter is a vowel"+in.charAt(a));
     }
     else 
     System.out.println("its a digit or consonent"+in.charAt(a));
    }
  }
  static void main()
  {
   StringSort obj=new StringSort();
   obj.input();
   obj.compute();
  }
}