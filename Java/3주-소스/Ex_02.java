public class Ex_02 {
	public static void main(String aa[])	{
		byte a = 127, b = 2;
		byte c = (byte)(a*b);
		System.out.println("a*b�� ����� byte�� ��ȯ ��� : " + c);
		int d = a * b;
		System.out.println("a*b�� ����� int�� ��� : " + d);
		int i = 1000000, j = 1000000;
		int k = i * j;
		System.out.println("�鸸*�鸸�� ����� int�� ��� : " + k);
		long m = (long)(i*j);
		System.out.println("�鸸*�鸸�� ����� long���� ��ȯ�� �� ��� : " + m);
		long l = (long)i*(long)j;
		System.out.println("������ �鸸�� long���� ��ȯ �� �鸸*�鸸�� ����� ��� : " + l);	
	}
}