package Lab6;
/*
8.	Write a Java application that implements a fully functional calculator (see Windows calculator for functionality).
The program must allow the user to enter numbers and perform, addition, subtraction, multiplication and division etc. 
Initially the user may enter two operands and perform a calculation.  The user should be able to use the result of 
initial calculations as operands in further calculations and so on. 
The program must implement the numeric keypad.
*/
import java.awt.*;
import java.awt.event.*;
import java.math.*;

/**
 * @author c00197220
 *
 */
	public class MyFrame extends Frame implements ActionListener, KeyListener{
		Button  cancel,one,two, three, four, five, six , seven, eight, nine, zero, equal, add, subrtact, division, multiply, squareRoot, procentage, comma, ce ;
	
		TextField input;
		String operator, output;
		double num1, num2, answer; 
		boolean number1 = false, number2 = false, calDone= false, plusCalculation= false, minusCalculation=false, multiplicationCalculation=false, divisionCalculation=false ;
		
		Panel inputPanel = new Panel();
		Panel keypadPanel = new Panel();
		Font inputFont = new Font("Sherif", Font.BOLD,25);
	
	public  MyFrame(){
		this.setVisible(true);
		this.setSize(200,250);
		this.setBackground(Color.LIGHT_GRAY);
		this.setTitle("Calculator");
		
		keypadPanel.setLayout(new GridLayout(4,3,5,5));
		
		input= new TextField(12);		
		input.setFont(inputFont);
		// numbers
		one= new Button("1");
		one.addActionListener(this);
		//one.addKeyListener(this);
		two= new Button("2");
		two.addActionListener(this);
		//two.addKeyListener(this);
		three= new Button("3");
		three.addActionListener(this);
	
		four= new Button("4");
		four.addActionListener(this);
		//one.addKeyListener(this);
		five= new Button("5");
		five.addActionListener(this);
		six= new Button("6");		
		six.addActionListener(this);
		seven= new Button("7");
		seven.addActionListener(this);
		eight= new Button("8");
		eight.addActionListener(this);
		nine= new Button("9");
		nine.addActionListener(this);		
		zero= new Button("0");	
		zero.addActionListener(this);
		// operators 
		equal= new Button("=");
		equal.addActionListener(this);
		multiply= new Button("*");
		multiply.addActionListener(this);
		add= new Button("+");		
		add.addActionListener(this);
		//add.addKeyListener(this);
		subrtact= new Button("-");
		subrtact.addActionListener(this);		
		division= new Button("/");
		division.addActionListener(this);		
		cancel= new Button("C");
		cancel.addActionListener(this);
		procentage=new Button("%");
		procentage.addActionListener(this);
		squareRoot=new Button("\u221A");
		squareRoot.addActionListener(this);
		comma=new Button(".");
		comma.addActionListener(this);
		ce=new Button("CE");
		ce.addActionListener(this);
		//this.addKeyListener(this);
	// adding attributes to frames
		add(inputPanel,"North");
		add(keypadPanel);
		inputPanel.add(input);
		keypadPanel.add(seven);
		keypadPanel.add(eight);
		keypadPanel.add(nine);
		keypadPanel.add(division);
		keypadPanel.add(procentage);
		keypadPanel.add(four);
		keypadPanel.add(five);
		keypadPanel.add(six);
		keypadPanel.add(multiply);	
		keypadPanel.add(squareRoot);
		keypadPanel.add(one);
		keypadPanel.add(two);
		keypadPanel.add(three);		
		keypadPanel.add(subrtact);
		keypadPanel.add(ce);	
		keypadPanel.add(zero);
		keypadPanel.add(comma);		
		keypadPanel.add(equal);
		keypadPanel.add(add);		
		keypadPanel.add(cancel);		
		
		// closing application 
		addWindowListener(new WindowAdapter(){
			
			public void windowClosing(WindowEvent e){
		           System.exit(0);}});			
	}
	// button action 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==one){
			
		input.setText(input.getText() +"1");
		}
		else if(e.getSource()==two){
			input.setText(input.getText()+"2");
		}
		else if(e.getSource()==three){
			input.setText(input.getText()+"3");
		}
		else if(e.getSource()==four){
			input.setText(input.getText()+"4");
		}
		else if(e.getSource()==five){
			input.setText(input.getText()+"5");
		}
		else if(e.getSource()==six){
			input.setText(input.getText()+"6");
		}
		else if(e.getSource()==seven){
			input.setText(input.getText()+"7");
		}
		else if(e.getSource()==eight){
			input.setText(input.getText()+"8");
		}
		else if(e.getSource()==nine){
			input.setText(input.getText()+"9");
		}
		else if(e.getSource()==zero){
			input.setText(input.getText()+"0");
		}
		
		//add button
		else if( e.getSource()== add){
			//if number 1 is empty 
			if (number1 == false){
				num1= Double.parseDouble(input.getText());
				number1= true;
				input.setText("");
				plusCalculation=true;
				}
			//reading second number and calling calculation
			else{
				num2= Double.parseDouble(input.getText());
				if (plusCalculation ||minusCalculation ||multiplicationCalculation ||divisionCalculation){
				answer= calculation(num1, num2, operator);
				input.setText("");			
				num1=answer;
				System.out.println("the answer is "+ num2);
				}
				}
			operator="+";
			input.setText("");
		}
		else if(e.getSource()==subrtact){
			if (number1 == false){
				num1= Double.parseDouble(input.getText());
				number1= true;
				input.setText("");
				minusCalculation=true;
				}
			else{
				num2= Double.parseDouble(input.getText());
				if (plusCalculation ||minusCalculation ||multiplicationCalculation ||divisionCalculation){
				answer= calculation(num1, num2, operator);
				input.setText("");			
				num1=answer;
				System.out.println("the answer is "+ answer);
				}
				}
			operator="-";
			input.setText("");
		}
		else if(e.getSource()==multiply){
			if (number1 == false){
				num1= Double.parseDouble(input.getText());
				number1= true;
				input.setText("");
				multiplicationCalculation=true;
				}
			else{
				num2= Double.parseDouble(input.getText());
				if (plusCalculation ||minusCalculation ||multiplicationCalculation ||divisionCalculation){
				answer= calculation(num1, num2, operator);
				input.setText("");			
				num1=answer;
				System.out.println("the answer is "+ answer);
				}
				}
			operator="*";
			input.setText("");
		}
		else if(e.getSource()==division){
			if (number1 == false){
				num1= Double.parseDouble(input.getText());
				number1= true;
				input.setText("");
				divisionCalculation=true;
				}
			else{
				num2= Double.parseDouble(input.getText());
				if (plusCalculation ||minusCalculation ||multiplicationCalculation ||divisionCalculation){
				answer= calculation(num1, num2, operator);
				input.setText("");			
				num1=answer;
				System.out.println("the answer is "+ answer);
				}
				}
			operator="/";
			input.setText("");
		}
		//***************************new
		else if(e.getSource()==squareRoot){
			
				num1= Double.parseDouble(input.getText());
				calSquareRoot(num1);
				input.setText(Double.toString(answer));
			
			
		}
		// workout procentage
		else if(e.getSource()==procentage){
			if (number1 == false){
				num1= Double.parseDouble(input.getText());
				number1= true;
				input.setText("");
				
				}
			else {
				num2= Double.parseDouble(input.getText());
				
				answer= calProcentage(num1, num2, operator);
				input.setText("");			
				num1=answer;
				System.out.println("the answer is "+ answer);
			
				}
			
			input.setText("");
		
		}
		else if(e.getSource()==comma){			
		input.setText(input.getText()+".");
		}
		else if(e.getSource()==ce){		
			input.setText("");
		}	
		
		//************************************
		else if(e.getSource()==cancel){
			input.setText("");
			number1=false;
			number2=false;
			answer=0;
			//input.setText(Double.toString(answer));
		}
		else if(e.getSource()==equal){
			num2= Double.parseDouble(input.getText());
			answer= calculation(num1, num2, operator);
			System.out.println("the answer is "+ answer);
			num1=answer;
			number2=false;
			input.setText(Double.toString(answer));
		}
		//super.requestFocusInWindow() ;	 
	}
	
	//****************************keylistener*********NOT WORKING**********************************
public void keyTyped(KeyEvent e) {
		if (e.getKeyChar()==1){
		
			input.setText(input.getText() +"1");
			System.out.println(e.getKeyChar());			
		}
		//**************************************
		else if (e.getKeyChar()== '+'){
			//if number 1 is empty 
			System.out.println(e.getKeyChar());
			if (number1 == false){
				num1= Double.parseDouble(input.getText());
				number1= true;
				input.setText("");
				plusCalculation=true;
				}
			//reading second number and calling calculation
			else{
				num2= Double.parseDouble(input.getText());
				if (plusCalculation ||minusCalculation ||multiplicationCalculation ||divisionCalculation){
				answer= calculation(num1, num2, operator);
				input.setText("");			
				num1=answer;
				System.out.println("the answer is "+ num2);
				}
				}
			operator="+";
			input.setText("");
		}
		//*************************************
		
		else if(e.getKeyChar()=='-'){
			if (number1 == false){
				num1= Double.parseDouble(input.getText());
				number1= true;
				input.setText("");
				minusCalculation=true;
				}
			else{
				num2= Double.parseDouble(input.getText());
				if (plusCalculation ||minusCalculation ||multiplicationCalculation ||divisionCalculation){
				answer= calculation(num1, num2, operator);
				input.setText("");			
				num1=answer;
				System.out.println("the answer is "+ answer);
				}
				}
			operator="-";
			input.setText("");
		}
		else if(e.getKeyChar()=='*'){
			if (number1 == false){
				num1= Double.parseDouble(input.getText());
				number1= true;
				input.setText("");
				multiplicationCalculation=true;
				}
			else{
				num2= Double.parseDouble(input.getText());
				if (plusCalculation ||minusCalculation ||multiplicationCalculation ||divisionCalculation){
				answer= calculation(num1, num2, operator);
				input.setText("");			
				num1=answer;
				System.out.println("the answer is "+ answer);
				}
				}
			operator="*";
			input.setText("");
		}
		else if(e.getKeyChar()=='/'){
			if (number1 == false){
				num1= Double.parseDouble(input.getText());
				number1= true;
				input.setText("");
				divisionCalculation=true;
				}
			else{
				num2= Double.parseDouble(input.getText());
				if (plusCalculation ||minusCalculation ||multiplicationCalculation ||divisionCalculation){
				answer= calculation(num1, num2, operator);
				input.setText("");			
				num1=answer;
				System.out.println("the answer is "+ answer);
				}
				}
			operator="/";
			input.setText("");
		}		
		// workout procentage
		else if(e.getSource()==procentage){
			if (number1 == false){
				num1= Double.parseDouble(input.getText());
				number1= true;
				input.setText("");
				
				}
			else {
				num2= Double.parseDouble(input.getText());
				
				answer= calProcentage(num1, num2, operator);
				input.setText("");			
				num1=answer;
				System.out.println("the answer is "+ answer);
			
				}
			
			input.setText("");
		
		}
		else if(e.getSource()==comma){			
		input.setText(input.getText()+".");
		}
		else if(e.getSource()==ce){		
			input.setText("");
		}	
		
		//************************************
		else if(e.getSource()==cancel){
			input.setText("");
			number1=false;
			number2=false;
			answer=0;
			//input.setText(Double.toString(answer));
		}
		else if(e.getSource()==equal){
			num2= Double.parseDouble(input.getText());
			answer= calculation(num1, num2, operator);
			System.out.println("the answer is "+ answer);
			num1=answer;
			number2=false;
			input.setText(Double.toString(answer));
		}
		 
	}
	//*******************************end keyListener**********************************************
	// calculation 
	public double calculation(double num1, double num2, String operation){
	
		if (operation=="+"){
			answer = num1+ num2 ;
			plusCalculation=false;			
		}
		else if (operator=="-"){
			answer = num1- num2 ;
			minusCalculation=false;
		}
		else if (operator=="*"){
			answer = num1* num2 ;
			multiplicationCalculation=false;
		}
		else if (operator=="/"){
			answer = num1/ num2 ;
			divisionCalculation=false;
		}	
	
	return answer;
	
	}
	public double calSquareRoot(double num1){
		answer = Math.sqrt(num1) ;
		return answer;
	}
	// not finish working only with addition
	public double calProcentage(double num1, double num2, String operator){
		if (operator=="+"){
			answer= num1+((num1/100)*num2 );	
		}
		else if (operator=="-"){
			answer= num1-((num1/100)*num2 );	
		}
		else if (operator=="/" || operator== "*"){
			answer= ((num1/100)*num2 );	
		}
		
		return answer;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	/*@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}*/
	

}
