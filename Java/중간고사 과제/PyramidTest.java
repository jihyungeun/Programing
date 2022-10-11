
public class PyramidTest {

	public static void main(String[] args) {
		int pyramid = 6;
		int space = (pyramid - 1) * 2;
		
		for(int i=1; i<=pyramid; i++) {
			int value = i;
			for(int k=0; k<space; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2 * i -1; j++) {
				System.out.print(value);
				System.out.print(" ");
				
				if(j<i) value--;
				else value++;
			}
			System.out.println();
			space = space -2;
		}

	}

}
