
public class Ex_06 {
	
	public static void main(String args[]) {
	    String a1 = "�˱⽱��." ;
	    String a2 = "Apple";
	    String a3 = "APPLE";
	    
	    System.out.println("���ڿ� a1 : " + a1);
	    System.out.println("���ڿ� a2 : " + a2);
	    System.out.println("���ڿ� a3 : " + a3);
	    System.out.println("a1�� a2�� ������ ���ڿ� ? : " + a1.equals(a2));
	    System.out.println("a2�� a3�� ������ ���ڿ� ? : " + a2.equals(a3));
	    System.out.println("a2�� a3�� ������ ���ڿ� ?(��ҹ��� ����) : " 
	                                       + a2.equalsIgnoreCase(a3));
	  }
}

