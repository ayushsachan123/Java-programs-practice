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
// Output--
// (1,4)
// (1,7)
// (1,6)
// (1,5)
// (4,7)
// (4,6)
// (4,5)
// (7,6)
// (7,5)
// (6,5)
