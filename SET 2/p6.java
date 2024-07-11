import java.util.*;
public class p6{
    public static int  slength(String s){
            int n = s.length();
            return n;
    }
    public static String tolwr(String s){
            String ss = s.toLowerCase();
            return ss;
    }
    public static String toupr(String s){
            String ss = s.toUpperCase();
            return ss;
    }
    public static String torev(String s){
            return new StringBuilder(s).reverse().toString().trim();
    }
    public static String tosort(String s){
        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static void main(String[] args){
        System.out.print("Enter the string : ");
        Scanner it = new Scanner(System.in);
        String s= it.nextLine();
        it.close();
        System.out.println(slength(s));
        System.out.println(tolwr(s));
        System.out.println(toupr(s));
        System.out.println(torev(s));
        System.out.println(tosort(s));
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
