// break : break�� �����ϴ� �ݺ��� ����� Ż��
// continue : continue�� �����ϴ� �ݺ��� ����� �������� ������ ó�� �����϶�
//                  �ݺ����� ��� ���ǽ����� �̵�

public class Ex_08 {

	public static void main(String[] args) {
		/*for( int i = 1; i <= 10; i++){
			if(i == 5) break;
			
			System.out.println(i + " : "+ "�ڹ��� ����� ����");
		}
	*/
	for( int i = 1; i <= 10; i++){
		if(i == 5) continue;
		
		System.out.println(i + ":"+ "�ڹ��� ����� ����");
	}

}	
}
