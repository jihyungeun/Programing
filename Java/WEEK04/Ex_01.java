// Ű����� ���� ������ �Է¹޴� ��� Scanner
import java.util.Scanner;

public class Ex_01 {

	public static void main(String args[])  { 
		System.out.println("�̸�, ����, ����, ü��, "
				            + "���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");

		Scanner scan = new Scanner(System.in);
		
		String name = scan.next(); // ���ڿ� ��ū �б�
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		
		String city = scan.next(); // ���ڿ� ��ū �б�
		System.out.println("����� ��� ���ô� " + city + "�Դϴ�.");	
		
		int age = scan.nextInt(); // ���� ��ū �б�
		System.out.println("����� ���̴� " + age + "���Դϴ�.");
		
		double weight = scan.nextDouble(); // �Ǽ� ��ū �б�
		System.out.println("����� ü���� " + weight + "kg�Դϴ�.");
		
		boolean single = scan.nextBoolean(); // �� ��ū �б�
		System.out.println("����� ���� ���δ� " + single + "�Դϴ�.");
		
		scan.close(); // scanner ��Ʈ�� �ݱ�		
	}
}
//Scanner Ŭ������ �ֿ� �޼ҵ�
//next() : ���� �������� ���ڿ��ι�ȯ�Ѵ� 
//nextLine() : �� ���� ��ü�� ���ڿ� Ÿ������ ��ȯ�Ѵ�.
//nextByte(), nextShort(), nextInt()
//nextLong(), nextFloat(), nextDouble()
//close()
