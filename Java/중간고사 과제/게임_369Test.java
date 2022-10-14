import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
     for(int i=0; i<10; i++){
       System.out.print("1-99까지의 정수를 입력하세요. ==> ");
      int num = scan.nextInt();
      
      if(num==3 || num==6 || num ==9) {
         System.out.println("박수짝");
      }
      else if(num!=3 || num!= 6 || num!=9){
        System.out.print("끝");
        break;
      }
      else if(num >= 10) {
         if((num%10) == 3 || (num%10) == 6 || (num%10) == 9) {
            if(num/10 == 3 || num/10 == 6 || num/10 == 9)
               System.out.println("박수짝짝");
            else
               System.out.println("박수짝");
         }
         else if(num/10 == 3 || num/10 == 6 || num/10 == 9)
            System.out.println("박수짝");
      }
      
    }
  }
     

}
