package lecture2;

public class Datatype {

	public static void main(String[] args) {
		
		char c = 'a';
		System.out.println(c+3);
		
		int i = c+10;
		System.out.println(i);
		
		
		long l = i;
		l = 1234567897899L;
		i=(int)l;
		System.out.println(l);
		System.out.println(i);
		
		
		      //it can possible because int is 4 byts and can store char which is 2 bytes
		i=c;
		
		//it can not possible because char is 2 byte and cannot store int which is 4 bytes
		//char d =i;
		
		
		char d = (char)i;
		
		float f = 4.23f;
		
		
	}

}
