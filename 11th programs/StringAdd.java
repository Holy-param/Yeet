import java.util.Scanner;
public class StringAdd
{
  String in="";
 Scanner sc=new Scanner(System.in);
 void input()
 {
  System.out.println("enter the string u want the addition of, if a letter is entered its ascii value will be added");   
  in = sc.next();
 }
 void compute()
 {
   char ch;
   double sum=0;
   for(int a=0;a<in.length();a++)
   {
    ch=in.charAt(a);
    double temp=ch;
    sum=sum+temp;
   }
   double avg=sum/in.length();
   System.out.println("the average of the ascii values of the string is "+sum);
 }
 void main()
 {
 StringAdd obj=new StringAdd();
 obj.input();
 obj.compute();
 }
}
