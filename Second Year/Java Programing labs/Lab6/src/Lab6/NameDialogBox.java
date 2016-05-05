package Lab6;
 import javax.swing.*;
public class NameDialogBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, surname;
		name = JOptionPane.showInputDialog(null, "Please enter your name ");
		surname= JOptionPane.showInputDialog(null, "Please enter your surname ");		
		JOptionPane.showMessageDialog(null, "Hello " + name+ " "+ surname);
		
		

	}

}
