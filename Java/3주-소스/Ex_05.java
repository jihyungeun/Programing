// ��Ʈ ������
public class Ex_05 {
	public static void main(String args[]){
		int a = 3; // 0011
		int b = 5; // 0101
		int c = a | b;
		int d = a & b;
		int e = a ^ b;
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" a|b = " + c);
		System.out.println(" a&b = " + d);
		System.out.println(" a^b = " + e);
	}
}
// & : �� ��Ʈ ��� 1�϶��� 1      | : �� ��Ʈ ��� 0�϶��� 0
// ^ : �� ��Ʈ�� ���� �ٸ��� 1, ������ 0
