
public class Ex_08 {
	
	public static void main(String args[]) {
	    String s = "알기 쉽게 해설한 JAVA. " + "java 배우기 쉽게 쓴 java 해설서";

	    System.out.println(s);
	    System.out.println("indexOf(해) = " + s.indexOf('해'));
	    System.out.println("lastIndexOf(해) = " + s.lastIndexOf('해'));
	    System.out.println("indexOf(a) = " + s.indexOf('a'));
	    System.out.println("lastIndexOf(a) = " + s.lastIndexOf("a"));
	    System.out.println("indexOf(a, 5) = " + s.indexOf('a', 5));
	    // index5 이후의 문자'a' 의 위치 반환
	    System.out.println("lastIndexOf(a, 40) = " + s.lastIndexOf('a', 40));
	    // index40 이전 문자'a'의 마지막 위치 반환
	    System.out.println("indexOf(java, 10) = " + s.indexOf("java", 10));
	    System.out.println("lastIndexOf(java, 40) = " + s.lastIndexOf("java", 40));
	  }
}
//indexOf : 문자열 탐색 위치반환