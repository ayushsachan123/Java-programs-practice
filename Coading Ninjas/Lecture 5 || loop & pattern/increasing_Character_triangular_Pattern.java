package lecture5;
import java.util.Scanner;
public class Pattern8Character2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		i = 1;
		while(i<=n){
			j = 1;
			while(j<=i){
			char c = (char)('A'+i-1);
			System.out.print(c);
			j++;
			}
				System.out.println();
				i++;
		}
	}

}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// Output--
// A
// BB
// CCC
// DDDD
// EEEEE
