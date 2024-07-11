import java.util.*;
public class p4{
    public static String duochar(String s){
        int n=s.length();
        String s2="";
        for(int i=0;i<n;i++){
            s2 += s.charAt(i);
            s2 += s.charAt(i);
        }
        return s2;
    }
    public static void main(String[] args){
        System.out.println("Enter the string : ");
        Scanner it = new Scanner(System.in);
        String s= it.nextLine();
        String s1= duochar(s);
        System.out.println(s1);
         System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}