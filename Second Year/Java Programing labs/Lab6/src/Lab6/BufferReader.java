package Lab6;

import java.io.File;
import java.util.Scanner;

public class BufferReader {



		private  Scanner fileOb;
		// method for opening file
		public void openFile(){
			
			try{
				// need use full path and double \\ before every folder or file
				fileOb= new Scanner(new File("G:\\2015\\labs\\programing labs\\Lab6\\src\\Lab6\\test.txt"));
				
			}
			catch (Exception e){
				System.out.println("could not find file");
			}
		}
			// method for reading file 
			public void readFile(){
				// will keep going until file will be ended means read file fileOb have somethiong in it 
				while(fileOb.hasNext()){
					// reasding string and puting in name variable 
					String age = fileOb.next();
					String name = fileOb.next();
					String surname = fileOb.next();
					
					// outputing string there is printf (print file) instead print  \n is mean new line %s 
					System.out.printf("%s %s %s \n",age, name, surname);
				}
				
			}	
			//closing file 
		public void closeFile(){
			fileOb.close();
		}
		// main method can be in different class file
		public static void main(String[]args){
			// creating object 
			ReadFromFile readingOb = new ReadFromFile();
			// calling all methods 
			readingOb.openFile();
			readingOb.readFile();
			readingOb.closeFile();
		}
	}


