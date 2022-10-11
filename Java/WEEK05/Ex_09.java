
public class Ex_09 {
	public static void main(String[] ar){
		 
		 /*  for( int i = 1; i <= 7; i++ ){
				for(int j = 1; j <= 5; j++){
					System.out.print(i);
					}
				System.out.println();
			}
		*/
		/*  
		  for( int i = 1; i <= 7; i++ ){
				for(int j = 1; j <= 5; j++){
					if( j == 4) break;
					
					System.out.print(j);
				}
				System.out.println();
			}
		  
		   */ 
		/*
		 *  for( int i = 1; i <= 7; i++ ){
				for(int j = 1; j <= 5; j++){
					if( j == 4) continue;
					
					System.out.print(j);
				}
				System.out.println();
			}
		*/
		  /* 
		  aa : for( int i = 1; i <= 5; i++ ){
				bb : for(int j = 1; j <= 5; j++){
						if( j == 3) break aa;
						System.out.print(j);
						}
					System.out.println();
		  		}  
		  */
					
		  aa : for( int i = 1; i <= 5; i++ ){
			bb : for(int j = 1; j <= 5; j++){
					if( j == 3) continue aa;
					System.out.print(j);
					}
		  		System.out.println();
			}  
			
	}
}