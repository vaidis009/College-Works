/*1.	Write a Java application that creates a multi conversion tool. 
The program must allow the user to choose the type of conversion that they require, 
perform the conversion and output the result of the conversion. 
The user should then be able to perform another conversion. 
The multi conversion tool will allow the user to convert from inches to feet (12 inches equals 1 foot),
from pounds to Euro (1 Euro equals 0.79 pounds),
or from Celsius to Fahrenheit (celsius = 5/9 (fahr – 32) or fahr = (celsius * 9/5) + 32)).
*/
package Lab6;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SpringLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

public class MultiConverter extends JFrame implements ActionListener, ItemListener{

	private JPanel contentPane;
	private JTextField txtInput;
	private JTextField txtOutput;
	private  JComboBox<String> selectConverter;
	private JComboBox<String> convertFrom = new JComboBox<>();
	// array for combobox to select what type convertion user want todo
	String[] converterType={"Temperature", "Money Converter", "Size"};
	// money converter
	String[] MoneyType={"USD", "GBP", "EUR"};
	// Temperature converter
	String[] temperatureType={"Celcius", "Fahrenheit"};
	// sizes type
	String[] sizeType={"Inches", "Feet", "Centimetres"};	

	public static void main(String[] args) {
								MultiConverter frame = new MultiConverter();
					frame.setVisible(true);		
	}
	boolean converterSelected= false ;	
	
	public MultiConverter() {
		this.setTitle("Multi converter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 200);
		this.setResizable(false);
		contentPane = new JPanel();
		
		setContentPane(contentPane);
		SpringLayout panelLayout = new SpringLayout();
		contentPane.setLayout(panelLayout);
		
		selectConverter = new JComboBox<>(converterType);
		contentPane.add(selectConverter);
		//selectConverter.setSelectedIndex(-1);
		//selectConverter.addActionListener(this);
		selectConverter.addItemListener(this);
	
		// when program just open index selected empty view
		selectConverter.setSelectedIndex(-1);
		// setting from left hand where combo box will start
		panelLayout.putConstraint(SpringLayout.WEST, selectConverter, 150,SpringLayout.WEST, contentPane);
		// setting from the top where combo box wiil start
		panelLayout.putConstraint(SpringLayout.NORTH, selectConverter, 10,SpringLayout.NORTH, contentPane);
		// setting where will be finish other words setting sizes its minus because its counting from 
		//right side and going to left thats why is minus 
		panelLayout.putConstraint(SpringLayout.EAST, selectConverter, -150,SpringLayout.EAST, contentPane);
		panelLayout.putConstraint(SpringLayout.SOUTH, selectConverter, -142,SpringLayout.SOUTH, contentPane);		
		
		
		convertFrom = new JComboBox<>();
		contentPane.add(convertFrom);
		//convertFrom.setSelectedIndex(-1);
		
		
	/*	if(selectConverter.getSelectedIndex()==0){
			 convertFrom = new JComboBox<>(MoneyType);
			contentPane.add(convertFrom);
			//convertFrom.setSelectedIndex(-1);
		}*/
	
		panelLayout.putConstraint(SpringLayout.WEST, convertFrom, 50,SpringLayout.WEST, contentPane);
		panelLayout.putConstraint(SpringLayout.NORTH, convertFrom, 45,SpringLayout.NORTH, contentPane);
		panelLayout.putConstraint(SpringLayout.EAST, convertFrom, -250,SpringLayout.EAST, contentPane);
		panelLayout.putConstraint(SpringLayout.SOUTH, convertFrom, -107,SpringLayout.SOUTH, contentPane);
		
		// for combo box need set variable type because can be pictures 
		JComboBox<String> convertTo = new JComboBox<>();
		contentPane.add(convertTo);
		convertTo.setSelectedIndex(-1);
		panelLayout.putConstraint(SpringLayout.WEST, convertTo, 50,SpringLayout.WEST, contentPane);
		panelLayout.putConstraint(SpringLayout.NORTH, convertTo, 75,SpringLayout.NORTH, contentPane);
		panelLayout.putConstraint(SpringLayout.EAST, convertTo, -250,SpringLayout.EAST, contentPane);
		panelLayout.putConstraint(SpringLayout.SOUTH,convertTo, -77,SpringLayout.SOUTH, contentPane);
		// creating text field input box and setting size to 15
		JTextField txtInput= new JTextField(15);
		// adding text box to panel
		contentPane.add(txtInput);
		// setting padding from left side 
		panelLayout.putConstraint(SpringLayout.WEST, txtInput, 210,SpringLayout.WEST, contentPane);
		// setting padding from top 
		panelLayout.putConstraint(SpringLayout.NORTH, txtInput, 45,SpringLayout.NORTH, contentPane);
		//********** no need this line because size can be set when you creating input field
		//panelLayout.putConstraint(SpringLayout.EAST, txtInput, -250,SpringLayout.EAST, contentPane);
		//******************************************************
		// setting padding from botton 
		panelLayout.putConstraint(SpringLayout.SOUTH,txtInput, -107,SpringLayout.SOUTH, contentPane);
		
		JTextField txtOutput= new JTextField(15);
		// adding text box to panel
		contentPane.add(txtOutput);
		// setting padding from left side 
		panelLayout.putConstraint(SpringLayout.WEST, txtOutput, 210,SpringLayout.WEST, contentPane);
		// setting padding from top 
		panelLayout.putConstraint(SpringLayout.NORTH, txtOutput, 75,SpringLayout.NORTH, contentPane);
		//********** no need this line because size can be set when you creating input field
		//panelLayout.putConstraint(SpringLayout.EAST, txtInput, -250,SpringLayout.EAST, contentPane);
		//******************************************************
		// setting padding from botton 
		panelLayout.putConstraint(SpringLayout.SOUTH,txtOutput, -77,SpringLayout.SOUTH, contentPane);
		
		JButton clear = new JButton("Clear");
		contentPane.add(clear);
		panelLayout.putConstraint(SpringLayout.WEST, clear, 120,SpringLayout.WEST, contentPane);
		panelLayout.putConstraint(SpringLayout.NORTH, clear, 115,SpringLayout.NORTH, contentPane);
		panelLayout.putConstraint(SpringLayout.EAST, clear, -250,SpringLayout.EAST, contentPane);
		panelLayout.putConstraint(SpringLayout.SOUTH, clear, -35,SpringLayout.SOUTH, contentPane);		
		
		JButton cal = new JButton("Calculate");
		contentPane.add(cal);
		panelLayout.putConstraint(SpringLayout.WEST, cal, 210,SpringLayout.WEST, contentPane);
		panelLayout.putConstraint(SpringLayout.NORTH, cal, 115,SpringLayout.NORTH, contentPane);
		panelLayout.putConstraint(SpringLayout.EAST, cal, -130,SpringLayout.EAST, contentPane);
		panelLayout.putConstraint(SpringLayout.SOUTH, cal, -35,SpringLayout.SOUTH, contentPane);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(selectConverter==e.getSource()){
			if (selectConverter.getSelectedIndex()==1){			
			
			
			convertFrom.addItem("USD");
			convertFrom.addItem("GBP");
			convertFrom.addItem("EUR");
			
			}}	
		
		
		
	}
	}
