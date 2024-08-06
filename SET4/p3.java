import java.util.*;
public class p3{
    public static void main(String[] args){
        rectangle[] arr;
        arr = new rectangle[1];
        arr[0] = new rectangle(3,2);
        squre[] arr1;
        arr1 = new squre[1];
        arr1[0] = new squre(2,2);
        arr[0].display();
        arr1[0].sdisplay();
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
class rectangle{
    int l,b;
    rectangle(){
        l=0;
        b=0;
    }
    rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void display(){
        System.out.println("Area of Rectangle is = " + l*b);
        System.out.println("Area of Rectangle is = " + 2*(l+b));
    }
}
class squre extends rectangle{
    squre(int l,int b){
        super(l,b);
    }
    public void sdisplay(){
        System.out.println("Area of Square is = " + l*b);
        System.out.println("Area of Square is = " + 4*l);
    }
}