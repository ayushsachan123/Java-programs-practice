package arrays;
import java.util.Scanner;
public class Takinginput_printingarray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out .println("Enter element at " + i + "th index");
			arr[i] = s.nextInt();
		}
		for(int i =0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// Enter element at 0th index
// 5
// Enter element at 1th index
// 7
// Enter element at 2th index
// 3
// Enter element at 3th index
// 9
// Enter element at 4th index
// 1
// Output--
// 5
// 7
// 3
// 9
// 1
