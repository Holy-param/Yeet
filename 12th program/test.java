import java.util.*;
public class test
{
  void main()
 {
  String str="Hi my name is sohaam";
  Scanner sc=new Scanner(str);
   String ar[]=new String[str.length()];
   int i=0;
  while(sc.hasNext())
  {
   ar[i]=sc.next();
   i++;
  }
 }
}
