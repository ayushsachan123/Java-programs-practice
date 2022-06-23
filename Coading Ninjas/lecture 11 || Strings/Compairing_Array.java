package strings;
import java.util.Scanner;
public class Compairing_array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr1[] = {1,2};
		int arr2[] = {1,2};
		if(arr1==arr2) {
			System.out.println("both are equal");
			
		}
		else {
			System.out.println("both are not equal");
			
		}
		System.out.println(arr1 + " " + arr2);
	}
}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Output--
// both are not equal
// [I@1b28cdfa [I@eed1f14
