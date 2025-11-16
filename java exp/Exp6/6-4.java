interface A{
void display1();
}

interface B extends A{
void display2(); 
} 

class C implements B{
public void display1(){
System.out.println("display function of interface A");
}

public void display2(){
System.out.println("display function of interface B");
}
}

class driverin{
public static void  main(String[] args){
C obj = new C();
obj.display1();
obj.display2();
System.out.println("URVI NARANG 24CSU226");
}}

