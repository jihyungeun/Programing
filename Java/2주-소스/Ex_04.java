// �ڷ���(����) ��� ���
// �ڷ��� char
// Unicode, Ư������ ���
public class Ex_04 {
	public static void main(String[] ar){
		char a = 65;
		char b = 'A'; // ���� �Ѱ� ���� ����ǥ(' ')
		char c = '\u0041'; 
		// 16���� 4�ڸ�
		/*	unicode 0 1 2 3 4 5 6 7 8 9 a b c d e f 
		    16���� �� �ڸ��� --> 16 ����(2^4) 4bit
		*/
		// �ƽ�Ű �ڵ� : Ű���� ���ǿ� �ִ� ��� ���ڸ� ����ȭ

		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		
		System.out.println("�ȳ��ϼ���!��Ǿ��!�ݰ����ϴ�");
		System.out.println("�ȳ��ϼ���! \t��Ǿ��!\n�ݰ����ϴ�");
		System.out.println("�ȳ��ϼ���! \t��\"�Ǿ�\"��!�ݰ����ϴ�");
		System.out.println("�ȳ�\\�ϼ���!��\"�Ǿ�\"��!\n�ݰ����ϴ�");
		//Syatem.out.println("a + 2 = " + ( a + 2 ) );		
	}
}
