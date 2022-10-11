//while 문
public class Ex_01 {

	public static void main(String args[]){
		int hap = 0, count = 1;
		
		do{	
			hap = hap + count;
			count++;
		} while (count <= 10);
			
		System.out.println("1부터 10까지의 합은 " + hap + " 입니다");
	}
	
}


/* Do-while 문
		int hap = 0, count = 1;
		do{	
			hap = hap + count;
			count++;
		}while (count <= 10);
		System.out.println("1부터 10까지의 합은 " + hap + " 입니다");

*/
