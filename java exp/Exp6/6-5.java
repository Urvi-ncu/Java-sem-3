interface one{
void display1();}

interface two{
void display2();}

interface three extends one, two{
void display3();}

class real implements three{
public void display4(){
System.out.println("display function of class");}
public void display1(){
System.out.println("Display function of interface 1");}
public void display2(){
System.out.println("Display function of interface 2");}
public void display3(){
System.out.println("Display function of interface 3");}
}

class driverinterface{
public static void main(String args[]){
real obj = new real();
obj.display1();
obj.display2();
obj.display3();
obj.display4();
System.out.println("URVI NARANG 24CSU226");

}}







  
