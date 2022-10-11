
public class Ex_08 {
	public static void main(String[] ar){
		char a = 65; // 'A' 또는 숫자 65
		
		// short b = a;
		short b = (short)a; // 같은 2byte이지만 범위 포함 못함
		
		byte c = 100; 
		short d = c;
		
		// char e = c
		char e = (char)c;
		
		long f = 100L;
		float g = f; // 실수는 무조건 정수보다 크다
		
		float h = 10.24f;
		// long i = h;
		long i = (long)h;
	}
}
