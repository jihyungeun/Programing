import java.io.*;//입력받는 문장 처리하는 패키지

public class Ex_10 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(
				                             new InputStreamReader(System.in));
		int su1 = 0, su2 = 0;
		
		System.out.print("su1 = ");
		su1 = Integer.parseInt(in.readLine());
		System.out.print("su2 = ");
		su2 = Integer.parseInt(in.readLine());
				
		if (su1 > su2) {
			System.out.println("큰 수는" + su1 + "입니다.");
		} 
		else {
			System.out.println("큰 수는" + su2 + "입니다.");
		}
		/*
		if (su1 > su2) {
			System.out.println("큰 수는" + su1 + "입니다.");
		} 
		else if(su2 > su1){
			System.out.println("큰 수는" + su2 + "입니다.");
		}
		else {
			System.out.println("su1 과 su2는 같은 수 입니다.");
		*/
		
	}
}
