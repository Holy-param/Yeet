
/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class employee
{
 float g=0.0f;
 String name;
 void input()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Entry the Salery and the NAme of the employee respectively");
  g=sc.nextFloat();
  name=sc.nextLine();
  name=sc.nextLine();
  System.out.println("The employee "+name+" has a salary of "+salary(g));
 }
 float salary(float s)
 {
  s=s+((50.0f/100.0f)*s);
  return s;
 }
 public static void main()
 {employee obj =  new employee();
     obj.input();
     Float g=obj.salary(100);
    }
}

 
 

