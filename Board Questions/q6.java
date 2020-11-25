//WAP to check whether a number is a valid ISBN number or not.
//The International Standard Book Number (ISBN)’ which is a unique number. By this number, we can find any book. It is a 10 digit number. The ISBN is legal if 1*digit1 + 2*digit2 + 3*digit3 + 4*digit4 + 5*digit5 + 6*digit6 + 7*digit7 + 8*digit8 + 9*digit9 + 10*digit10 is divisible by 11.
//Example: For an ISBN "1259060977"
//Sum = 1*10 + 2*9 + 5*8 + 9*7 + 0*6 + 6*5 + 0*4 + 9*3 + 7*2 + 7*1 = 209
//Now divide it with 11 = 20%/11 = 0. If the resultant value will be Zero then it is a valide ISBN

import java.util.Scanner;
public class q6
{
  void main()
  {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   q6 obj=new q6();
   obj.compute(a);
  }
  void compute(int num)
  {
      int a=0,s=0;
    for(int i=10;num!=0;i--)
    {
    a=num%10;
    num=num/10;
    s=s+(i*a);
    }
    if(s%11==0)
    System.out.println("the number is a ISBN number");
    else
    System.out.println("the number is not a ISBN number");
  }
}