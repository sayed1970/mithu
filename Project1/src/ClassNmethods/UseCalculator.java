package ClassNmethods;

public class UseCalculator {
	public static void main(String [] args) {
		Calculator cal = new Calculator();
		int resulttoAddition = 0;
		resulttoAddition = cal.addition(10, 40);
		System.out.println(resulttoAddition);
		int resultofSubtraction = cal.subtraction(90, 50);
		System.out.println(resultofSubtraction);
		int resultoMul = cal.multi(40, 30);
		System.out.println(resultoMul);
		int resultofDiv = cal.div(100, 20);
		System.out.println(resultofDiv);
		
	}

}
