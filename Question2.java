import java.io.*;
import java.util.Scanner;

class shape
{
    protected static int l,b,h;
    public void inputData()
    {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        this.l = x;
        this.b = y;
        this.h=z;
    }
    double area()
    {
        return 0;
    }
}

class circle extends shape
{
    @Override
    double area()
    {
        int rd=super.l;
        return 3.14*rd*rd;
    }
}

class rectangle extends shape
{
    @Override
    double area()
    {
        int length,breadth;
        length=super.l;
        breadth=super.b;
        return length*breadth;
    }
}

class trapezoid extends shape
{
    @Override
    double area()
    {
        int h1;
        h1=super.h;
        return (((super.l+super.b)*h1)/2);
    }
}

class Question2
{
    public static void main(String[] args)
    {
        shape s=new shape();
        s.inputData();
        circle c=new circle();
        rectangle r=new rectangle();
        trapezoid t=new trapezoid();
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectengle: " + r.area());
        System.out.println("Area of Trapezoid: " + t.area());
    }
}