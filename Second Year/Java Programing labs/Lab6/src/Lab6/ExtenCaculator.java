/**
 * 
 */
package Lab6;

import javax.swing.JOptionPane;

/**
 * @author c00197220
 *
 */
public class ExtenCaculator {

	public static void main(String[] args) {
		
		int number1, number2= 0 ; 
		double answer = 0.0  ;
		String calculationMethod;
		
		number1= Integer.parseInt(JOptionPane.showInputDialog("Please enter the number "));
		calculationMethod= JOptionPane.showInputDialog("Please enter calculation method:+,-, /, *, sqr, inv, cube");
	
		if (calculationMethod.equals("+") || calculationMethod.equals("-") || calculationMethod.equals("/") || calculationMethod.equals("*") ){
		number2= Integer.parseInt(JOptionPane.showInputDialog("Please enter the number "));
		}
		calculationMethod.compareTo("+");
		switch (calculationMethod){
		case "+":	
			answer= number1 + number2;
			break;
		case "-":	
			answer= number1 - number2;
			break;
		case "/":	
			answer= number1 / number2;
			break;
		case "*":	
			answer= number1 * number2;
			break;
		case "sqr":	
			answer= number1 * number1;
			break;
		case "inv":	
			answer= number1 * 0.25;
			break;
		case "cube":	
			answer= number1 * number1* number1;
			break;
		}
		
		JOptionPane.showMessageDialog(null, " Answer "+ answer);
		 System.exit(0);
		
		
		
		
		

	}

}
