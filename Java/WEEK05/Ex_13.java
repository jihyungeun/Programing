// 배열의 초기화
public class Ex_13 {

	public static void main(String ar[]){
		int kor = 0, eng = 0, math = 0;
		int[ ] sub; // 선언
		sub = new int[3]; // 생성 및 default 초기화
		// boolean --> false     byte, short, int --> 0   char --> 0, '\0'
		// long --> 0L   float --> 0.0f    double --> 0.0
		// String ---> null
		// kor=sub[0], eng=sub[1], math=sub[2];
	
		for( int i = 0; i < sub.length ; i++){
			System.out.println("sub[" + i + "] = " + sub[i]);
		}
		
		int kor1 = 80, eng1 = 90, math1 = 100;
	
		int[ ] sub1;
		sub1 = new int[ ]{80, 90, 100};
		
		for( int i = 0; i < sub.length ; i++){
			System.out.println("sub1[" + i + "] = " + sub1[i]);
		}	
		
		int[ ] x = new int[7];
		boolean[ ] y = new boolean[3];
		
		for( int i = 0; i < x.length ; i++){
			System.out.println("x[" + i + "] = " + x[i]);
		}	
		for( int i = 0; i < y.length ; i++){
				System.out.println("y[" + i + "] = " + y[i]);	
		}		
	}
}
