import java.util.*;
class Sum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[2];
		int sum=0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = scan.nextInt();
				if(arr[i][j]%2==0)
				sum+=arr[i][j];
			}
		}
		System.out.println("The sum of even numbers in an array is : "+sum);
	}
}
