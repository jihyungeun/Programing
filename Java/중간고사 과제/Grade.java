import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		String hak;
		float score=0, korean=0, english=0, math=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�������� �̸��� �Է��Ͻÿ�. ==> ");
		String name = scan.next();
		System.out.print("���������� �Է��Ͻÿ�. ==> ");
		korean = scan.nextInt();
		System.out.print("���������� �Է��Ͻÿ�. ==> ");
		english = scan.nextInt();
		System.out.print("���������� �Է��Ͻÿ�. ==> ");
		math = scan.nextInt();
		System.out.println("==================================");
		
		score = korean + english + math;
		float avg = score / 3;
		
		if(avg >= 90) {
			hak = "A";
		}
		else if(avg >= 80) {
			hak = "B";
		}
		else if(avg >= 70) {
			hak = "C";
		}
		else if(avg >= 60) {
			hak = "D";
		}
		else hak = "F";
		
		int int_score = (int) score;
		
		System.out.print(name + "���� ���� " + int_score + " ��� ");
		System.out.printf("%.2f", avg);
		System.out.print("���� ������ " + hak + "�Դϴ�.");
		
		
	}

}
