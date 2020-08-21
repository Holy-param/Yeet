  
//accpect a no and print its reverse
   package reverse;
import java.util.Scanner;
public class manuplation_2
{

   public int compute(int s)
   {int rev=0;
    int num =s;
    while(num!=0)
    {
     rev=rev*10+num%10;
     num=num/10;
    }
    return rev;
   }
   public void main()
   {
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    manuplation_2 obj=new manuplation_2();
    System.out.println("reverse of number is "+obj.compute(a));
   }
}

