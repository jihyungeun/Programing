import java.util.Scanner;

public class Ex_09 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̸� �Է��Ͻÿ�:");
		int age = scan.nextInt(); // ���� �Է�
		
		if((age>=20) && (age<30)) { // age�� 20~29 �������� �˻�
			System.out.print("20���Դϴ�. ");
			System.out.println("20��� �ູ�մϴ�!");			
		}
		else 
			System.out.println("20�밡 �ƴմϴ�.");
		
		scan.close();
	}
}
// ��Ŭ���� ����Ű
// Ctrl + D             : �� �� ����
// Ctrl + Shift + O  : import �� �ڵ� ����
// Ctrl + Shift + L  : ��� ����Ű ǥ��
// F11				   : ����