
//Vaidas Siupienius C00197220 

package Lab6;

 import javax. swing.*;
 
public class MessageTable {

	public static void main(String[] args) {
		String message= "";
		
		int i;
		for (i=0; i<=10; i++){
		message += i+"            " + i*i+"            " + i*i*i +"\n";
		
		}
		message = "Num   "+ "Square    " + "Cube \n"+ message;
		JOptionPane.showMessageDialog(null , message, "Message table", 1);
		
		
		
		
	}
	

}
