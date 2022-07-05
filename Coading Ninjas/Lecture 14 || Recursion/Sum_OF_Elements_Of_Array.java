package Recursion_1;
import java.util.Scanner;
public class Sum_of_elements_of_array {
public static int sumofelements(int arr[],int n){
	if(n<=0) {
		return 0;
	}
	return sumofelements(arr,n-1 ) + arr[n-1];
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}
		int a  = sumofelements(arr,n);
		System.out.println(a);

	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
//Input
// 5
// 2 3 1 4 5
// Output--
// 15
