import java.util.Scanner;

public class Ex_11 {

	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	 
	System.out.print("월(1-12)을 입력하시오:");
    int month =scan.nextInt();
    
    String MtoS;
    
    if(month == 12 || month == 1 || month == 2) 
      MtoS = "겨울";
    else if(month == 3 || month == 4 || month == 5)
      MtoS = "봄";
    else if(month == 6 || month == 7 || month == 8)
      MtoS = "여름";
    else if(month == 9 || month == 10 || month == 11)
      MtoS = "가을"	;
    else 
      MtoS = "사계절에 포함되지 않는 계절";
    
    System.out.println( month + " 월은 " + MtoS + " 입니다.");
    
	scan.close();
  }
}
