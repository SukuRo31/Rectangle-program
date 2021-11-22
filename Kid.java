public class Kid extends Parents
{
String name;
public Kid(String name1)
{
super(name1);
this.name = name;
System.out.println("child");
}
public static void main(String[] args)
{
Kid ch = new Kid("Malar");
}
}
