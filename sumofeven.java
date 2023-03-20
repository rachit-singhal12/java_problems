class sumofeven
{
    int count(int n)
    {
        int flag=0;
        while(n>0)
        {
            n/=10;
            flag++;
        }
        return flag;
    }
    public static void main(String[] args)
    {
	  sumofeven obj = new sumofeven();
        System.out.println("Name : Rachit Singhal");
        System.out.println("Roll no : 41");
        System.out.println("Section : B");
        System.out.println("Course : MCA");
        System.out.println("Semester : 2nd");
        int number = Integer.parseInt(args[0]);
	  int temp = number;
        int sum=0;
        int size = obj.count(number);
        while(size>0)
        {
            if(size%2==0)
            {
                sum+=number%10;
            }
            number/=10;
            size--;
        }
        System.out.println("Sum of even digit are: "+sum);
    }
}