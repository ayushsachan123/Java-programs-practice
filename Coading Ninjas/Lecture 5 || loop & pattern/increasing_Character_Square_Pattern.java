package lecture5;
import java.util.Scanner;
public class Pattern9Character3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		i = 1;
		while(i<=n) {
			j=1;
			while(j<=n) {
				char c = (char)('A'+ j-1);

				System.out.print(c);
				c = (char)(c+1);
				j++;
		}
			System.out.println();
			i++;
	}
	}

}


//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// Output--
// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE
