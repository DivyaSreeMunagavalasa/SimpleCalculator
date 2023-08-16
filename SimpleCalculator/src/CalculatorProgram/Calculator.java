package CalculatorProgram;
public class Calculator {
	private ArithmeticOperation operation;
	public void setOperation(ArithmeticOperation operation) {
		this.operation=operation;
	}
	public double calculate(double num1,double num2) {
		if(operation==null) {
			throw new IllegalStateException("Operation not set");
		}
		return operation.perform(num1,num2);
	}
}
	
