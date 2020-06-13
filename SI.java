
/**
 * Write a description of class SI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SI
{
    double r,t,p,ans;
   SI()
   {
     p =10000;
     r =5;
     t =2;
   }
   void cal()
   {
    ans=(p*r*t)/100; 
   }
   void print_()
   {
   System.out.println(ans); 
   }
}
