package lecture4;
import java.util.Scanner;
public class Switchroboat {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		switch(a) {
		case 1: System.out.println("Hello");
		break;
		case 2: System.out.println("Namaste");
		break;
		case 3: System.out.println("Bonjour");
		break;
		default : System.out.println("invalid");
		
		}

	}

}

//---------------------------------------------------------------------------------------------------------------------------------------------------------
//Input--
// 1
// Output--
// Hello

