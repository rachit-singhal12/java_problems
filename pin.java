import java.util.Scanner;
class pin {
	 static int Findmax(int a,int b,int c) {
		int max=Math.max(a, b);
		max=Math.max(max, c);
		return max;
	}
	static int Findmin(int a,int b,int c) {
		int min=Math.min(a, b);
		min=Math.min(min, c);
		return min;
	}
	public static void main(String[] args) {
		System.out.println("Name : Rachit Singhal\nRoll no : 41\nSection : B\nCourse : MCA\nSemester : 2");
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 numbers consist of 3 digits: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int pin=0;
		int max=0;
		while(num1>0)
        {
			int rem=Findmin(num1%10,num2%10,num3%10);
			max=Math.max(max,Findmax(num1%10,num2%10,num3%10));
			pin=pin*10+rem;
			num1=num1/10;
			num2=num2/10;
			num3=num3/10;
		}
		pin=pin*10+max;
		int realPin=0;
		while(pin>0)
        {
			int rem=pin%10;			
			realPin=realPin*10+rem;
			pin=pin/10;
		}
		if(realPin<9999)
			realPin*=10;
		System.out.print("PIN = "+realPin);
	}
}
