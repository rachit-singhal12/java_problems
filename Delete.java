import java.util.*;
class Delete{
	public static void main(String[] args){
		int[] a={2,4,5,7,6,10,12,23,34,32};
		int s=a.length;
		System.out.println("Elemments present in an array : ");
		for(int i=0;i<s;i++){
			System.out.print(a[i]+" ");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter a element you want to Delete: ");
		int ele=sc.nextInt();
		int check=0;
		for(int i=0;i<s;i++){
			if(a[i]==ele){
				for(int j=i+1;j<s;j++){
					a[j-1]=a[j];
				}
				check=1;
				}
		}
		System.out.println("Array After deletion:");
		for(int i=0;i<s-1;i++){
			System.out.print(a[i]+" ");
		}
		if(check==0)
		System.out.println(ele+" is  not present present");
		
	}
}
