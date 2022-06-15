package arrays;
import java.util.Scanner;
public class Findinglargestnumberamongnelements {
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i = 0;i<n;i++) {
			 arr[i]= s.nextInt();
		}
		return arr;
	}
	public static int largest(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = takeinput();
		int lar = largest(arr);
		System.out.println(lar);
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// 2 4 9 7 5 
// Output--
// 9
