package India.newDelhi;
 class CommonManInDelhi implements TrafficRulesDelhi,tamilnadu1.chennai1.TrafficRules
{
public static void main(String[] args)
{
CommonManInDelhi ll = new CommonManInDelhi();
ll.goByDieselVechile();
ll.dontgoByDieselVechile();
ll.goByBicycle();
}
 public void goByDieselVechile()
{
System.out.println("car");
}
public void dontgoByDieselVechile()
{
System.out.println("ok");
}

public void goByBicycle()
{
 System.out.println("yes");
}
}

