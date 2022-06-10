package lecture5;
import java.util.Scanner;
public class Pattern4Tringular {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		i = 1;
		while(i<=n) {
			j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}


-----------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// Output--
// 1
// 12
// 123
// 1234
// 12345
