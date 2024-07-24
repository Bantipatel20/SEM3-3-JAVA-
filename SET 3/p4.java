import java.util.*;
public class p4{
    public static void main(String[] args){
        date d = new date();
        d.getdata();
        d.setdata();
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
class date{
    int dd,mm,yy;
    date(){
        dd=0;
        mm=0;
        yy=0;
    }
    public void getdata(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Eneter date == ");
        dd = sc.nextInt();
        System.out.print("Eneter month == ");
        mm = sc.nextInt();
        System.out.print("Eneter year == ");
        yy = sc.nextInt();
    }
    public void setdata(){
        System.out.println(dd+"/"+mm+"/"+yy);
        
    }
}