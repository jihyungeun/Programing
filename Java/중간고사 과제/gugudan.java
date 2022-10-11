
public class gugudan {

	public static void main(String[] args) {
		for(int i=1; i<3; i++) {
			System.out.println(" " + ((i*i/2)+i) + "´Ü" + "      " + 
							  ((i*i/2)+i+1) + "´Ü" + "      " + ((i*i/2)+i+2) + "´Ü" + "      ");
			for(int j=1; j<=9; j++) {
				System.out.println((((i*i/2)+i)+i) + "*" + j + "=" + ((i*i/2)+i)*j + "  " + 
											((i*i/2)+i+1) + "*" + j + "=" + ((i*i/2)+i+1)*j + "  " +
											((i*i/2)+i+2) + "*" + j + "=" + ((i*i/2)+i+2)*j);
			}
		}
		
	}

}
