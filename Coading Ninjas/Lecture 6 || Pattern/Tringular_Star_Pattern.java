package lecture6;
import java.util.Scanner;
public class Pattern1star {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j,k;
		i=1;
		while(i<=n) {
			j=1;
			while(j<=n-i) {
				System.out.print(' ');
				j++;
			}
			k=1;
			while(k<=i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}

----------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
//5
//Output--
//    *
//  **
//  ***
// ****
//*****




