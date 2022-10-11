import java.util.Scanner;

public class Ex_09 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오:");
		int age = scan.nextInt(); // 정수 입력
		
		if((age>=20) && (age<30)) { // age가 20~29 사이인지 검사
			System.out.print("20대입니다. ");
			System.out.println("20대라서 행복합니다!");			
		}
		else 
			System.out.println("20대가 아닙니다.");
		
		scan.close();
	}
}
// 이클립스 단축키
// Ctrl + D             : 한 줄 삭제
// Ctrl + Shift + O  : import 문 자동 생성
// Ctrl + Shift + L  : 모든 단축키 표시
// F11				   : 실행