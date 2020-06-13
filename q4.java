
/**
 * Write a description of class q4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class q4
{
    void main()
    {
        int z=0;
        Scanner obj= new Scanner(System.in);
      while(z<1)
      {
      
       System.out.println("1)Term Deposit \n 2)Recurring deposit \n press the no. of the option you want to choose");
       int i= obj.nextInt();
        if(i==1)
       {
           System.out.println("give the principal,rate and no. of years respectively");
           double p= obj.nextInt();
           double r= obj.nextInt();
           double n= obj.nextInt();
          double a=p*Math.pow(1+(r/100),n);
           System.out.println("The maturity amount is "+a);
           z++;
       }
       else if(i==2)
       {
        System.out.println("give the monthly installment ,rate of intrest and the time period respectively");   
        double p= obj.nextInt();
        double r= obj.nextInt();
        double n= obj.nextInt(); 
        double a=p*n+p*(n*(n+1)/2)*(r/100)*1/12;
        System.out.println("THe maturity amount is "+a);
        z++;
       }
       
       else
       {
        System.out.println("invalid number :( ");
        }
      }
    }
}
