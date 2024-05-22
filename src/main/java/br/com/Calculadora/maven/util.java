package br.com.Calculadora.maven;

public class util {
	
	public static String replaceDotWithComma(double numero) {
        return String.format("%.2f", numero).replace('.', ',');
    }

}