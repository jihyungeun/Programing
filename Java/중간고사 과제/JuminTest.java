import java.util.Scanner;
public class JuminTest {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      String month = "", day = "", gender = "", TK = "";
	      int year2 = 0;
	      
	      System.out.print("이름을 입력하세요. ==> ");
	      String name = scan.next();
	      
	      System.out.print("주민번호를 입력하세요.ex)xxxxxx-xxxxxxx ==> ");
	      String info = scan.next();
	      
	      int age = Integer.parseInt(info.substring(0,2));
	      
	      char ch = info.charAt(7);
	      if (ch == '1' || ch == '3') {gender="남성";}
	      else if (ch =='2' || ch == '4') {gender ="여성";}
	      else {gender="외국인";}

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
	    	  TK = "서울";
	      }
	      else if (TK == "1") {
	    	  TK = "인천, 경기";
	      }
	      else if (TK == "2") {
	    	  TK = "강원";
	      }
	      else if (TK == "3") {
	    	  TK = "충북";
	      }
	      else if (TK == "4") {
	    	  TK = "충남, 대전";
	      }
	      else if (TK == "5") {
	    	  TK = "경북, 대구";
	      }
	      else if (TK == "6") {
	    	  TK = "경남, 부산, 울산";
	      }
	      else if (TK == "7") {
	    	  TK = "전북";
	      }
	      else if (TK == "8") {
	    	  TK = "광주, 전남";
	      }
	      else if (TK == "9") {
	    	  TK = "제주";
	      }
	      
	      System.out.println("=============================================");
	      System.out.println(name + "씨는 생일이 " + year2 + "년" + month + "월" + day + "일이고");
	      System.out.println(gender + "으로 출생지는 " + TK + "입니다.");
	}
}

// 배열 시험에서 빠짐
// 화요일 5, 6교시 시험
// 필기 LMS -> 실기
// 범위는 배운데까지