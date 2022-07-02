package Time_Complexity;
import java.util.Scanner;
public class Equillibrium_Index {
public static void Equillibrium(int arr[]) {
	int n = arr.length;
	int i=0;
	int totalsum = 0;
	while(i<n) {
		totalsum+=arr[i];
		i++;
	}
	int index =0;
	int leftsum =0;
	int rightsum ;
	while(index<n) {
		rightsum = totalsum - leftsum - arr[index];
		if(rightsum == leftsum) {
		System.out.println(index);
		break;
		}
			leftsum += arr[index];
			index++;
	}
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i] = s.nextInt();
			 Equillibrium(arr1);
			//System.out.println(a);
		}

	}

}


//-----------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// 1 3 2 3 1
// Output--
// 0
// 2
