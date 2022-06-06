package lecture2;

public class explicittypecasting {

	public static void main(String[] args) {
	
		//we explicittly convert int into char
		int i = 10 ;
		char a = (char)i;
		System.out.println(a);
		
		short s = 18;
		int j =s;
		s = (short)j;

		float f = 1.7f;
		    //or
		float k = (float)1.7;
		System.out.println(k);
		
		System.out.println((double)3/5);
		//or
		System.out.println(3.0/5);
	}

}
