public class EShop
{ // class is not private
int price;
private String profit = "30 %";
private EShop()
{
System.out.println("Dec 31 - rs. 500 offer");
}
public EShop(int price)
{
this(); // Explicit call of constructor
this.price = price;
System.out.println("your bill is" + price);
}
public static void main(String[] args)
{
EShop tv = new EShop(10000);
EShop fridge = new EShop(20000);
tv.purchase(1000);
fridge.purchase();
tv.profit();
}
// method overloading - compile time polymorphism
// same method name with diff no of args or
 // with diff types of args in same class
public void purchase(int discount)
{
System.out.println(discount);
}
public void purchase()
{
System.out.println("hi");
}
private void profit()
{
System.out.println(profit);
}
}





