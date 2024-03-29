// StringBuffer 클래스
public class Ex_12 {

	 public static void main(String args[]) {
		    StringBuffer str1 = new StringBuffer("안녕 자바");
		    System.out.println("버퍼에 들어있는 내용 => " + str1);
		    System.out.println("문자열 끼워넣기 => " + str1.insert(3,"Power "));
		    System.out.println("버퍼의 5번째 문자 => " + str1.charAt(4));

		    str1.setCharAt(0, '정');
		    // 0번째 인덱스의 값을 '정'으로 설정
		    System.out.println("0번째 값을 '정'으로 변경 => " + str1);
		    str1.setLength(8);
		    // 문자열의 길이를 8로 설정. 나머지는 손실
		    System.out.println("버퍼의 새로운 값 => " + str1);
		    System.out.println("문자열의 역순출력하기 => " + str1.reverse());
		  }
}
