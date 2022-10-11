
public class Ex_13 {

	public static void main(String[] ar){
		String s1 = "WorldCup ";
		String s2 = "Korea";
		s1 = s1 + s2;
		System.out.println(s1);		
		
		StringBuffer s3 = new StringBuffer("WorldCup ");
		s3.append("Korea");
		System.out.println(s3);		
	}
}
