package ramda;

public class Main {
	public static void main(String[] args) {
		FunctionalInterf fi = new FunctionalInterf() {
			
			@Override
			public void any() {
					System.out.println("asd");				
			}
			
		};
		fi.any();
		
		FunctionalInterf fi1 = ()->{
			System.out.println("ramda");
		};
		fi1.any();
	}
}
