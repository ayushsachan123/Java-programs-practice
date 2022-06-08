package lecture4;
import java.util.Scanner;
public class if_else {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if(age>18)
		{
			System.out.println("adult");
		}
		else
		{
			System.out.println("not adult");
		}

	}

}
//Input--
// 20
// Output--
// adult

