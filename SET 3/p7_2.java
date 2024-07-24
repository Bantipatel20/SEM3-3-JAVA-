import java.util.*;
public class p7_2{
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("HELLO");
        System.out.println("Before modify == "+ s);
        modify(s);
        System.out.println("After modify == "+ s);
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
    public static void modify(StringBuilder s){
        s.append(" world");
        System.out.println("Modify == "+s);
    }
}