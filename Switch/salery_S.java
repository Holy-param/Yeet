
/**
 * Write a description of class salery_S here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class salery_S
{
   void cal(double r, double h)
   {
    if (r<36)
    {
    System.out.println("The salery is"+(r*h));
    }
    else if(r<60)
    {
     double q=(35*r)+(r*1.5)*(h-35);
     System.out.println("The salery is "+q);
    }
    else if(r<70)
    {
    double q=(35*r)+(r*1.5)*(h-35)+(r*2)*(h-60);
    System.out.println("the salry is "+q);
    }
    else
    {
    System.out.println("wrong input :(");
    }
   }
   public static void main(double rate,double hours)
   {
   salery_S sc= new salery_S();
   sc.cal(rate,hours);
   }
}
