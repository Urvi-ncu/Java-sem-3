abstract class Shape
{
abstract void RectangleArea(double length,double breadth);
abstract void SquareArea(double side);
abstract void CircleArea(double radius);
}

class Area extends Shape
{
void RectangleArea(double length,double breadth)
{
System.out.println("Area of Rectangle: "+(length*breadth));
}
void SquareArea(double side)
{
System.out.println("Area of Square: "+(side*side));
}
void CircleArea(double radius)
{
System.out.println("Area of Circle: "+(3.14*radius*radius));
}
}

class mainshape
{
public static void main(String[] args)
{
Area a=new Area();
a.RectangleArea(5,10);
a.SquareArea(4);
a.CircleArea(3);
System.out.println("URVI NARANG 24CSU226");
}
}

