package arrays;
import java.util.Scanner;
public class Arrangethenumber {

	public static void main(int[] arr,int n) {
	Scanner s = new Scanner(System.in);
	int left = 0;
	int right= n-1;
	int counter = 1;
	while(left<=right) {
		if(counter % 2==1) {
			arr[left]= counter;
			counter++;
			left++;
		}
		else {
			arr[right] = counter;
			counter++;
			right--;
		}
	}

	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 4
// 7
// 9
// 2
// 3
// Output--
// 7
// 9
// 3
// 2
