package Lab6;

/**
 * @author c00197220
 *
 */
import javax.swing.*;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number; 
		double answer = 0.0  ;
		String calculationMethod;
		
		number= Integer.parseInt(JOptionPane.showInputDialog("Please enter the number "));
		calculationMethod= JOptionPane.showInputDialog("Please enter calculation method: sqr, inv, cube");
		
		switch (calculationMethod){
		case "sqr":	
			answer= number * number;
			break;
		case "inv":	
			answer= number * 0.25;
			break;
		case "cube":	
			answer= number * number* number;
			break;
		}
		
		JOptionPane.showMessageDialog(null, "Your number is "+ number+ " you select "+calculationMethod+ " answer "+ answer);
		 System.exit(0);
	}

}
