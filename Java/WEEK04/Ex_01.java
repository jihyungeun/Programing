// 키보드로 부터 데이터 입력받는 방법 Scanner
import java.util.Scanner;

public class Ex_01 {

	public static void main(String args[])  { 
		System.out.println("이름, 도시, 나이, 체중, "
				            + "독신 여부를 빈칸으로 분리하여 입력하세요");

		Scanner scan = new Scanner(System.in);
		
		String name = scan.next(); // 문자열 토큰 읽기
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		String city = scan.next(); // 문자열 토큰 읽기
		System.out.println("당신이 사는 도시는 " + city + "입니다.");	
		
		int age = scan.nextInt(); // 정수 토큰 읽기
		System.out.println("당신의 나이는 " + age + "살입니다.");
		
		double weight = scan.nextDouble(); // 실수 토큰 읽기
		System.out.println("당신의 체중은 " + weight + "kg입니다.");
		
		boolean single = scan.nextBoolean(); // 논리 토큰 읽기
		System.out.println("당신은 독신 여부는 " + single + "입니다.");
		
		scan.close(); // scanner 스트림 닫기		
	}
}
//Scanner 클래스의 주요 메소드
//next() : 다음 아이템을 문자열로반환한다 
//nextLine() : 한 라인 전체를 문자열 타입으로 반환한다.
//nextByte(), nextShort(), nextInt()
//nextLong(), nextFloat(), nextDouble()
//close()
