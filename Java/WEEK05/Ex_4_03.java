import java.util.Scanner;

public class Ex_11 {

	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	 
	System.out.print("��(1-12)�� �Է��Ͻÿ�:");
    int month =scan.nextInt();
    
    String MtoS;
    
    if(month == 12 || month == 1 || month == 2) 
      MtoS = "�ܿ�";
    else if(month == 3 || month == 4 || month == 5)
      MtoS = "��";
    else if(month == 6 || month == 7 || month == 8)
      MtoS = "����";
    else if(month == 9 || month == 10 || month == 11)
      MtoS = "����"	;
    else 
      MtoS = "������� ���Ե��� �ʴ� ����";
    
    System.out.println( month + " ���� " + MtoS + " �Դϴ�.");
    
	scan.close();
  }
}
