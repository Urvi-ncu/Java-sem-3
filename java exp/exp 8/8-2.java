import java.lang.Throwable;
class A extends Exception {
String message;
public A(String message){
this.message=message;
}
public void display(){
System.out.println("Stored Message: "+message);
}
}

public class CustomException{
public static void main(String args[]){
try{
throw new A("This is my custom exception message"); }
catch(A e){
e.display(); }
finally{
System.out.println("URVI NARANG 24CSU226"); }
}}

