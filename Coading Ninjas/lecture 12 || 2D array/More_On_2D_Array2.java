package _2D_Array;
import java.util.Scanner;
public class More_on_2D_Array {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int[][] arr1 = new int[2][3];
	System.out.println(arr1[0][1]);
	
	
	int[][] arr2 = new int[4][];
	for(int i=0;i<arr2.length;i++) {
		System.out.println(arr2[i]);
	}
	
	int[][] arr3 = new int[4][];
	for(int i =0;i<arr3.length;i++) {
		arr3[i] = new int[5]; 
	}
	System.out.println(arr3[0][1]);

	}

}


//---------------------------------------------------------------------------------------------------------------------------------------------------------
//Output--
// 0
// null
// null
// null
// null
// 0
