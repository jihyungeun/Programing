// 자료형(변수) 사용 방법
// 자료형 char
// Unicode, 특수문자 출력
public class Ex_04 {
	public static void main(String[] ar){
		char a = 65;
		char b = 'A'; // 문자 한개 작은 따옴표(' ')
		char c = '\u0041'; 
		// 16진수 4자리
		/*	unicode 0 1 2 3 4 5 6 7 8 9 a b c d e f 
		    16진수 한 자리는 --> 16 가지(2^4) 4bit
		*/
		// 아스키 코드 : 키보드 자판에 있는 모든 문자를 숫자화

		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		
		System.out.println("안녕하세요!김건양님!반갑습니다");
		System.out.println("안녕하세요! \t김건양님!\n반갑습니다");
		System.out.println("안녕하세요! \t김\"건양\"님!반갑습니다");
		System.out.println("안녕\\하세요!김\"건양\"님!\n반갑습니다");
		//Syatem.out.println("a + 2 = " + ( a + 2 ) );		
	}
}
