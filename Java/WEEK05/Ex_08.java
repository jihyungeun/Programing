// break : break를 포함하는 반복문 블록을 탈출
// continue : continue를 포함하는 반복문 블록의 마지막을 만난것 처럼 수행하라
//                  반복문을 벗어나 조건식으로 이동

public class Ex_08 {

	public static void main(String[] args) {
		/*for( int i = 1; i <= 10; i++){
			if(i == 5) break;
			
			System.out.println(i + " : "+ "자바의 세계로 오셈");
		}
	*/
	for( int i = 1; i <= 10; i++){
		if(i == 5) continue;
		
		System.out.println(i + ":"+ "자바의 세계로 오셈");
	}

}	
}
