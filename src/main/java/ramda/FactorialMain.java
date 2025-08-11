package ramda;

public class FactorialMain {
	public static void main(String[] args) {
		Factorial factorial = new Factorial() {
		    @Override
		    public int fac(int a) {
		        return (a <= 1) ? 1 : a * fac(a - 1);
		    }
		};
		System.out.println(factorial.fac(5)); // 120
	}
}
