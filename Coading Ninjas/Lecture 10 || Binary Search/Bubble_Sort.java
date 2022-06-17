package binarysearch;
import java.util.Scanner;
public class Bubblesort {
	public static void printbubble(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void bubblesort(int arr[]) {
		int n= arr.length;
		for(int j=0;j<n-1;j++) {
		for(int i=0;i<n-1-j;i++) {//-j because after every iteration the largest element came at end
			if(arr[i]>arr[i+1]) {//so in every case we have to compare 1 element less than previous.
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
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
		bubblesort(arr);
		printbubble(arr);
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
