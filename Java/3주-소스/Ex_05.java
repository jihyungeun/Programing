// 비트 연산자
public class Ex_05 {
	public static void main(String args[]){
		int a = 3; // 0011
		int b = 5; // 0101
		int c = a | b;
		int d = a & b;
		int e = a ^ b;
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" a|b = " + c);
		System.out.println(" a&b = " + d);
		System.out.println(" a^b = " + e);
	}
}
// & : 두 비트 모두 1일때만 1      | : 두 비트 모두 0일때만 0
// ^ : 두 비트가 서로 다르면 1, 같으면 0
