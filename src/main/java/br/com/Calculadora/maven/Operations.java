package br.com.Calculadora.maven;

public class Operations {
	
 	private double number1, number2;

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public double add() {
        	return number1 + number2;
   	 }

   	 public double subtract() {
        	return number1 - number2;
    	}

    	public double multiply() {
        	return number1 * number2;
   	}

    	public double divide() {
        	if (number2 == 0) {
           	 System.out.println("ERROR_DIVISION_BY_ZERO");
        }

        return number1 / number2;
    }

}
