package lecture6;
import java.util.Scanner;
public class Pattern4isosceles {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j,k,l;
		i =1;
		while(i<=n) {
			j=1;
			while(j<=n-i) {
				System.out.print(' ');
				j++;
			}
			k=1;
			while(k<=i) {
				System.out.print(k);
				k++;
			}
			l = i-1;
			while(l>=1) {
				System.out.print(l);
				l--;
			}
			i++;
			System.out.println();
		}
	    
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// Output--
//     1
//    121
//   12321
//  1234321
// 123454321


