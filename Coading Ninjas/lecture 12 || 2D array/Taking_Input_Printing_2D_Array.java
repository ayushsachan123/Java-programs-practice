package _2D_Array;
import java.util.Scanner;
public class Taking_input_Printing_2D_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of rows-");
		int a = s.nextInt();
		System.out.println("Enter the no. of Columns-");
		int b = s.nextInt();
		int[][] arr = new int[a][b];
		for(int i =0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.println("Enter the element at " + i + "th row " + j + "th column" );
				arr[i][j] = s.nextInt();
			}
		}
		for(int i =0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// Enter the no. of rows-
// 2
// Enter the no. of Columns-
// 3
// Enter the element at 0th row 0th column
// 1
// Enter the element at 0th row 1th column
// 2
// Enter the element at 0th row 2th column
// 3
// Enter the element at 1th row 0th column
// 4
// Enter the element at 1th row 1th column
// 5
// Enter the element at 1th row 2th column
// 6
// Output--
// 1 2 3 
// 4 5 6 
