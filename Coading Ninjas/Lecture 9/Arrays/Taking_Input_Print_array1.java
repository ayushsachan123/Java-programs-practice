package arrays;
import java.util.Scanner;
public class Takinginput_printingarrayusingfunctions {
	public static void printoutput(int arr[]) {
		int n = arr.length;   //finding length of the array
		for(int i=0;i<n;i++) {
		
			System.out.println(arr[i]);
		}
	}
public static int[] takeinput() {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int arr[]= new int[n];
	for(int i = 0;i<n;i++) {
		 arr[i]= s.nextInt();
	}
	return arr;
}
	public static void main(String[] args) {
		
 int arr[] = takeinput();  // it take output as an array from take input function and store in arr[] 
 printoutput(arr);        // passing arr[] taken from the take input function to the print output 

	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// 3 2 7 9 6 
// Output--
// 3
// 2
// 7
// 9
// 6
