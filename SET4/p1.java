import java.util.*;
public class p1{
    public static void main(String[] args){
        parent p = new parent();
        child c = new child();
        p.pmethod();
        c.cmethod();
        c.pmethod();
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
class parent{
    public void pmethod(){
        System.out.println("This is parent class");
    }
}
class child extends parent{
    public void cmethod(){
         System.out.println("This is Child class");
    }
}
