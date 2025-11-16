interface IN1{
void display1();
}

interface IN2{
void display2();
}

class first{
void display3(){
System.out.println("second class extends first class");}
}

class second extends first implements IN1,IN2{
void display(){
System.out.println("this is class second");
}

public void display1(){
System.out.println("CLASS SECOND IMPLEMENTS INTERFACE IN1");
}

public void display2(){
System.out.println("CLASS SECOND IMPLEMENTS INTERFACE IN2");
}
}

class driver{
public static void main(String[] args){
second obj = new second();
obj.display1();
obj.display2();
obj.display3();
obj.display();
System.out.println("URVI NARANG 24CSU226");
}
}


