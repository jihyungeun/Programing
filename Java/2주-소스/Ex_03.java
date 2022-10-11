// 자료형(변수) 사용 방법
// 정수형 자료형
public class Ex_03 {
	public static void main(String[] ar){
		// 고급언어 저장공간 최소 단위 1byte
		// 선언 방법 : 자료형 변수명 = 초기값
		boolean a = true; //false 반드시 초기값 줄것
		
		// byte b; 에러 발생
		byte b = 127; //초기값 줄것
		// byte b = 128; 에러발생
		// b++;확인(128=-1 저장)-----참고 자료

		short c = -32768;
		// 많이 사용하지 않음 자바 4byte 시스템
		// 다른 프로그램과 호환을 위해 사용 
		// c언어는 2byte 시스템, c언어는 int 2byte
		
		int d = 2147383647;
		
		// long e = 12341234121;//에러발생
		long e = 12341234121L;
		// 기본자료형  int 보다 큰 자료형에는 끝에 반드시 L을 붙인다.
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("d= " + d);
		System.out.println("e= " + e);
	}
}
// byte	: 부호를 갖는 1byte(8bit) 정수
// short	: 부호를 갖는 2byte(16bit) 정수
// int		: 부호를 갖는 3byte(32bit) 정수
// long 	: 부호를 갖는 4byte(64bit) 정수