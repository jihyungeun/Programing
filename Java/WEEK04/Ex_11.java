// StringBuffer
public class Ex_11 {
	
	public static void main(String args[]) {
	    StringBuffer str1 = new StringBuffer("Hello JAVA");
	    StringBuffer str2 = new StringBuffer("�ȳ��ϼ��� �ڹ�");
	    System.out.println("����1 ���� => " + str1);
	    System.out.println("����1 ũ�� => " + str1.length());
	    System.out.println("����1 �뷮 => " + str1.capacity());
	    // ���� ũ��(10)���� 16�� ū �뷮�� ������.
	    
	    System.out.println("����2 ���� => " + str2);
	    System.out.println("����2 ũ�� => " + str2.length());
	    System.out.println("����2 �뷮 => " + str2.capacity());
	  }
	
}
// String : Ŭ������ ���ڿ��� �����ڷ� �־� �ν��Ͻ��� 
// �� �� �����ϰ� ���� �ν��Ͻ��� ���� ���ڿ� ���� �������� ���ϴ� ����
// StringBuffer : ���� �ν��Ͻ� ���� ���ڿ�(char �迭) �ʵ� ���� 
// �߰��ϰų� ������ �� ����
// [ String Ŭ������ ���� �޼ҵ� ]
// charAt() - Ư�� �ε��� ��ġ�� ���� ��ȯ
// indexOf() / lastIndexOf() - ���ڿ� �˻��ؼ� ��ġ ��ȯ
// length() - ���ڿ� ���� ��ȯ
// replace() - �˻��� ���ڿ� ��ü
// substring() - Ư�� �ε��� ���� �� ���ڿ��� �����ؼ� ���� ������ �ν��Ͻ� ��ȯ
// toString() - ���ڿ� ���
