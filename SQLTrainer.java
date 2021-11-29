public class SQLTrainer extends Trainer
{
SQLTrainer(String s1 , String s2)
{
super("super","sub");
String department = s1;
String Tech = s2;
System.out.println(department);
System.out.println(Tech);
}
public static void main(String[] args)
{
SQLTrainer ram = new SQLTrainer("cse","payilagam");
System.out.println(ram.dept);
System.out.println(ram.institute);
ram.training();
int res=ram.getsalary();
System.out.println(res);
}
}

