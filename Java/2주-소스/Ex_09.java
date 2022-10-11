import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_09 {
	public static void main(String[] ar) throws IOException {
			//IOException : 입출력 예외처리 하는 클래스(예외전가)
		BufferedReader in = new BufferedReader(
				                                      new InputStreamReader(System.in));
		
		System.out.print("수는 = ");
		int x = Integer.parseInt(in.readLine());
			// readLine : 키보드를 치기 시작한 부분부터 
			// 엔터키를 치기전까지의 내용을 저장하는 메소드
		System.out.print("x =" + x);		
	}
}
