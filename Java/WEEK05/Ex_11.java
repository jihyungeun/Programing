import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit")) // "exit"�� �ԷµǸ� �ݺ� ����
				break; // while ���� ���
		}
		System.out.println("�����մϴ�...");		

		scanner.close();
	}
}
