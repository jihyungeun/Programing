import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_09 {
	public static void main(String[] ar) throws IOException {
			//IOException : ����� ����ó�� �ϴ� Ŭ����(��������)
		BufferedReader in = new BufferedReader(
				                                      new InputStreamReader(System.in));
		
		System.out.print("���� = ");
		int x = Integer.parseInt(in.readLine());
			// readLine : Ű���带 ġ�� ������ �κк��� 
			// ����Ű�� ġ���������� ������ �����ϴ� �޼ҵ�
		System.out.print("x =" + x);		
	}
}
