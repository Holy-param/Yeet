import java.util.Scanner;
class D2point
{
    double x1,y1;
 D2point()
 {
     x1=0;
     y1=0;
  }
 D2point(double nx,double ny)
 {
     x1=nx;
     y1=ny;
  }
 double distance_2d(double b)
 {
     double dis=0; 
     int x=(int)b; 
     int p=(int)b*100; 
     int temp=p%10; 
     p=p/10;   
     int y=((p%10)*10)+temp;   
     dis=Math.pow(((x-x1)*(x-x1)+(y-y1)*(y-y1)),1/2); 
     return dis; 
    }  
  }
class D3point extends D2point
{
 int z1;
 D3point()
 {
 z1=0;
 }
 D3point(int nz)
 {
  z1=nz;
 }
 double D3point(double z)
 {
    double dis1;
    dis1=Math.pow(((x-x1)*(x-x1)+(y-y1)*(y-y1)+(z-z1)*(z-z1)),1/2);
    return dis;
 }
}