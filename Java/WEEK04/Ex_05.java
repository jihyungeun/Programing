
public class Ex_05 {

	public static void main(String args[]) {
	    String a1 = "WorldCup Korea";
	    System.out.println("����� ���� : " + a1.charAt(2));
	    char buff[] = new char[3];
	    // ũ�� 3�� �迭 ����
	    a1.getChars(5,8,buff,0);
	    // a1���� index5 ���� 8���������� ���ڸ� �����Ͽ� 
	    // buff��� �迭�� index 0��°���� �����ϱ�
	    System.out.println(buff);
	  }
}
// charAt() : ���ڿ��� Ư����ġ�� �ִ¹����� ��ġ�� ��ȯ
// getChars() : ���ڿ��� �Ϻθ� �����Ͽ� �迭�� ����
