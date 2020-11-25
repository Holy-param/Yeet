import java.util.Scanner;
public class q7
{
   void main()
   {
    System.out.println("enter the name roll no and the marks of computer, maths, physics,chemistry,biology");
    Scanner obj= new Scanner(System.in);
    String roll= obj.nextLine();
    double c= obj.nextDouble();
    double m= obj.nextDouble();
    double p= obj.nextDouble();
    double chem= obj.nextDouble();
    double b= obj.nextDouble();
    double per= ((c+m+p+chem+b)/500)*100;
     if(per>=90)
     {
      System.out.println("Scince with computer");
        }
     else if(per>=80)
     {
      System.out.println("Scince without computers");
        }
     else if(per>=70)
     {
      System.out.println("commerce with maths");
        }
     else if(per>=60)
     {
      System.out.println("commerce without maths");
        }  
     else
     {
      System.out.println(":(");   
        }
   }
}