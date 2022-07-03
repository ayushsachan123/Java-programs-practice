package Recursion_1;
import java.util.Scanner;
import java.util.Scanner;

public class Check_Sorted1 {
public static boolean checkSorted2(int arr[]) {
	if(arr.length<=1) {
		return true;
	}
	else if(arr[0]>arr[1]) {
		return false;
	}
	int smallinput[] = new int[arr.length-1];
	for(int i=1;i<arr.length;i++) {
		smallinput[i-1] = arr[i];
	}
  boolean ans = checkSorted2(smallinput);
    if(ans) {
    	return true;     //or only return ans; if sorted it return true if not it return false
    }
//    else if(arr[0]<arr[1]) { 
//    	return true;
//    }
    else {
    	return false;
    }
}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int input[]= new int[n];
   for(int i=0;i<n;i++) {
			input[i]=s.nextInt();
		}
		System.out.println(checkSorted2(input));
	}

}


//------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// 3 5 2 7 9
// Output--
// false
