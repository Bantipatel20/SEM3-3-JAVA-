import java.util.*;
public class p6{
    public static void main(String[] args){
        Q o1 = new Q();
        o1.display1();  
        o1.display2();
        o1.display12();
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
interface p1{
   final int  x=10;
   public void display1();
   }
interface p2{
    final int y=20;
    public void display2();
    
}
interface p12 extends p1,p2{
    public void display12();
}
class Q implements p12{
        public void display1(){
            System.out.println("Value of p1 = " + x);
        }
        public void display2(){
            System.out.println("Value of p2 = " + y);
        }
        public void display12(){
            System.out.println("");
            System.out.println("INTERFACE P12");
            System.out.println("");
            System.out.println("Value of p1 = " + x);
            System.out.println("Value of p2 = " + y);
        }       
}
