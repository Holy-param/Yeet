
class  marks 
{
int t1,t2,t3,final_;
  marks()
{
t1=412;
t2=423;
t3=430;
}
void cal()
{
final_= ((30/100)*t1)+((30/100)*t2)+((40/100)*t3);
System.out.println("the final marks out of 500 is ");
double p=(final_/500)*100;
System.out.println("the percentage is "+p);
}
public static void main()
{
marks sc=new marks();

sc.cal();
}
}
