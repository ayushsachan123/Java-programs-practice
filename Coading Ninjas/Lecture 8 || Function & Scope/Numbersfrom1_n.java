package lecture8;
import java.util.Scanner;
public class Numbers1ton {
	public static void number(int n) {
		if(n<=0) {
			return;
		}
		int i;
		for(i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		number(n);
	}

}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 5
// Output--
// 1
// 2
// 3
// 4
// 5
