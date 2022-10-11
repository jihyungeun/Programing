// 자료형(변수) 사용 방법
// 실수형 자료형 (float, double)

public class Ex_05 {
	public static void main(String[] ar){
		// float a = 12.36;에러발생 8바이트를 4바이트에 저장
		float a = 12.36f; // 소수점이하 7자리까지 정확히 표시
		double b = 12.345; // 소수점이하 15자리까지 정확히 표시
		
		// 문자열을 저장하는 자료형 없음
		String name = "양계탁";
		// 클래스를 빌려 문자열 저장
		// String 첫 글자 대문자
		// "문자열 저장 "
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println(name);		
	}
}
// float : 부호를 갖는 32bit 실수(소수)
// double : 부호를 갖는 64bit 실수(소수)-기본자료형