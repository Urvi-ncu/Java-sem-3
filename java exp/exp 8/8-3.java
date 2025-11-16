import java.lang.Throwable;
class ExceptionExample{
public static void main(String args[]){
try{
throw new Exception("Exception occurred");
}
catch(Exception e){
System.out.println("Caught exception "+e);
}
finally{
System.out.println("Finally block");
System.out.println("URVI NARANG 24CSU226");
}
}}

