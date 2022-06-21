package Assignment;
import java.util.Scanner;
public class Sort_0_1_2 {
	public static void printarr(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void sort(int arr[]) {
		int n=arr.length;
		int i=0;
		int nz=0;
		int nt=n-1;
		while(i<=nt) {
			if(arr[i]==0) {
				int temp = arr[nz];
				arr[nz]=arr[i];
				arr[i]=temp;
				nz++;
				i++;
			}
			else if(arr[i]==2) {
				int temp=arr[nt];
				arr[nt]= arr[i];
				arr[i]=temp;
				nt--;
			}
			else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}
		sort(arr);
		printarr(arr);
	}

}


//------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 7
// 0 4 6 1 2 8 0
// Output--
// 0
// 0
// 6
// 1
// 4
// 8
// 2
