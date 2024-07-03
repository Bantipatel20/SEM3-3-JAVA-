import java.util.*;
public class p6{
    public static void main(String[] args){
        System.out.println("Enter the number...");
        Scanner h = new Scanner(System.in);
        int x=h.nextInt();
        h.close();
        int rem,sum=0;
        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
            x/=10;
        }
        System.out.println("YOUR REVERSE NUMBER IS...");
        System.out.println(sum);
    }
} 
