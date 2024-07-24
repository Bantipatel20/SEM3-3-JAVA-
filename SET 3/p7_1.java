import java.util.*;
public class p7_1{
    public static void main(String[] args){
        int count = 28;
        System.out.println("Before value = "+count);
        modify(count);
        System.out.println("After modify = "+count);
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
    public static void modify(int y){
        y++;
        System.out.println("Modify value = "+y);
    }
}