import java.util.*;
public class p4{
    public static void main(String[] args){
       A a = new A(1);
        B b = new B(2);
        b.display();
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
class A{
    static int  x;
    A(){
    }
    A(int x){
        this.x=x;
    }
}
class B extends A{
    int x;
    B(int x){
        super();
        this.x=x;
    }
    public void display(){
        System.out.println("VARIABLE X OF CLASS A = " + A.x);
        System.out.println("VARIABLE X OF CLASS B = " + x);
    }
}
