package binarysearch;
import java.util.Scanner;
public class Insertion_sort {
	public static void printarr(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}	
		}
	public static void insertionsort(int arr[]) {
		int n = arr.length;
		for(int i=1;i<n;i++) {	
			//insert ith element in sorted portion
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]= arr[j];
				j--;
			}
			// position will be j+1
			arr[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}
			insertionsort(arr);
			printarr(arr);
		
	}

}


//------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// 2 7 9 4 6
// Output--
// 2
// 4
// 6
// 7
// 9
