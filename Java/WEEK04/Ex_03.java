// String Ŭ���� 
class Ex_03 {
	
  public static void main(String[] ar) {
	  
    char a[] = { 'C','o','m','p','u','t','e','r' };
    String s1 = new String(a);
    // ���ڹ迭�κ��� ���ڿ� ��ü ����
    
    String s2 = new String(a,3,2);
    // ���ڹ迭�� �Ϻκ��� ���ڿ� ��ü�� ����
    
    String s3 = new String("���� ���� �ڹ�");
    // new �����ڸ� ����� ���ڿ� ��ü ����
    
    String s4 = "Canonical ���ڿ�";
    // ���ڿ� ��ü�� �����ϱ� ���� ���� ���ڿ� ����
    // �̷��� �ʱ�ȭ�� ����(shorthand) �ʱ�ȭ�� �Ѵ�
    // �����ʱ�ȭ�� ������ ���ڿ��� canonical ���ڿ��̶� �Ѵ�
    
    System.out.println("���ڿ� s1 : " + s1);
    System.out.println("���ڿ� s1�� ���� : " + s1.length());
    System.out.println("���ڿ� s2 : " + s2);
    System.out.println("���ڿ� s1 = s2 ? : " + s1.compareTo(s2));
           //s1�� C(�ƽ�Ű �ڵ� ��67), s2�� p(�ƽ�Ű �ڵ� ��112)
    System.out.println("���ڿ� s3 : " + s3);
    System.out.println("���ڿ� s4 : " + s4);    
    System.out.println("���ڿ� s4�� �빮�ڷκ�ȯ : " + s4.toLowerCase());
  }
}
//String Ŭ���� : ���(������ �ʴ�) ���ڿ��� ���[90%]
//String �����ڿ� �޼ҵ�
