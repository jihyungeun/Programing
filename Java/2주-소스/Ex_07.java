// promotion(형변환)
public class Ex_07 {
	public static void main(String[] ar){
		int x = 128; int y = x; 	
		long z = x;
		// promotion - 공간은 낭비되지만 데이터 손실 없음
		// 자동으로 형변환
		
		// byte w = x ; 에러 발생 - 손실이 발생 할 가능성 있음
		
		byte w = (byte)x; // casting
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		System.out.println("w=" + w);
		// int x = 128; 인 경우 손실 발생
	}
}
