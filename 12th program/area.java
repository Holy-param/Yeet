class area
{
    double area(double a, double b, double c)
    { 
        double s = (a+b+c)/2.0;
        return Math.sqrt(s*((s-a)*(s-b)*(s-c)));
    
    }
    double area(int a, int b, int h)
    {
        return (h*(a+b))/2;
    }
    double area(double d1, double d2)
    {
        return ((d1*d2))/2;
    }
    public static void main(String args[])
    {
        area obj = new area();
        obj.area(6,5,4);
        obj.area(4,5,6);
        obj.area(1,2);
    }
}