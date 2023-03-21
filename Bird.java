class Animal
{
    void eat()
    {
        System.out.println("parent class eat meathod");
    }
    void sleep()
    {
        System.out.println("parent class sleep method");
    }
}
public class Bird extends Animal{
    void eat()
    {
        System.out.println("child class eat meathod");
    }
    void sleep()
    {
        System.out.println("child class sleep method");
    }
    void fly()
    {
        System.out.println("child class fly method");
    }
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.eat();
        obj.sleep();
        Bird obj2 = new Bird();
        obj2.eat();
        obj2.sleep();
        obj2.fly();
    }
}
