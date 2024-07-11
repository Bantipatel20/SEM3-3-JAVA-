import java.util.*;
public class p1{
    public static void main(String[] args){
        System.out.println("Enter the string : ");
        Scanner it = new Scanner(System.in);
        String s= it.nextLine();
        int x=s.length();
        if(x<3){
             System.out.println("Enter valid string....!");
        }
        else{
            System.out.println("Enter the number : ");
            int n = it.nextInt();
            String s1 = s.substring(0,3);
            for(int i=0;i<n;i++){
                System.out.print(s1);
            }
        }
        it.close();
         System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}