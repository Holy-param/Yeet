class prime{
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