
public class Ex_04 {
	
	public static void main(String args[]) throws java.io.IOException {
	    char choice;

	    do {
	    	System.out.println("��ü���� ��� ����");
	    	System.out.println("  1. ��ü");
	    	System.out.println("  2. Ŭ����");
	    	System.out.println("  3. �޽���");
	    	System.out.println("  4. ���");
	    	System.out.print("���ϴ� ��ȣ�� �Է��ϼ��� : ");
	    	choice = (char) System.in.read();
	    // ǥ���Է�(Ű����)���κ��� 1���� ���ڸ� �޾Ƶ��δ�.
	    } while( choice < '1' || choice > '4');

	    System.out.println("\n");
	 
	    switch(choice) {
	      case '1':
	        System.out.println("****��ü****");
	        System.out.print("��ü�� ������ �����ϱ� ���� ������ �����̴�");
	        break;
	      case '2':
	        System.out.println("****Ŭ����****");
	        System.out.print("Ŭ������ ��ü�� �����ϴ� ����(template)�̴�");
	        break;
	      case '3':
	        System.out.println("****�޽���****");
	        System.out.print("�޽����� ��ü���� ���� ��Ű�� �����̴�");
	        break;	
	      case '4':
	        System.out.println("****���****");
	        System.out.print("����� ���� Ŭ�����κ��� ��� �Ӽ��� "
	        												+ "������ �̾� �޴´�");
	        break;
	    }
	  }
}
