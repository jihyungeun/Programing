
public class Ex_05 {

	public static void main(String args[]) {
	    String a1 = "WorldCup Korea";
	    System.out.println("추출된 문자 : " + a1.charAt(2));
	    char buff[] = new char[3];
	    // 크기 3의 배열 생성
	    a1.getChars(5,8,buff,0);
	    // a1에서 index5 부터 8이전까지의 문자를 추출하여 
	    // buff라는 배열에 index 0번째부터 저장하기
	    System.out.println(buff);
	  }
}
// charAt() : 문자열의 특정위치에 있는문자의 위치를 반환
// getChars() : 문자열의 일부를 추출하여 배열로 제공
