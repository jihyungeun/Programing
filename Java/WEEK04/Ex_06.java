
public class Ex_06 {
	
	public static void main(String args[]) {
	    String a1 = "알기쉽다." ;
	    String a2 = "Apple";
	    String a3 = "APPLE";
	    
	    System.out.println("문자열 a1 : " + a1);
	    System.out.println("문자열 a2 : " + a2);
	    System.out.println("문자열 a3 : " + a3);
	    System.out.println("a1과 a2가 동일한 문자열 ? : " + a1.equals(a2));
	    System.out.println("a2와 a3가 동일한 문자열 ? : " + a2.equals(a3));
	    System.out.println("a2와 a3가 동일한 문자열 ?(대소문자 무시) : " 
	                                       + a2.equalsIgnoreCase(a3));
	  }
}

