
public class PrimeTest {

	public static void main(String[] args) {
		int c=0;
		System.out.print("2부터 100사이에 있는 모든 소수: ");
		
		for(int i=2; i<=100; i++) {
			c=0;
			for(int k=2; k<i; k++) {
				if((i%k)==0) {
					c++;
					break;
				}
			}
			if(c==0) {
				System.out.print(i + " ");
			}
		}
	}

}
