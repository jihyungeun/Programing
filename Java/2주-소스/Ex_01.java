/** ���� ���α׷�(ExamTest.java)�� �ΰ��� Ŭ������ �����ȴ� */
class Exam {// Ŭ���� Exam�� ����
	int c;
	public int add(int a, int b) {
		c = a + b;
		return c;
	}
}

public class Ex_01 {/* Ŭ���� Exam���κ��� ��ü�� �����Ͽ� ����Ѵ�
                                 ��ü�κ��� ��ȯ�� ����� �μ��Ѵ� */
   
	public static void main(String ar[]) {
		int sum;
		int x,y;
		x = Integer.parseInt(ar[0]);
		y = Integer.parseInt(ar[1]);
		// ����� ���ڷκ��� �����͸� �޾� ������ ��ȯ�Ͽ� ����
		Exam exobj = new Exam();
		sum = exobj.add(x,y);
		System.out.println("�Է��� ���� ����" + sum + "�Դϴ�");
	}
}