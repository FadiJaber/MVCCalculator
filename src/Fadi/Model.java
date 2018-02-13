package Fadi;

public class Model {

	public String add(double number1, double number2) {
		return "" + (number1 + number2);
	}

	public String subtract(double number1, double number2) {
		return "" + (number1 - number2);
	}

	public String multiply(double number1, double number2) {
		return "" + (number1 * number2);
	}

	public String divide(double number1, double number2) {
		try {
			if (number2 == 0)
				return "error";
			else
				return "" + (number1 / number2);
		} catch (ArithmeticException ex) {
			return "error";
		}
	}

	public String mod(double number1, double number2) {
		try {
			if (number2 == 0)
				return "error";
			else
				return "" + (number1 % number2);
		} catch (ArithmeticException ex) {
			return "error";
		}
	}

	public String squareRoot(double number) {
		try {
			if (number < 0)
				return "error";
			else
				return "" + (Math.sqrt(number));
		} catch (ArithmeticException ex) {
			return "error";
		}
	}
}
