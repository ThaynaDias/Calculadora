package br.com.Calculadora.maven;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner read = new Scanner(System.in);
		
		Operations op = new Operations();
		
		int option = 0;
		double number1,number2;
		
		System.out.print("Enter number 1: ");
		op.setNumber1(read.nextDouble());
		
		System.out.print("Enter number 2: ");
		op.setNumber2(read.nextDouble());
		
		do {
			
			System.out.print("\nCalculator \n\n");
			
			System.out.print("1 - Add \n");
			System.out.print("2 - Subtract \n");
			System.out.print("3 - Multiply \n");
			System.out.print("4 - Divide \n");
			System.out.print("5 - Exit \n\n");
			System.out.print("Option: ");
			option = read.nextInt();
			
			System.out.print("\n");
			
			switch(option) {
			
			case 1:
				System.out.print("Sum: " + util.replaceDotWithComma(op.add()) + "\n");
				break;
			case 2:
				System.out.print("Subtract: " + util.replaceDotWithComma(op.subtract()) + "\n");
				break;
			case 3:
				System.out.print("Multiplication: " + util.replaceDotWithComma(op.multiply()) + "\n");
				break;
			case 4:
				System.out.print("Division: " + util.replaceDotWithComma(op.divide()) + "\n");
				break;
			case 5:
				System.out.print("\nExit the game\n");
				break;
			default:
				System.out.print("\n" + "Invalid option!!" + "\n");
				break;
			}
			
		} while (option != 5);

	}
}