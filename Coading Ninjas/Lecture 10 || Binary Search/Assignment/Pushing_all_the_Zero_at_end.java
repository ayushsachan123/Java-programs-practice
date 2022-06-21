package Assignment;
import java.util.Scanner;
public class Pusing_all_the_zero_at_the_end {
	public static void printarr(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void pushzero(int arr[]) {
		int n= arr.length;
		 int k=0;
		for(int i=0;i<n;i++) {
			  if(arr[i]!=0) {
				 int temp=arr[i];
				 arr[i]=arr[k];
				 arr[k]=temp;
				 k++;
			  }
		  }
		  
		}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}
pushzero(arr);
printarr(arr);
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// 3 0 0 5 0
// Output--
// 3
// 5
// 0
// 0
// 0
