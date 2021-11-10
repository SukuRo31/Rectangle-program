public class Circle
{
public static void main(String[] args)
{
Circle circle = new Circle();
double y = circle.calculateArea(3.14,20);
System.out.println(y);
}
public double calculateArea(double pi,int r)
{
return 3.14*r*r;
}
}
