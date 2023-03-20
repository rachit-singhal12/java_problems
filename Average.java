class Average
{
    public static void main(String[] args)
    {
        System.out.println("Name : Rachit Singhal");
        System.out.println("Roll no : 41");
        System.out.println("Section : B");
        System.out.println("Course : MCA");
        System.out.println("Semester : 2nd");
        int sum=0;
        for(int i=0;i<args.length;i++)
        {
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println("Average: "+sum/args.length);
        System.out.println("Percentage: "+(sum/args.length)+"%");
    }
}