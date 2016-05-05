package Lab6;


import java.io.*;
import java.lang.*;
import java.util.*;



public class WriteToFile {

	private Formatter adding;
	
	
	public void openfile(){
		try {
			adding= new Formatter ("G:\\2015\\labs\\programing labs\\Lab6\\src\\Lab6\\test.txt");
			System.out.println("your file is updated");
		}
		catch(Exception e){
			System.out.println("You have error to open file ");
			
		}
	}
		public void addRecord(){
			// %s every each means one variable if without them is will write only first string
			
			
			adding.format("%s %s %s\n","ten ", "vaidas ", "siupienius");
			adding.format("%s %s %s\n","ten ", "vaidas ", "siu");
			adding.format("%s %s %s\n","ten ", "mark", "Kelly");
			adding.format("%s %s %s\n","ten ", "mark", "Kelly");
			
		}
		public void closeFile(){
			adding.close();
		}
	
	
	
	public static void main(String[] args) {
		
		WriteToFile runFile= new WriteToFile();
		runFile.openfile();
		runFile.addRecord();
		runFile.closeFile();
	
	}
	}
