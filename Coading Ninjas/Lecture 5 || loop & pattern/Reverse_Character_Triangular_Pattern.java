package lecture5;
import java.util.Scanner;
public class Pattern9Practice {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int i = 1;
while(i<=n) {
	char c = (char)('A'+n-i);
	int j = 1;
	while(j<=i) {
		System.out.print(c);
		c = (char)(c+1);
		j++;
	}
	System.out.println();
	i++;
}
	}

}

// ----------------------------------------------------------------------------------------------------------------------------------------------------------

// Output--
// 5
// E
// DE
// CDE
// BCDE
// ABCDE
