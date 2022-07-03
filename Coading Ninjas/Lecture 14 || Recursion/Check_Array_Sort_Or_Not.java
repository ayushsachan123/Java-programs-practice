package Recursion_1;
import java.util.Scanner;
public class Check_Array_Sorted_Or_Not {
	public static boolean checkSorted(int arr[]) {
		if(arr.length <=1) {
			return true;
		}
		int smallInput[] = new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallInput[i-1] = arr[i];
		}
		boolean ans = checkSorted(smallInput);
		if(!ans) {
			return false;
		}
		else if(arr[0]<arr[1]) {
			return true; 
		}
		 else {
			 return false;
		 }
	}
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int input[]= {1,2,3,10,9};
	System.out.println(checkSorted(input));
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
//Output--
//false
