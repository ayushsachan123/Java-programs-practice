package lecture7;
import java.util.Scanner;
public class Forloop {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int sum=0;
int n = s.nextInt();
for(int i=1;i<=n;i++) {
	sum=sum+i;
}
System.out.println(sum);
	}

}


//-------------------------------------------------------------------------------------------------------------------------------------------------------
// Output--
// 5
// 15
