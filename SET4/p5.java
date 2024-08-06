import java.util.*;
public class p5{
    public static void main(String[] args){
        Degree o1 = new Degree();
        Undergraduate o2 = new Undergraduate();
        Postgraduate o3 = new Postgraduate();
        o1.display();
        o2.display();
        o3.display();
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
class Degree{
    public void display(){
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree{
    public void display(){
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree{
    public void display(){
        System.out.println("I am a Postgraduate");
    }
}

