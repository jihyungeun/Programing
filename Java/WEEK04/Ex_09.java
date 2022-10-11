//문자열의 변환
public class Ex_09 {
	
	 public static void main(String args[]) {
		    String str = "알기쉽게 해설한 자바";
		    System.out.println("인덱스 5부터 8이전까지의 문자열 : " 
		                                     + str.substring(5,8));
		    System.out.println(str.concat("와 예제 프로그램"));
		    //문자열의 결합(추가)
		    System.out.println(str.replace('한','된'));
		    str = "  " + str + "     ";
		    // 앞에 2개, 뒤에 5개의 공백 추가
		    System.out.println("공백 추가 str의 길이 : " + str.length());
		    str = str.trim();
		    // 문자열의 양쪽 공백을 제거
		    System.out.println("공백 제거 str의 길이 : " + str.length());
		  }

}
// substring(i, j) : 문자열의 일부(index i 부터 j이전까지)를 추출
// concat(str) : 현재의 문자열에 str의 문자열을 덧붙임
// replace(ori, rep) : 현재의 문자열 중 문자ori를 rep로 바꿈 
