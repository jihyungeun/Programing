// �ڷ���(����) ��� ���
// ������ �ڷ���
public class Ex_03 {
	public static void main(String[] ar){
		// ��޾�� ������� �ּ� ���� 1byte
		// ���� ��� : �ڷ��� ������ = �ʱⰪ
		boolean a = true; //false �ݵ�� �ʱⰪ �ٰ�
		
		// byte b; ���� �߻�
		byte b = 127; //�ʱⰪ �ٰ�
		// byte b = 128; �����߻�
		// b++;Ȯ��(128=-1 ����)-----���� �ڷ�

		short c = -32768;
		// ���� ������� ���� �ڹ� 4byte �ý���
		// �ٸ� ���α׷��� ȣȯ�� ���� ��� 
		// c���� 2byte �ý���, c���� int 2byte
		
		int d = 2147383647;
		
		// long e = 12341234121;//�����߻�
		long e = 12341234121L;
		// �⺻�ڷ���  int ���� ū �ڷ������� ���� �ݵ�� L�� ���δ�.
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("d= " + d);
		System.out.println("e= " + e);
	}
}
// byte	: ��ȣ�� ���� 1byte(8bit) ����
// short	: ��ȣ�� ���� 2byte(16bit) ����
// int		: ��ȣ�� ���� 3byte(32bit) ����
// long 	: ��ȣ�� ���� 4byte(64bit) ����