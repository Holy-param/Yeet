
//
public class q9
{
    int b;
 void p_m()
 {
 for(int i=1;i<21;i++)
 {
  if(i%4==0)
  {
   b=b-i;   
  }
  else
  {
  b=b+i;  
  }
  }
  System.out.println(b);
 }
 void divide(int x)
 {
  double v= 0;
  for(int z=3;z<21;z=z+3)
  {
   v=0;
   v=v+x/2;
  }
  System.out.println(v);
 }
 public static void main(int g)
 {
 q9 sc=new q9();
 sc.p_m();
 sc.divide(g);
 }
}
