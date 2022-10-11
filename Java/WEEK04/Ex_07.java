
public class Ex_07 {
	
	static String array1[] = {
		    "IMF", "제주도", "자바도사", "한글나라", "Computer", "모카", "JAVA", "인터넷탐색", 
		    "초롱초롱", "come", "바람", "스크립터", "군고구마", "도서", "their", "country" };  
		  // 문자열의 배열을 선언
		  public static void main(String args[]) {
		    System.out.println("======= 정렬전 데이터 ==========");
		    for(int k = 0; k < array1.length; k++)
		      System.out.print(array1[k] + "  ");
		      // 정렬전의 데이터를 출력
		    System.out.println();
		    System.out.println("======= 정렬후 데이터 ==========");
		    for(int j = 0; j < array1.length; j++) {
		      for(int i = j + 1; i < array1.length; i++) {
		        if(array1[i].compareTo(array1[j]) < 0) {
		          String t = array1[j];
		          array1[j] = array1[i];
		          array1[i] = t;
		         } // 배열에서 연속된 문자열들을 비교하여 위치를 바꾼다
		      }
		      System.out.print(array1[j] + "  ");
		    }
		  }
}
// 버블정렬 : 인접한 두 레코드의 키값을 비교하여 
// 오름차순(내림차순)으로 정렬

