
public class Ex_07 {
	
	static String array1[] = {
		    "IMF", "���ֵ�", "�ڹٵ���", "�ѱ۳���", "Computer", "��ī", "JAVA", "���ͳ�Ž��", 
		    "�ʷ��ʷ�", "come", "�ٶ�", "��ũ����", "������", "����", "their", "country" };  
		  // ���ڿ��� �迭�� ����
		  public static void main(String args[]) {
		    System.out.println("======= ������ ������ ==========");
		    for(int k = 0; k < array1.length; k++)
		      System.out.print(array1[k] + "  ");
		      // �������� �����͸� ���
		    System.out.println();
		    System.out.println("======= ������ ������ ==========");
		    for(int j = 0; j < array1.length; j++) {
		      for(int i = j + 1; i < array1.length; i++) {
		        if(array1[i].compareTo(array1[j]) < 0) {
		          String t = array1[j];
		          array1[j] = array1[i];
		          array1[i] = t;
		         } // �迭���� ���ӵ� ���ڿ����� ���Ͽ� ��ġ�� �ٲ۴�
		      }
		      System.out.print(array1[j] + "  ");
		    }
		  }
}
// �������� : ������ �� ���ڵ��� Ű���� ���Ͽ� 
// ��������(��������)���� ����

