import java.util.Scanner;
public class MoneyTest {

	public static void main(String[] args) {
		System.out.print("�ݾ��� �Է����ּ��� >> ");
		Scanner scan = new Scanner(System.in);
		
		int don = scan.nextInt();
		int five_man=0, one_man=0, five_cheon=0, cheon=0, five=0, one=0, five_zero=0, one_zero=0;
		
		while(don != 0) {
			if(don >= 50000) {
				five_man += 1;
				don = don - 50000;
			}
			else if(don >= 10000) {
				one_man += 1;
				don = don - 10000;
			}
			else if(don >= 5000) {
				five_cheon += 1;
				don = don - 5000;
			}
			else if(don >= 1000) {
				cheon += 1;
				don = don - 1000;
			}
			else if(don >= 500) {
				five += 1;
				don = don - 500;
			}
			else if(don >= 100) {
				one += 1;
				don = don - 100;
			}
			else if(don >= 50) {
				five_zero += 1;
				don = don - 50;
			}
			else if(don >= 10) {
				one_zero += 1;
				don = don - 10;
			}
		}
		
		System.out.println("���� ���� : " + five_man + "��");
		System.out.println("�� ���� : " + one_man + "��");
		System.out.println("��õ ���� : " + five_cheon + "��");
		System.out.println("õ���� : " + cheon + "��");
		System.out.println("500�� ��ȭ : " + five + "��");
		System.out.println("100�� ��ȭ : " + one + "��");
		System.out.println("50�� ��ȭ : " + five_zero + "��");
		System.out.println("10�� ��ȭ : " + one_zero + "��");
	}

}
