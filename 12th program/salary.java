
import java.util.Scanner;
public class salary
{
 Scanner sc=new Scanner(System.in);
 double sal,gross,net,hra,da,pf;
 void input()
 {
   sal=sc.nextDouble();  
 }
 void compute()
 {
  da=(75/100)*sal;
  hra=(25/100)*sal;
  pf=(12/100)*pf;
  gross=da+hra+sal;
  net=gross+pf;
  System.out.println("gross="+gross);
  System.out.println("net="+net);
 }
 void main()
 
 {
  salary obj=new salary();
  obj.input();
  obj.compute();
 }
 }

