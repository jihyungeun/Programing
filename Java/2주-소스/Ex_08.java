
public class Ex_08 {
	public static void main(String[] ar){
		char a = 65; // 'A' �Ǵ� ���� 65
		
		// short b = a;
		short b = (short)a; // ���� 2byte������ ���� ���� ����
		
		byte c = 100; 
		short d = c;
		
		// char e = c
		char e = (char)c;
		
		long f = 100L;
		float g = f; // �Ǽ��� ������ �������� ũ��
		
		float h = 10.24f;
		// long i = h;
		long i = (long)h;
	}
}
