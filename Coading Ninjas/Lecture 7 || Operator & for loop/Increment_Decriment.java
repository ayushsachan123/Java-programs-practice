package lecture7;

public class Icrement_decrement {

	public static void main(String[] args) {
int a = 10;
System.out.println(a++);//it print initial value then increment the value from next lne
a++;
System.out.println(a);
++a;
System.out.println(a);

a = 4;
a*=2;
System.out.println(a);
a^=2;
System.out.println(a);

int b = 2*3/2;
System.out.println(b);
	}

}


----------------------------------------------------------------------------------------------------------------------------------------------------------
//Output--
//10
//12
//13
//8
//10
//3
