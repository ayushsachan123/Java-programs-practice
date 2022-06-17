package binarysearch;
import java.util.Scanner;
public class BinarySearcharrayin_increasingorder {
public static int binarysearch(int arr[],int m) {
	int start = 0;
	int end = arr.length-1;
	
while(start<=end) {
	int mid = (start+end)/2;
	if(arr[mid]==m) {
		return mid;
	}
	else if(m<arr[mid]) {
		end = mid -1;
	}
	else {
		start = mid+1;
	}
}
return -1;
}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int m = s.nextInt();
	int arr[] = new int[n];
	for(int i =0 ;i<n;i++) {
		arr[i] = s.nextInt();
	}
	int k =binarysearch(arr,m);
	System.out.println(k);
	}

}


//-----------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 3
// 4
// 2 4 8 3 
// Output--
// 1
