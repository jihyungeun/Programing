// 산술연산자, 
import java.util.Scanner;
public class Ex_01 {
	public static void main(String args[]){
		System.out.print("두 수를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); // 정수 토큰 읽기
		int b= scanner.nextInt(); // 정수 토큰 읽기
		
		System.out.print("a = " + a +"\t ");
		System.out.println("b = " +b);
		int sum = a + b;
		int sub = a - b;
		int mul = a*b;
		int div = a/b;
		int mod = a % b;
		
		System.out.println("a + b = " + sum);
		System.out.println("a - b = " + sub);
		System.out.println("a * b = " + mul);
		System.out.println("a / b = " + div);
		System.out.println("a % b = " + mod);
		
				
				int c = ++a;
				System.out.println("a의 단항증가연산(prefix)= " + c);
				System.out.println("a 변수의 값 : " + a);
				int d = b++;
				System.out.println("b의 단항등가연산(postfix)= " + d);
				System.out.println("b 변수의 값 : " + b);
			

	}
}
