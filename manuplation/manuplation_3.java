//Pallendrome
import java.util.*;
import reverse.manuplation_2;
public class manuplation_3
{
 int num; 
 void input()
 {
  Scanner sc=new Scanner(System.in);
  num=sc.nextInt();
  manuplation_2 ss=new manuplation_2();
 int a = ss.compute(num);
 if(a==num)
  System.out.println(num+" is a pallendrome no.");
 else
  System.out.println(num+" is not a pallendrome no.");
 }
}
