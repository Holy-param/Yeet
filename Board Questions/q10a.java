/**
1*
2* #
3* # *
4* # * #
5* # * # *
 */
public class q10a
{
  void main()
  {
    for(int a=1;a<6;a++)
    {
        System.out.print(a);
        for(int b=1;b<=a;b++)
        {
            
           if(b%2==0)
          {
           System.out.print("#");
          }
           else 
          {
           System.out.print("*");
          }                 
        }
        System.out.print("\n");
    }
  }
}