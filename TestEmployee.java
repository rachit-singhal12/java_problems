import java.util.Scanner;

class Employee extends Person
{
    double annualSalary;
    int year;
    String mobileNumber;
    Employee()
    {
        super();
    }
    void getName(String name)
    {
        this.name = name;
    }
    void getAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }
    void getYear(int year)
    {
        this.year = year;
    }
    void getMobileNumber(String mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }
    String setName()
    {
        return name;
    }
    Double setAnnualSalary()
    {
        return annualSalary;
    }
    int setYear()
    {
        return year;
    }
    String setMobileNumber()
    {
        return mobileNumber;
    }
}
public class TestEmployee 
{
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        Scanner scan = new Scanner(System.in);
        String name,mn;
        int year;
        double salary;
        System.out.print("Enter the name of Employee: ");
        name = scan.nextLine();
        System.out.print("Enter the mobile number of Employee: ");
        mn = scan.next();
        System.out.print("Enter the annual salary of Employee: ");
        salary = scan.nextDouble();
        System.out.print("Enter the joining year of Employee: ");
        year = scan.nextInt();
        obj.getName(name);
        obj.getAnnualSalary(salary);
        obj.getYear(year);
        obj.getMobileNumber(mn);
        System.out.println("Name of Employee: "+obj.setName());
        System.out.println("Annual salary of Employee: "+obj.setAnnualSalary());
        System.out.println("Mobile number of Employee: "+obj.setMobileNumber());
        System.out.println("Joining Year of Employee: "+obj.setYear());
    }
}

