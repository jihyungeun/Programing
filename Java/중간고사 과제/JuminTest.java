import java.util.Scanner;
public class JuminTest {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      String month = "", day = "", gender = "", TK = "";
	      int year2 = 0;
	      
	      System.out.print("�̸��� �Է��ϼ���. ==> ");
	      String name = scan.next();
	      
	      System.out.print("�ֹι�ȣ�� �Է��ϼ���.ex)xxxxxx-xxxxxxx ==> ");
	      String info = scan.next();
	      
	      int age = Integer.parseInt(info.substring(0,2));
	      
	      char ch = info.charAt(7);
	      if (ch == '1' || ch == '3') {gender="����";}
	      else if (ch =='2' || ch == '4') {gender ="����";}
	      else {gender="�ܱ���";}

	      month = info.substring(3, 4);
	      day = info.substring(5, 6);
	      TK = info.substring(9);
	      
	      System.out.println("--------" + TK);
	      
	      if (ch == '1') {
	         year2 = 1900+age;
	         age = 2022-(1900+age)+1;
	      }
	      else if (ch == '3') {
	         year2 = 2000+age;
	         age = 2022-(2000+age)+1;
	      }
	      else if (ch == '2') {
	         year2 = 1900+age;
	         age = 2022-(1900+age)+1;
	      }
	      else if (ch == '4') {
	         year2 = 2000+age;
	         age = 2022-(1900+age)+1;
	      }
	      
	      if (TK == "0") {
	    	  TK = "����";
	      }
	      else if (TK == "1") {
	    	  TK = "��õ, ���";
	      }
	      else if (TK == "2") {
	    	  TK = "����";
	      }
	      else if (TK == "3") {
	    	  TK = "���";
	      }
	      else if (TK == "4") {
	    	  TK = "�泲, ����";
	      }
	      else if (TK == "5") {
	    	  TK = "���, �뱸";
	      }
	      else if (TK == "6") {
	    	  TK = "�泲, �λ�, ���";
	      }
	      else if (TK == "7") {
	    	  TK = "����";
	      }
	      else if (TK == "8") {
	    	  TK = "����, ����";
	      }
	      else if (TK == "9") {
	    	  TK = "����";
	      }
	      
	      System.out.println("=============================================");
	      System.out.println(name + "���� ������ " + year2 + "��" + month + "��" + day + "���̰�");
	      System.out.println(gender + "���� ������� " + TK + "�Դϴ�.");
	}
}

// �迭 ���迡�� ����
// ȭ���� 5, 6���� ����
// �ʱ� LMS -> �Ǳ�
// ������ ������