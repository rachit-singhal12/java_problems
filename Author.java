public class Author {
    String name;
    String emil;
    String gender;
    Author(String name,String emil,String gender)
    {
        this.name = name;
        this.gender = gender;
        this.emil = emil;
    }
    public String toString()
    {
        return (name + " "+gender+" "+emil);
    }
}
