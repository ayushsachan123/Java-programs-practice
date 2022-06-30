package _2D_Array;
import java.util.Scanner;
public class More_on_2D_array_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr1[][] = new int [4][];
		for(int i =0;i<arr1.length;i++) {
			arr1[i] = new int[i+2];
		}
		
		for(int i =0;i<arr1.length;i++) {
			for(int j =0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
// Output--
// 0 0 
// 0 0 0 
// 0 0 0 0 
// 0 0 0 0 0 
