package exit;

public class ExitEx {
	public static void main(String[] args) {
		String ssn = "123456789";
		System.out.println(ssn.substring(1, 6));
		
		
		System.out.println(ExitEx.class.getName());
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				System.exit(0);
			}
		}
		System.out.println("종료");
	}
}
