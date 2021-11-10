public class Triangle
{
public static void main(String[] args)
{
Triangle triangle = new Triangle();
double z = triangle.calculateArea(10,20);
System.out.println(z);
}
public double calculateArea(int b , int h)
{
return 0.5*b*h;
}
}
