/** 다음 프로그램(ExamTest.java)은 두개의 클래스로 구성된다 */
class Exam {// 클래스 Exam의 정의
	int c;
	public int add(int a, int b) {
		c = a + b;
		return c;
	}
}

public class Ex_01 {/* 클래스 Exam으로부터 객체를 생성하여 사용한다
                                 객체로부터 반환된 결과를 인쇄한다 */
   
	public static void main(String ar[]) {
		int sum;
		int x,y;
		x = Integer.parseInt(ar[0]);
		y = Integer.parseInt(ar[1]);
		// 명령행 인자로부터 데이터를 받아 정수로 변환하여 저장
		Exam exobj = new Exam();
		sum = exobj.add(x,y);
		System.out.println("입력한 값의 합은" + sum + "입니다");
	}
}