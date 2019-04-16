
public class CalculadoraVer {

	private int n1, n2;

	public CalculadoraVer(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	private int suma(int num1, int num2) {
		return num1+num2;
	}
	
	private int resta(int num1, int num2) {
		return num1-num2;
	}
	
	private int multiplicacion(int num1, int num2) {
		return num1*num2;
	}
	
	private int division(int num1, int num2) {
		return num1*num2;
	}
	
	private int logaritmo(int num1, int num2) {
		return (int) (Math.log(num1)/Math.log(num2));
		
	}
}
