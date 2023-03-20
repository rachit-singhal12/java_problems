import java.util.Scanner;
class Student
{
    int rollno;
    String name;
    void getData(String name, int rollno)
    {
        this.rollno = rollno;
        this.name = name;
    }
    void setData()
    {
        System.out.println("Name of an student is "+name);
        System.out.println("Roll number of an student is "+rollno);
    }
}
class Test
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        Scanner scan = new Scanner(System.in);
        String name;
        int rollno;
        System.out.print("Enter the name of a student: ");
        name = scan.nextLine();
        System.out.print("Enter the roll no of a student: ");
        rollno = scan.nextInt();
        obj.getData(name, rollno);
        obj.setData();
    }
}
