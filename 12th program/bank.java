//banking system with deposit and withdraw function
import java.util.Scanner;
public class bank
{
 double bal;
 String acc,name,type;
 Scanner sc=new Scanner(System.in);
 void input()
 {
  System.out.println("enter ur name");
  name=sc.nextLine();
  System.out.println("enter the type of acc 1)savings 2)current");
  type=sc.next();
  if(type.equals("savings"))
  {
    System.out.println("enter ur balance");
    bal=sc.nextDouble();
  }
  else
  {
   System.out.println("how dare u put anything else then savings. do u even know how long it takes me \n to write this code and ur here knowing there is no code for current and yet typing \n it in like u dont even care abt my efforts. man come on have some mercy on this \n poor student.Some day if i go insane u will know who is responsible, the person \n who knowing decided to mess with my code, seems like u have no humanity in urself.\n I am so freaking disapointed   :(");   
   System.exit(0);
  }
 }
 void compute()
 {
  System.out.println("enter w for withdrawl and d for deposit");
  char de=sc.next().charAt(0);
  double wip;
  if(de=='w')
  {
   System.out.println("enter the amount to withdraw(make sure its above minimum balance) \n bal:"+bal);  
   wip=sc.nextDouble();
   if(bal-wip<1000)
   {
    System.out.println("i swear to god what are u doing my man, i even showed u ur balance,are u a american that u messed up basic addition."); 
   }
   else
   {
    System.out.println("the new bal is:"+(bal-wip)); 
    bal-=wip;
   }
  }
  else
  {
   deposit();  
  }
 }
 void deposit()
 {
  System.out.println("how much do u want to deposit?");
  double dip=sc.nextDouble();
  bal+=dip;
  System.out.println("ur new balance is:"+bal);
 }
 static void main()
 {
  bank obj=new bank();
  obj.input();
  obj.compute();
 }
} 

