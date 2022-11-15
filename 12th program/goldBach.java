
public class goldBach
{
 void main(int i)
 {
  for(int p=0;p<i;p++)
  {if(!prime(i))
    {
    continue;
    }
    for(int j=0;j<i;j++)
    { 
     if((i+j)==i&&prime(j))
    {
     System.out.println("the number "+i+" is goldbatch");
     System.exit(0);
    }
   }
  }
  System.out.println("the number"+i+"is not goldbatch");
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
   System.out.println("the factors are "+n+" and "+j); 
   return false;
  }
   else 
   return true;
 }
}
