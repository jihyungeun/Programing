// promotion(����ȯ)
public class Ex_07 {
	public static void main(String[] ar){
		int x = 128; int y = x; 	
		long z = x;
		// promotion - ������ ��������� ������ �ս� ����
		// �ڵ����� ����ȯ
		
		// byte w = x ; ���� �߻� - �ս��� �߻� �� ���ɼ� ����
		
		byte w = (byte)x; // casting
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		System.out.println("w=" + w);
		// int x = 128; �� ��� �ս� �߻�
	}
}
