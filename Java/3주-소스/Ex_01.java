// ���������, 
import java.util.Scanner;
public class Ex_01 {
	public static void main(String args[]){
		System.out.print("�� ���� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); // ���� ��ū �б�
		int b= scanner.nextInt(); // ���� ��ū �б�
		
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
				System.out.println("a�� ������������(prefix)= " + c);
				System.out.println("a ������ �� : " + a);
				int d = b++;
				System.out.println("b�� ���׵����(postfix)= " + d);
				System.out.println("b ������ �� : " + b);
			

	}
}
