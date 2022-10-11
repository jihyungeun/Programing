// StringBuffer
public class Ex_11 {
	
	public static void main(String args[]) {
	    StringBuffer str1 = new StringBuffer("Hello JAVA");
	    StringBuffer str2 = new StringBuffer("안녕하세요 자바");
	    System.out.println("버퍼1 내용 => " + str1);
	    System.out.println("버퍼1 크기 => " + str1.length());
	    System.out.println("버퍼1 용량 => " + str1.capacity());
	    // 버퍼 크기(10)보다 16이 큰 용량을 가진다.
	    
	    System.out.println("버퍼2 내용 => " + str2);
	    System.out.println("버퍼2 크기 => " + str2.length());
	    System.out.println("버퍼2 용량 => " + str2.capacity());
	  }
	
}
// String : 클래스가 문자열을 생성자로 넣어 인스턴스를 
// 한 번 생성하고 나면 인스턴스가 가진 문자열 값을 변경하지 못하는 단점
// StringBuffer : 같은 인스턴스 안의 문자열(char 배열) 필드 값을 
// 추가하거나 변경할 수 있음
// [ String 클래스와 동일 메소드 ]
// charAt() - 특정 인덱스 위치의 문자 반환
// indexOf() / lastIndexOf() - 문자열 검색해서 위치 반환
// length() - 문자열 길이 반환
// replace() - 검색된 문자열 교체
// substring() - 특정 인덱스 범위 내 문자열을 복사해서 새로 생성된 인스턴스 반환
// toString() - 문자열 출력
