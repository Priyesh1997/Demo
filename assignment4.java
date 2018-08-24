SOLUTION 1:
STATIC CODE IMPLEMENTATION

import java.util.*;
class SBLOCK {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block ");
    }
    SBLOCK(){
        System.out.println("Constructor");
    }
}
 
public class Main {
    public static void main(String args[]) {
 
       SBLOCK t1 = new SBLOCK();
       SBLOCK t2 = new SBLOCK();
    }
}

------------------------------------------------------------------------------------

SOLUTION 2:
ANIMAL CLASS AND FUNCTION OVERRIDING

import java.util.Scanner;
abstract class Anim
{
    private String breed,colour;
    Anim(String breed,String colour)
    {
        this.breed = breed;
        this.colour = colour;
    }
    public String getBreed()
    {
        return breed;
    }
    public String getColour()
    {
        return colour;
    }
    public abstract void speak();
}
class Dog extends Anim
{
    Dog(String b, String c)
    {
        super(b,c);
    }

    public void speak()
    {
        System.out.println("Dog barks"+"nbreed = "+getBreed()+"ncolour = "+getColour());
    }
}
class Cat extends Anim
{
    Cat(String b, String c)
    {
            super(b,c);
    }
    public void speak()
    {
        System.out.println("Cat meows"+"nbreed = "+getBreed()+"n colour = "+getColour());
    }
}
public class animal
{
    public static void main(String args[])
    {
        Cat c = new Cat("Persian","white");
        Dog d = new Dog("german shephard","black");
        d.speak();
        c.speak();
    }
}

-------------------------------------------------------------------------------------------------------

SOLUTION 3:
OVERLOAD PRINT FUNCTION

import java.util.Scanner;
class Print
{
    public void print()
    {
        System.out.println("NULL argument");
    }
    public void print(int x)
    {
        System.out.println("Integer argument"+ x);
    }
    public void print(float x)
    {
        System.out.println("float argument"+x);
    }
}
public class overload
{
    public static void main(String args[])
    {
        Print a = new Print();
        Print b = new Print();
        Print c = new Print();
        a.print();
        b.print(5);
        c.print(5.5f);
    }
}

--------------------------------------------------------------------------------------------------------

SOLUTION 4:
VEHICLE CLASS AND OVERRIDING

import java.util.Scanner;
abstract class Vehicle
{

    public abstract void start();
    public void stop()
    {
        System.out.println("Vehicle Stoped");
    }
}
class twowheeler extends Vehicle
{
        public void start()
        {
                System.out.println("twowheeler Started");
        }   
}
class fourwheeler extends Vehicle
{
        public void start()
        {
                System.out.println("fourwheeler Started");
        }
}
public class vehic
{
    public static void main(String args[])
    {
        twowheeler t = new twowheeler();
        fourwheeler f = new fourwheeler();
        t.start();
        t.stop();
        f.start();
        f.stop();
    }
}