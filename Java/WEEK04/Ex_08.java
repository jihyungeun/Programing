
public class Ex_08 {
	
	public static void main(String args[]) {
	    String s = "�˱� ���� �ؼ��� JAVA. " + "java ���� ���� �� java �ؼ���";

	    System.out.println(s);
	    System.out.println("indexOf(��) = " + s.indexOf('��'));
	    System.out.println("lastIndexOf(��) = " + s.lastIndexOf('��'));
	    System.out.println("indexOf(a) = " + s.indexOf('a'));
	    System.out.println("lastIndexOf(a) = " + s.lastIndexOf("a"));
	    System.out.println("indexOf(a, 5) = " + s.indexOf('a', 5));
	    // index5 ������ ����'a' �� ��ġ ��ȯ
	    System.out.println("lastIndexOf(a, 40) = " + s.lastIndexOf('a', 40));
	    // index40 ���� ����'a'�� ������ ��ġ ��ȯ
	    System.out.println("indexOf(java, 10) = " + s.indexOf("java", 10));
	    System.out.println("lastIndexOf(java, 40) = " + s.lastIndexOf("java", 40));
	  }
}
//indexOf : ���ڿ� Ž�� ��ġ��ȯ