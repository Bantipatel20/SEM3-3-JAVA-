import java.util.*;
public class p3{
    public static void main(String[] args){
        Employee o1 = new Employee();
        Employee o2 = new Employee();
        o1.getdata();
        o2.getdata();
        o1.setdata();
        o2.setdata();
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
class Employee{
    String fn;
    String ln;
    double s;
    Employee(){
        fn="";
        ln="";
        s=0;
    }
    public void getdata(){
        Scanner it = new Scanner(System.in);
        System.out.print("Enter the first name of Employee == ");
        fn=it.nextLine();
        System.out.print("Enter the last name of Employee == ");
        ln=it.nextLine();
        System.out.print("Enter the monthly Salary of Employee == ");
        s=it.nextDouble();
        if(s<0){
            s=0;
        }
    }
    public void setdata(){
        double x=s*12;
        double y=x+(x*10)/100;
        System.out.println("First name == "+fn);
        System.out.println("Last name == "+ln);
        System.out.println("Yearly salary of Employee == "+x);
        System.out.println("Employee a 10% raise and yearly salary == "+ y);
        System.out.println("<------------------------------------------------------>");
    }
}