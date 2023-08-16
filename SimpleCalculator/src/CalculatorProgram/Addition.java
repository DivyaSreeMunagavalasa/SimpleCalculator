package CalculatorProgram;

public class Addition implements ArithmeticOperation {
	@Override
	public double perform(double num1,double num2) {
		return num1+num2;
	}
}
