
public abstract class FactoryDemo extends SmartPhone1
{
static int price = 0;
boolean isOriginalPiece = false;
abstract void Fingerprint();
abstract void Pattern();
void browse()
{
System.out.println("FactoryDemo browsing");
}
}
