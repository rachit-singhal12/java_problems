public class Bok {
    String name;
    Author author;
    double price;
    int qty;
    void setter(String name,Author author,double price,int qty)
    {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.author = author;
    }
    void getter()
    {
        System.out.println(name+"\n"+price+"\n"+qty+"\n"+author);
    }
    public static void main(String... args)
    {
        Bok obj = new Bok();
        obj.setter("rachit",new Author("joseph", "dfd@gmail.com", "male"),10000.00,234);
        obj.getter();
    }
}

