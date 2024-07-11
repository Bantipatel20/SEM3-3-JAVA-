import java.util.*;
public class p3{
    public static boolean check(int[] a, int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==9 && i<4){
                count++;
            }
        }
        if(count!=0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
         Scanner it = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = it.nextInt();
        int[] a=  new int[n];
         System.out.print("Enter the array Element = ");
        for(int i=0;i<n;i++){
            a[i]=it.nextInt();
        }
        if(check(a,n)){
            System.out.println("True");
        }
        else{
             System.out.println("False");
        }
        it.close();
         System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}