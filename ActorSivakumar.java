public class ActorSivakumar implements Actor
{
int a;
String b;
static String address = "coimbatore";
ActorSivakumar(int a, String b)
{
a = a;
b = b;
System.out.println(a);
System.out.println(b);
}
public static void main(String[] args)
{
ActorSivakumar as = new ActorSivakumar(65,"Audi Car");
as.act();
as.dance();
as.sing();
as.speaking();
System.out.println(as.makeUpRequired);
System.out.println(ActorSivakumar.address);

Actor ac = new ActorSivakumar(65,"Surya");
ac.act();
ac.dance();
ac.sing();
System.out.println(ac.address);

}
public void act()

{
System.out.println("acting");
}
public void dance()
{
System.out.println("dancing");
}
public void sing()
{
System.out.println("singing");
}
public void speaking()
{
System.out.println("speaking");
}


}
