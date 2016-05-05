/*
9.	Write a Java application that implements a currency converter. 
The program must allow the user to convert between currencies,
for example between Euros and Dollars, between dollars and sterling etc.
The user should be able to use the result of an initial conversion as input to further 
conversions and so on.  Include at least four major currencies.
*/

package Lab6;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JComboBox;

public class ConverterFrame extends Frame implements ActionListener{
		
public static void main(String[] args) {
	ConverterFrame converterObject= new ConverterFrame();
}	
	Button clear, convert;
	TextField input, output;
	double amountToConvert, result;
	// creating panels objects
	Panel selectPanel = new Panel();
	Panel inputPanel = new Panel();	
	Panel btnPanel = new Panel();
	//combobox
	JComboBox<String> moneyTypeObject1;
	JComboBox<String> moneyTypeObject2;
	
	 final String[] typeOfMoney = {"EUR","USD","GBP"};
	
public ConverterFrame() {
	
	this. setSize(250,130);
	// user not able to resizes frames 
	this.setResizable(false);
	this. setVisible(true);
	this. setTitle("Money Converter");

	selectPanel.setLayout(new GridLayout(2,2,5,10));

	// text fields
	input= new TextField(10);	
	output= new TextField(10);
    moneyTypeObject1  = new JComboBox<>(typeOfMoney);
	moneyTypeObject2  = new JComboBox<>(typeOfMoney);
	
	// buttons 
	clear= new Button("Clear");
	clear.addActionListener(this);
	convert = new Button ("Convert");
	convert.addActionListener(this);
	// setting panels
	add(selectPanel,"Center");	
	add(btnPanel,"South");
	// adding attributes to the layouts 
	selectPanel.add(moneyTypeObject1);
	selectPanel.add(input);
	selectPanel.add(moneyTypeObject2);	
	selectPanel.add(output);
	btnPanel.add(clear);
	btnPanel.add(convert);
	// closing application 
	addWindowListener(new WindowAdapter(){
		
public void windowClosing(WindowEvent e){
	           System.exit(0);}});
	// not showing attributes in frames without these lines 
	selectPanel.repaint();
	selectPanel.revalidate();
	inputPanel.repaint();
	inputPanel.revalidate();
	btnPanel.repaint();
	btnPanel.revalidate();	
}
public void actionPerformed(ActionEvent e){
	
	String convertFrom = moneyTypeObject1.getSelectedItem().toString();
	String convertTo = moneyTypeObject2.getSelectedItem().toString();
		amountToConvert= Double.parseDouble(input.getText());
	if (e.getSource()==clear){
		input.setText(" ");
		output.setText(" ");		
	}
	// {"EUR","USD","GBP"};
	if (convertFrom== "EUR"&& convertTo== "EUR"){
		result= amountToConvert;
		output.setText(Double.toString(result));
	}
	else if (convertFrom== "EUR"&& convertTo== "USD"){
		result= amountToConvert* 1.118;
		output.setText(Double.toString(result));
	}
	else if (convertFrom== "EUR"&& convertTo== "GBP"){
		result= amountToConvert* 0.770;
		output.setText(Double.toString(result));
	}
	else if (convertFrom== "USD"&& convertTo== "USD"){
		result= amountToConvert;
		output.setText(Double.toString(result));
	}
	else if (convertFrom== "USD"&& convertTo== "EUR"){
		result= amountToConvert* 0.894;
		output.setText(Double.toString(result));
	}
	else if (convertFrom== "USD"&& convertTo== "GBP"){
		result= amountToConvert* 0.688;
		output.setText(Double.toString(result));
	}
	else if (convertFrom== "GBP"&& convertTo== "GBP"){
		result= amountToConvert;
		output.setText(Double.toString(result));
	}
	else if (convertFrom== "GBP"&& convertTo== "EUR"){
		result= amountToConvert* 1.298;
		output.setText(Double.toString(result));
	}
	else if (convertFrom== "GBP"&& convertTo== "USD"){
		result= amountToConvert* 1.452;
		output.setText(Double.toString(result));
	}
	if (e.getSource()==clear){
		input.setText(" ");
		output.setText(" ");		
	}	
}
}


