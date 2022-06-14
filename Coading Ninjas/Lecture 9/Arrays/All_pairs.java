package arrays;
import java.util.Scanner;
public class Allpairs {
public static void printallpairs(int[] arr) {
	int n = arr.length;
	for(int i=0;i<n-1;i++) {//n-1 because last term has no pairs
		for(int j=i+1;j<n;j++) {
			System.out.println("(" + arr[i] + "," + arr[j] +")");
		}
	}
}
	public static void main(String[] args) {
	int arr[]= {1,4,7,6,5};
     printallpairs(arr);
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
// Output--
// (1,4)
// (1,7)
// (1,6)
// (1,5)
// (4,7)
// (4,6)
// (4,5)
// (7,6)
// (7,5)
// (6,5)
