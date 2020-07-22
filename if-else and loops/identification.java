//wap to input a charecter and to print weather it is an alphabet digit or anyother charecter.
public class identification
{
 void main( char a)
 { 
  int b=Character.getNumericValue(a);
  if((b>64&&b<89)||(b>96&&b<123))
  {
   System.out.println("alphabet");
  }
  else if(b>48&&b<58)
  { 
   System.out.println("numerical"); 
  }
  else
  {
  System.out.println("charecter");  
  }
 }
}