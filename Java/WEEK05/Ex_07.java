// ������(2-9) ��ø for��
public class Ex_07 {

	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++) { // �ܿ� ���� �ݺ�.2�ܿ��� 9��
			
			for(int j = 1; j < 10; j++) { // �� ���� ����
				System.out.print(i + "*" + j + "=" + i*j); // ������ ���
				System.out.print('\t'); // �ϳ��� ������ ���
			}
			
			System.out.println(); // �� ���� ������ ���� �ٷ� Ŀ�� �̵�
		}
	}
}
