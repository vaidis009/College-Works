package Lab6;

import javax.swing.JOptionPane;

public class NumDialogEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;		
		number=Integer.parseInt (JOptionPane.showInputDialog("Please enter the number")	);
				
		if (number %2 == 0){			
			JOptionPane.showMessageDialog(null, number + " is Even ");
		}
		else {
			JOptionPane.showMessageDialog(null, number + " is Odd ");
		}	
		System.exit(0);
	}
}
