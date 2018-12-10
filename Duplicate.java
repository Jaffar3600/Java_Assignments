
/*10)	From given array of integers, create new array having duplicates removed and every element appearing once only from the given array.*/
import java.util.Scanner;
class Duplicate
{
	public static void main(String[] args)
		{
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements...:");
		for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		}
		
		 for(int i = 0;i<arr.length-1;++i)
		{ int temp;
		 for(int j = i+1;j<arr.length;++j){
			if(arr[i]>arr[j]){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
		}
		int temp=0;
		
		for(int i = 0;i<arr.length-1;i++){
		if(arr[i]!=arr[i+1]){
		arr[temp]=arr[i];
		temp++;
		}
		}
		arr[temp]=arr[arr.length-1];
		int newArray[]=new int[temp+1];
		System.out.println("After.....");
		for(int i=0;i<newArray.length;i++)
		{
		System.out.println(arr[i]);
		}
		}	
}