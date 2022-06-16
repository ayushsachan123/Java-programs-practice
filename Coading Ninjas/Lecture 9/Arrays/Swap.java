package arrays;
import java.util.Scanner;
public class Swap {
public static void swapalternate(int[] arr) {
	int n = arr.length;
	for(int i=0;i<n-1;i+=2) {
		int temp = arr[i];
		arr[i]=arr[i+1];
		arr[i+1]= temp;
	}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,9};
		swapalternate(arr);
	}

}


//------------------------------------------------------------------------------------------------------------------------------------------------------
// Output--
// 2
// 1
// 4
// 3
// 9
// 5
