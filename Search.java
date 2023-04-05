import java.util.*;
class Search{
	public static void main(String[] args){
		int[] a={2,4,5,7,6,10,12,23,34,32};
		int s=a.length;
		System.out.println("element of an array are : ");
		for(int i=0;i<s;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an element: ");
		int ele=sc.nextInt();
		int check=0;
		for(int i=0;i<s;i++){
			if(a[i]==ele){
				System.out.println(ele+" is present at the "+(i+1)+" place");
				check=1;
				break;
				}
				
		}
		if(check==0)
		System.out.println(ele+" is  not present present");
		
	}
}
