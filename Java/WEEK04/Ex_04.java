
public class Ex_04 {
	
	 public static void main(String args[]) {
	    String s1 = "Java Korea"; 
	    // 단축초기화로 생성된 canonical 문자열
	    String s2 = new String("Java Korea"); 
	    // new 연산자 사용
	    String s3 = s2.intern(); 
	    // s2 문자열을 canonical 문자열로 전환 
	    String s4 = "Java Korea"; 
	    // 단축초기화로 생성된 canonical 문자열
	    String s5 = new String("Java Korea"); 

	    System.out.println("s1 == s2 : " + (s1 == s2));
	    System.out.println("s2 == s3 : " + (s2 == s3));
	    System.out.println("s1 == s3 : " + (s1 == s3));
	    System.out.println("s1 == s4 : " + (s1 == s4));
	    System.out.println("s2 == s5 : " + (s2 == s5));
	  }
}
// canonical 문자열 객체는 같은 값을 갖을 경우 하나의 기억장소에 저장
// 문자열 객체는 생성할 때마다 다른 장소에 기억