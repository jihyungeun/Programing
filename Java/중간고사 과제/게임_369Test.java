import java.util.Scanner;
public class 게임_369Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1-99까지의 정수를 입력하세요. ==> ");
		int num = scan.nextInt();
		
		if(num==3 || num==6 || num ==9) {
			System.out.println("박수짝");
		}
		else if(num >= 10) {
			if((num%10) == 3 || (num%10) == 6 || (num%10) == 9) {
				if(num/10 == 3 || num/10 == 6 || num/10 == 9)
					System.out.println("박수짝짝");
				else
					System.out.println("박수짝");
			}
			else if(num/10 == 3 || num/10 == 6 || num/10 == 9)
				System.out.println("박수짝");
		}
		
	}

}
46573374564ㅈ45ㅅ4ㄳㄴㅌㅇ4ㄱㄽㅎㅎㅌ4ㄳ