
/**
 5 4 3 2 1
 5 4 3 2
 5 4 3
 5 4
 5
 */
public class q10b
{
 void main()
 {
  int t=0;
  int i=5;
  for(int z=1;z<6;z++)
  { 
   t=t+1;
   i=5;
   for(;i>=t;i--)
   {
    
    System.out.print(i);
   }
   System.out.print("\n");
  }
 }
}