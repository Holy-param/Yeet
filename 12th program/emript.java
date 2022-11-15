public class emript
{
    int sum=0;
 void emript(int i)
 {
  
 }
 int rev(int i)
 {
    if(i!=0)
    {
      return sum;
    }
    else 
    {
     sum=sum*10+(i%10);
     i=i/10;
     rev(i);
    }
    return 0;
 }
  boolean prime(int n)
 {
    int count=0,j;
   for(j=1;j<=n;j++)
   {
    if(n%j==0)
     count++;
   }
  if(count>2)
  {
   return false;
  }
   else 
   return true;
 }
}
