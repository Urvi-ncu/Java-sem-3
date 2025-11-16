public class circle implements geometricobject{
double radius = 1.0;

circle(double radius){
this.radius = radius;}

public double getperimeter(){
return 2*3.14*radius;}

public double getarea(){
return 3.14*radius*radius;}

public double getradius(){
return radius;}

}
