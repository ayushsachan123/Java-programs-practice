package _2D_Array;
import java.util.Scanner;
public class Row_Wise_Sum {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		while(n-->0) {
			int a =s.nextInt();
			int b = s.nextInt();
			int arr[][] =new int[a][b];
			for(int i =0;i<a;i++) {
				for(int j =0;j<b;j++) {
					arr[i][j]= s.nextInt();
				}
			}
			int c = arr[0].length;
			for(int i=0;i<a;i++) {
				int sum =0;
				for(int j=0;j<c;j++) {
					sum+=arr[i][j];
				}
				System.out.println(sum);
			}
			
		}
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 5
// 2 3 4 5 7
// 8 9 0 2 1
// Output--
// 16
// 17
