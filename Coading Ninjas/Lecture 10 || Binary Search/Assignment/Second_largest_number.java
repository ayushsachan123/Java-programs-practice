package Assignment;
import java.util.Scanner;
public class Secondlargestelement {
	
	public static void secondlargest(int arr[]) {
		int n = arr.length;
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(max1<arr[i]) {
				max2 = max1;
				max1=arr[i];
			}
			else if(max2<arr[i] && max2!=max1) {
				max2=arr[i];
			}
		}
		System.out.println(max2);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}
		secondlargest(arr);
	
	}

}


//------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 5
// 2 8 6 9 5
// Output--
// 8
