import java.io.*;//�Է¹޴� ���� ó���ϴ� ��Ű��

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
			System.out.println("ū ����" + su1 + "�Դϴ�.");
		} 
		else {
			System.out.println("ū ����" + su2 + "�Դϴ�.");
		}
		/*
		if (su1 > su2) {
			System.out.println("ū ����" + su1 + "�Դϴ�.");
		} 
		else if(su2 > su1){
			System.out.println("ū ����" + su2 + "�Դϴ�.");
		}
		else {
			System.out.println("su1 �� su2�� ���� �� �Դϴ�.");
		*/
		
	}
}
