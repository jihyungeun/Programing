import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		String hak;
		float score=0, korean=0, english=0, math=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수험자의 이름을 입력하시오. ==> ");
		String name = scan.next();
		System.out.print("국어점수를 입력하시오. ==> ");
		korean = scan.nextInt();
		System.out.print("영어점수를 입력하시오. ==> ");
		english = scan.nextInt();
		System.out.print("수학점수를 입력하시오. ==> ");
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
		
		System.out.print(name + "씨는 총점 " + int_score + " 평균 ");
		System.out.printf("%.2f", avg);
		System.out.print("으로 성적은 " + hak + "입니다.");
		
		
	}

}
