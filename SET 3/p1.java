import java.util.*;
public class p1{
    public static void main(String[] args){
        double pound,rupee;
        Scanner it=new Scanner (System.in);
        System.out.print("Enter the value of pound = ");
        pound=it.nextDouble();
        it.close();
        rupee=pound*100;
        System.out.println("RUPEES == "+rupee);
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}