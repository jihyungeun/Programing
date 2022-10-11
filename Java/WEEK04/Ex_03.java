// String 클래스 
class Ex_03 {
	
  public static void main(String[] ar) {
	  
    char a[] = { 'C','o','m','p','u','t','e','r' };
    String s1 = new String(a);
    // 문자배열로부터 문자열 객체 생성
    
    String s2 = new String(a,3,2);
    // 문자배열의 일부분을 문자열 객체로 생성
    
    String s3 = new String("배우기 쉬운 자바");
    // new 연산자를 사용한 문자열 객체 생성
    
    String s4 = "Canonical 문자열";
    // 문자열 객체를 생성하기 위해 직접 문자열 지정
    // 이러한 초기화를 단축(shorthand) 초기화라 한다
    // 단축초기화로 생성된 문자열을 canonical 문자열이라 한다
    
    System.out.println("문자열 s1 : " + s1);
    System.out.println("문자열 s1의 길이 : " + s1.length());
    System.out.println("문자열 s2 : " + s2);
    System.out.println("문자열 s1 = s2 ? : " + s1.compareTo(s2));
           //s1의 C(아스키 코드 값67), s2의 p(아스키 코드 값112)
    System.out.println("문자열 s3 : " + s3);
    System.out.println("문자열 s4 : " + s4);    
    System.out.println("문자열 s4를 대문자로변환 : " + s4.toLowerCase());
  }
}
//String 클래스 : 상수(변하지 않는) 문자열에 사용[90%]
//String 생성자와 메소드
