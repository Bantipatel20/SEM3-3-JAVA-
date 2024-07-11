import java.util.*;
public class p5{
    public static String duochar(String s1) {
        String[] s2 = s1.split(" ");
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < s2.length; i++) {
            String reversedWord = new StringBuilder(s2[i]).reverse().toString();
            ss.append(reversedWord).append(" ");
        }
        return ss.toString().trim();
    }
        public static void main(String[] args){
        System.out.println("Enter the string : ");
        Scanner it = new Scanner(System.in);
        String s= it.nextLine();
        System.out.println(duochar(s));
        it.close();
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
