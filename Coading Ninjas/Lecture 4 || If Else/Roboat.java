package lecture4;
import java.util.Scanner;
public class else_ifroboat {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a==1) {
			System.out.println("Hello");
		}
		else if(a==2) {
			System.out.println("Namaste");
		}
		else if(a==3) {
			System.out.println("Bonjour");
		}
		else {
			System.out.println("Invalid");
		}
	}

}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 2
// Output--
// Namaste
