
public class Ex_04 {
	
	 public static void main(String args[]) {
	    String s1 = "Java Korea"; 
	    // �����ʱ�ȭ�� ������ canonical ���ڿ�
	    String s2 = new String("Java Korea"); 
	    // new ������ ���
	    String s3 = s2.intern(); 
	    // s2 ���ڿ��� canonical ���ڿ��� ��ȯ 
	    String s4 = "Java Korea"; 
	    // �����ʱ�ȭ�� ������ canonical ���ڿ�
	    String s5 = new String("Java Korea"); 

	    System.out.println("s1 == s2 : " + (s1 == s2));
	    System.out.println("s2 == s3 : " + (s2 == s3));
	    System.out.println("s1 == s3 : " + (s1 == s3));
	    System.out.println("s1 == s4 : " + (s1 == s4));
	    System.out.println("s2 == s5 : " + (s2 == s5));
	  }
}
// canonical ���ڿ� ��ü�� ���� ���� ���� ��� �ϳ��� �����ҿ� ����
// ���ڿ� ��ü�� ������ ������ �ٸ� ��ҿ� ���