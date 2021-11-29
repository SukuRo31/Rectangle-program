public class Samsung extends FactoryDemo
{
static int price = 5000;
int call(int seconds)
{
System.out.println("call");
return seconds;
}
void sendMessage()
{
System.out.println("msg");
}
void receiveCall()
{
System.out.println("call");
}
void Fingerprint()
{
System.out.println("finger");
}
void Pattern()
{
System.out.println("five");
}
public static void main(String[] args)
{
Samsung sam = new Samsung();
sam.browse();
sam.sendMessage();
sam.receiveCall();
sam.Fingerprint();
sam.Pattern();
System.out.println(sam.price);
}
}
