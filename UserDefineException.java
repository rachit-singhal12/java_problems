import java.util.Scanner;
class A extends Exception
{
	A(String s)
	{
		super(s);
	}
}
class B extends Exception
{
	B(String s)
	{
		super(s);
	}
}
public class UserDefineException {

	public static void main(String[] args) throws A, ṇ {
		int age;
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		if(age<18)
		{
			throw new A("age is less than 18");
		}
		else
		{
			throw new B("age is greater than 19");
		}
	}

}
