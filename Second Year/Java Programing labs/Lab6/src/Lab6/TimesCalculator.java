package Lab6;

/**
 * @author c00197220
 *
 */
import javax.swing.*;

public class TimesCalculator {
	
		public static void main(String[] args) {
			
			int number1, number2= 0, i= 0 ; 
			double answer = 0.0  ;
			String calculationMethod, message= "";
			
			number1= Integer.parseInt(JOptionPane.showInputDialog("Please enter the number "));
			calculationMethod= JOptionPane.showInputDialog("Please enter calculation method:+,-, /, *, sqr, inv, cube, times");
		
			if (calculationMethod.equals("+") || calculationMethod.equals("-") || calculationMethod.equals("/") || calculationMethod.equals("*") ){
			number2= Integer.parseInt(JOptionPane.showInputDialog("Please enter the number "));
			}
			//calculationMethod.compareTo("+");
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
			 if (calculationMethod.equals("times")){
				 for (i=0; i <=10; i ++)
					 
				message= message + i + " x " + number1 + "=" +  i* number1 +"\n";
			 }
			 
			 if (calculationMethod.equals("times")){
				 
				 JOptionPane.showMessageDialog(null, "The " + number1 + " times table are \n" +message);
			 }
			 else{			
			JOptionPane.showMessageDialog(null, " Answer "+ answer);
			 System.exit(0);
			 }
			
		
		}	

}
