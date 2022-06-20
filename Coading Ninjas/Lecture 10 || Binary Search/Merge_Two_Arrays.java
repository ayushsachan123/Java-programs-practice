package binarysearch;
import java.util.Scanner;
public class Merge_two_array {
	public static void printarr(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}	
	}
	public static int[] mergearr(int[] arr1 ,int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int arr[] = new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m) {
		if(arr1[i] <= arr2[j]) {
			arr[k]= arr1[i];
			i++;
			k++;
		}
		else {
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}
		while(i<n) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			arr[k]= arr2[j];
			j++;
			k++;
		}
			return arr;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Insert elements in ascending order only
		int n = s.nextInt();
		int m = s.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		for(int i=0;i<n;i++) {
			arr1[i] = s.nextInt();
		}
		for(int j=0;j<m;j++) {
			arr2[j]=s.nextInt();		
			}
		int arr3[] = mergearr(arr1,arr2);
		printarr(arr3);
	}

}


//---------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 5
// 4
// 4 5 8 3 2
// 1 0 6 7 9
// Output--
// 1
// 0
// 4
// 5
// 6
// 7
// 8
// 3
// 2
