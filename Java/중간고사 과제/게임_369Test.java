import java.util.Scanner;
public class ����_369Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1-99������ ������ �Է��ϼ���. ==> ");
		int num = scan.nextInt();
		
		if(num==3 || num==6 || num ==9) {
			System.out.println("�ڼ�¦");
		}
		else if(num >= 10) {
			if((num%10) == 3 || (num%10) == 6 || (num%10) == 9) {
				if(num/10 == 3 || num/10 == 6 || num/10 == 9)
					System.out.println("�ڼ�¦¦");
				else
					System.out.println("�ڼ�¦");
			}
			else if(num/10 == 3 || num/10 == 6 || num/10 == 9)
				System.out.println("�ڼ�¦");
		}
		
	}

}
46573374564��45��4��������4����������4��