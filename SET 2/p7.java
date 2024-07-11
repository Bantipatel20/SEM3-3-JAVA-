import java.util.*;
public class p7{
    public static int  tolength(String s){
            int n = s.length();
            return n;
    }
    public static String toupr(String s){
            String ss = s.toUpperCase();
            return ss;
    }
    public static String toreplace(String s){
            String ss = s.replace('H','N');
            return ss;
    }
    public static String toextract(String s){
        String ss=s.substring(0,8);
        return ss.toString();
    }
    public static void main(String[] args){
        String s="CHARUSAT University";
        System.out.println(tolength(s));
        System.out.println(toreplace(s));
        System.out.println(toupr(s));
        System.out.println(toextract(s));
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}