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
        Student obj = new Student("rachit", 41);
        obj.displaydata();
    }
}   
