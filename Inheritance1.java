class Parent
{
	 Parent(){
       System.out.println("Parent="+this);
	 }
}
public class Inheritance1 extends Parent{
	 Inheritance1(){
       System.out.println("Child="+this);
	 }
	 public static void main(String...x){
         Inheritance1 obj=new Inheritance1();
	 }
}