package binarysearch;
import java.util.Scanner;
public class SelectionShort {
	public static void printarr(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
public static void selectionshort(int arr[]) {
	int n = arr.length;
	for(int i=0;i<n-1;i++) {  //insert element at ith position
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for(int j = i;j<n;j++) {// finding the minimum element among j position
			if(arr[j]<min) {
				min = arr[j];
				minIndex = j;
			}
		}
		//swap element at min index with ith element
		int temp = arr[minIndex];
		arr[minIndex] = arr[i];
		arr[i] = temp;
	}
}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<n;i++) {
		arr[i]= s.nextInt();
	}
	selectionshort(arr);
	printarr(arr);
	}

}


//----------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 5
// 3 8 6 7 4
// Output--
// 3
// 4
// 6
// 7
// 8
