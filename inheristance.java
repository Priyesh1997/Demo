public class Demo {
   int a; 
Demo()
 {
 this(10);
}

Demo(int a)
{
this();
}

void show()
{
System.out.println(a);
}
public static void main(String[]  args)
{
Demo b = Demo(10);
}
}
