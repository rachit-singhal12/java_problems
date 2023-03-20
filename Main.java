class Student
{
    String name;
    int rollno;
    Student(String name,int rollno)
    {
        this.name = name;
        this.rollno = rollno;
    }
    void displaydata()
    {
        System.out.println("Name of a student is "+this.name+" Roll number of a student is "+this.rollno);
    }
}
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Name : Rachit Singhal");
        System.out.println("Roll no : 41");
        System.out.println("Section : B");
        System.out.println("Course : MCA");
        System.out.println("Semester : 2nd");
        Student obj = new Student("rachit", 41);
        obj.displaydata();
    }
}   
