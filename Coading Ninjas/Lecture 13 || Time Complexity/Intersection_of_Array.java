package Time_Complexity;
import java.util.Scanner;
import java.util.Arrays;
public class Intersection_of_Array {
public static void Intersection(int arr1[],int arr2[]) {
	int m =arr1.length;
	int n = arr2.length;
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	int i=0;
	int j=0;
	while(i<m && j<n) {
	if(arr1[i]<arr2[j]) {
		i++;
	}
	else if(arr1[i]>arr2[j]) {
		j++;
	}
	else {
		System.out.println(arr1[i]);
		i++;
		j++;
	}
	}
}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int m = s.nextInt();
	int n = s.nextInt();
	int arr1[] = new int[m];
	int arr2[] = new int[n];
	for(int i=0;i<m;i++) {
		arr1[i]= s.nextInt();
	}
	for(int j =0;j<n;j++) {
		arr2[j] = s.nextInt();
	}
	Intersection(arr1,arr2);
	}

}


//------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 5
// 5
// 1 4 6 9 0
// 2 7 6 8 7
//Output--
// 6
