// 시프트 연산자
public class Ex_06 {
	public static void main(String args[])	{
		int a = 4;			// 0000 0000 0000 0000 0000 0000 0000 0100
		int b = a << 2;		// 0000 0000 0000 0000 0000 0000 0001 0000
		int c = a >> 2;		// 0000 0000 0000 0000 0000 0000 0000 0001
		int d = -4;			// 1111 1111 1111 1111 1111 1111 1111 1100(반전+1)
		int e = d << 2;		// 1111 1111 1111 1111 1111 1111 1111 0000
		int f = d >> 2;		// 1111 1111 1111 1111 1111 1111 1111 1111
		int g = d >>> 2;	// 0011 1111 1111 1111 1111 1111 1111 1111
		System.out.println("     a = " + a);
		System.out.println("  a << 2 = " + b);
		System.out.println("  a >> 2 = " + c);
		System.out.println("  d << 2 = " + e);
		System.out.println("  d >> 2 = " + f);
		System.out.println(" d >>> 2 = " + g);
	}
}
/* a>>b : a의 각 비트를 오른쪽으로 b번 이동 
             최상위 비트 빈자리는 시프트 전의 최상위로 채움 */
/* a>>>b : a의 각 비트를 오른쪽으로 b번 이동 
             최상위 비트 빈자리는 0으로 채움 */
/* a<<b : a의 각 비트를 왼쪽으로 b번 이동 
             최하위비트 빈자리는 0으로 채움 */
