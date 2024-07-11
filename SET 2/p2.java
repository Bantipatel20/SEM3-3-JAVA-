import java.util.*;
public class p2{
    public static void main(String[] args){
        Scanner it = new Scanner(System.in);
        System.out.print("Enter the size of array =");
        int n = it.nextInt();
        int[] a=  new int[n];
         System.out.print("Enter the array Element =");
        for(int i=0;i<n;i++){
            a[i]=it.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==9){
                count++;
            }
        }
        System.out.print("OCURANCE OF 9 NUMBER IS ="+count);
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}