public class TamilNadu extends SouthIndia
{
static String captial = "Chennai";
public static void main(String[] args)
{
SouthIndia si = new TamilNadu("modi");
si.cultivate();
si.livingStyle();
si.speakLanguage();
si.eat();
si.dress();
System.out.println(India.captial);
System.out.println(TamilNadu.captial);

}
public void cultivate()
{
System.out.println("Rice and Sugarcane cultivation");
}
public void livingStyle()
{
System.out.println("above Average development");
}
public void speakLanguage()
{
System.out.println("tamil");
}
 public void eat()
{
System.out.println("puffs");
}
 public void dress()
{
System.out.println("jeans");
}
TamilNadu(String primeMinister)
{
super("modi");
System.out.println("modi");
}

}
