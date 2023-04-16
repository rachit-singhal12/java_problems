public class Anonymois_class {
    interface greets
    {
        public void welcome();
    }
    public void display()
    {
        greets g = new greets(){
            public void welcome()
            {
                System.out.println("welcome sir...");
            }
        };
        g.welcome();
    }
    public static void main(String... args)
    {
        Anonymois_class a = new Anonymois_class();
        a.display();
    }
}