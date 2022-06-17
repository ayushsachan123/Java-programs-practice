package arrays;
import java.util.Scanner;
public class Changesinarray {
	public static void printoutput(int[] arr) {
		int n = arr.length;   
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] incrementarray(int[] input) {
		input = new int[7];
		for(int i=0;i<input.length;i++) {
			input[i]= input[i]+1;
		}
		return input;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		arr = incrementarray(arr);
		printoutput(arr);

	}//approch on notebook

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
//Output--
// 1
// 1
// 1
// 1
// 1
// 1
// 1
