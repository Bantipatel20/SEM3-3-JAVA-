import java.util.*;
public class p6{
    public static void main(String[] args){
    complex c1 = new complex();
    complex c2 = new complex();
    complex c3 = new complex();
    complex c4 = new complex();
    complex c5 = new complex();
    c1.getdata();
    c2.getdata();
    c3 = c1.addition(c2);
    c4 = c1.subtraction(c2);
    c5 = c1.mul(c2);
    c3.setdata();
    c4.setdata();
    c5.setdata();
    System.out.println("This Practical is made by 23CS058-Banti Patel");
}

}

class complex{
    int real,image;
    public void getdata(){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value of real number = ");
        real=sc.nextInt();
        System.out.print("Enter the value of imagenary number = ");
        image=sc.nextInt();
    }
    public complex addition(complex x){
        complex temp = new complex();
        temp.real=real+x.real;
        temp.image=image+x.image;
        return temp;
    }
    public complex subtraction(complex x){
        complex temp = new complex();
        temp.real=this.real-x.real;
        temp.image=this.image-x.image;
        return temp;
    }
    public complex  mul(complex x){
        complex temp = new complex();
        temp.real=(this.real+x.real)-(this.image+x.image);
        temp.image=(this.real+x.image)+(this.image+x.real);
        return temp;
    }
    public void setdata(){
        System.out.println("comolex number is == "+real+" + "+image+"i");
    }
}