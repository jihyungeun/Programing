//���ڿ��� ��ȯ
public class Ex_09 {
	
	 public static void main(String args[]) {
		    String str = "�˱⽱�� �ؼ��� �ڹ�";
		    System.out.println("�ε��� 5���� 8���������� ���ڿ� : " 
		                                     + str.substring(5,8));
		    System.out.println(str.concat("�� ���� ���α׷�"));
		    //���ڿ��� ����(�߰�)
		    System.out.println(str.replace('��','��'));
		    str = "  " + str + "     ";
		    // �տ� 2��, �ڿ� 5���� ���� �߰�
		    System.out.println("���� �߰� str�� ���� : " + str.length());
		    str = str.trim();
		    // ���ڿ��� ���� ������ ����
		    System.out.println("���� ���� str�� ���� : " + str.length());
		  }

}
// substring(i, j) : ���ڿ��� �Ϻ�(index i ���� j��������)�� ����
// concat(str) : ������ ���ڿ��� str�� ���ڿ��� ������
// replace(ori, rep) : ������ ���ڿ� �� ����ori�� rep�� �ٲ� 
