//문자열의 형변환(클래스 메소드)
public class Ex_10 {

	public static void main(String args[]) {
	    int a = 2002 ;
	    char b[] = {'W','o','r','l','d','c','u','p'};
	    System.out.println(String.valueOf(a) + " " + String.valueOf(b) 
	                                 + " in Korea");
	    String s1 = String.valueOf(b);
	    // valueOf() 메소드는 static으로 선언된 클래스 메소드
	    System.out.println(String.valueOf(a) + " " + s1.toUpperCase() 
	                                  + " in Korea");
	    System.out.println(String.valueOf(a) + " " + s1.toLowerCase() 
        + " in Korea");
	  }
}
