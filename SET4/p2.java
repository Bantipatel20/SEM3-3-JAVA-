import java.util.*;
public class p2{
    public static void main(String[] args){
        employee e = new employee();
        manager m = new manager();
        e.getdata();
        e.printdata();
        m.get();
        m.print();
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
class member{
    String name;
    int age;
    long phnum;
    String ad;
    double salary;
    public void salary(){
        System.out.println("Salary of memeber is = "+salary);
    } 
}
class employee extends member{
    String sp;
    public void getdata(){
            Scanner it = new Scanner(System.in);
            System.out.println("!!!!!!!!......Enter the data of Employee .....!!!!!!!");
            System.out.print("Enter the name of Employee = ");
            name= it.nextLine();
            System.out.print("Enter the age of Employee = ");
            age = it.nextInt();
            System.out.print("Enter the contact number of Employee = ");
            phnum = it.nextLong();
            it.nextLine();
            System.out.print("Enter the address of Employee = ");
            ad = it.nextLine();
            System.out.print("Enter the salary of Employee = ");
            salary = it.nextDouble();
            it.nextLine();
            System.out.print("Enter the specialization of Employee = ");
            sp =  it.nextLine();
    }
     public void printdata(){
            System.out.println("**********DETAIL OF Employee**********");
            System.out.println(" Name = "+name);
            System.out.println("Age = "+age);
            System.out.println("Contact number = "+phnum);
            System.out.println("Address = "+ad);
            System.out.println("Salary = "+salary);
            System.out.println("Specialization = "+sp);
        }
}
class manager extends member{
       String dp;
    public void get(){
            Scanner it = new Scanner(System.in);
            System.out.println("!!!!!!......Enter the data of Manager....!!!!!!!!");
            System.out.print("Enter the name of Manager = ");
            name= it.nextLine();
            System.out.print("Enter the age of Manager = ");
            age = it.nextInt();
            System.out.print("Enter the contact number of Manager = ");
            phnum = it.nextLong();
            it.nextLine();
            System.out.print("Enter the address of Manager = ");
            ad = it.nextLine();
            System.out.print("Enter the salary of Manager = ");
            salary = it.nextDouble();
             it.nextLine();
            System.out.print("Enter the Department of Manager = ");
            dp =  it.nextLine();
    }
     public void print(){
            System.out.println("**********DETAIL OF Manager**********");
            System.out.println(" Name = "+name);
            System.out.println("Age = "+age);
            System.out.println("Contact number = "+phnum);
            System.out.println("Address = "+ad);
            System.out.println("Salary = "+salary);
            System.out.println("Department = "+dp);
        }   
}
