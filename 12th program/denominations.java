import java.util.Scanner;
public class denominations
{
 Scanner sc=new Scanner(System.in);
 int num,count;
 void input()
 {
     System.out.println("enther the number");
     num=sc.nextInt();
 }
 void main()
 {
  input();
  while(num>=2000)
  {
   num-=2000;
   count++;
    }
  System.out.println("number of 2000 notes: "+count);
  count=0;
    while(num>=500)
  {
   num-=500;
   count++;
    }
  System.out.println("number of 500 notes: "+count);
  count=0;  
  while(num>=100)
  {
   num-=100;
   count++;
    }
  System.out.println("number of 100 notes: "+count);
  count=0;  
  while(num>=50)
  {
   num-=50;
   count++;
    }
  System.out.println("number of 50 notes: "+count);
  count=0;  
  while(num>=10)
  {
   num-=10;
   count++;
    }
  System.out.println("number of 10 notes: "+count);
  count=0;  
  while(num>=5)
  {
   num-=5;
   count++;
    }
  System.out.println("number of 5 coins: "+count);
  count=0;
  while(num>=2)
  {
   num-=2;
   count++;
    }
  System.out.println("number of 2 coins: "+count);
  count=0; 
  while(num>=1)
  {
   num-=1;
   count++;
    }
  System.out.println("number of 1 notes: "+count);
  count=0;
 }
}

