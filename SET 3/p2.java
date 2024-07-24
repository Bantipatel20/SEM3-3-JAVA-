import java.util.*;
public class p2{
    public static void main(String[] args){
            TriangleArea o1= new TriangleArea();
            TriangleArea o2= new TriangleArea(3.0);
            TriangleArea o3= new TriangleArea(2,2);   
            System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
class TriangleArea{
    double r;
    double l,w;
    TriangleArea(){
        r=0;
        System.out.println("DEFAULT CONSTRUCTOR CALLED...!");
    }
    TriangleArea(double x){
        r=x;
        System.out.println("AREA OF TRIANGLE == "+ 3.14*r*r);
    }
    TriangleArea(double a,double b){
        l=a;
        w=b;
        System.out.println("AREA OF TRIANGLE == "+ (l+w)/2);
    }
}