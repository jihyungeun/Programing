import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; // ������
		int divisor; // ������		
		
		System.out.print("�������� �Է��Ͻÿ�:"); 
		dividend = scanner.nextInt(); // ������ �Է�
		System.out.print("�������� �Է��Ͻÿ�:"); 
		divisor = scanner.nextInt(); // ������ �Է�
		System.out.println(dividend+"�� " + divisor + "�� ������ ���� "
				+ dividend/divisor + "�Դϴ�.");
	}
}
