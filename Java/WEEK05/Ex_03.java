//알파벳 a 부터 z 까지 출력
public class Ex_03 {
	
	public static void main(String[] args) {
		char a = 'a';
		
		do {
			System.out.print(a); // 문자 출력
			a=(char)(a+1); // 알파벳의 경우 1을 더하면 다음 문자의 코드 값
		} while(a <= 'z'); 
	}
}
