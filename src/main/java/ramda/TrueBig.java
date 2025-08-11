package ramda;

public class TrueBig {
	public static void main(String[] args) {
		NumInterface a = (big,less)->{

			return (big>less ? true:false);
			
		};
		System.out.println(a.trueBig(100,20));
	}
}
