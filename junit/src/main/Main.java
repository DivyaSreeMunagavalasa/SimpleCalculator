package junit;

import java.util.Scanner;

public class Main {
	Calculator calculator = new Calculator();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the first operand here:");
	double num1=s.nextDouble();
	System.out.println("Enter the second operand here:");
	double num2=s.nextDouble();
	System.out.println("Enter the operator here:");
	char operator=s.next().charAt(0);
	switch (operator) {
	case '+':
		calculator.setOperation(new Addition());
		System.out.println("Addition of: "+num1+" + "+num2 + " = " + calculator.calculate(num1, num2));
		break;
	case '-':
		calculator.setOperation(new Subtraction());
		System.out.println("Subtraction of: " +num1+" - "+num2 + " = " + calculator.calculate(num1, num2));
		break;
	case '*':
		calculator.setOperation(new Multiplication());
		System.out.println("Multiplication of: " +num1+" * "+num2 + " = " + calculator.calculate(num1, num2));
		break;
	case '/':
		calculator.setOperation(new Division());
		System.out.println("Division: " +num1+" / "+num2 + " = " + calculator.calculate(num1, num2));
		break;
	default:
		System.out.println("Invalid operator");
		return;
	}
}
