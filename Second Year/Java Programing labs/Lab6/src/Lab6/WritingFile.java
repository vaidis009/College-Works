package Lab6;
import java.io.*;
import java.util.Scanner;
public class WritingFile {
private FileWriter writer;

private  Scanner fileOb;
	public static void main(String[] args) throws Exception {
	
	WritingFile writing = new WritingFile();

	writing.writeToFile();
	writing.closingFile();
	writing.openFile();
	writing.readFile();
				
		


	}

	public void writeToFile() throws IOException{
		
	File tempFile = new File("G:\\2015\\labs\\programing labs\\Lab6\\src\\Lab6\\test.txt");
	writer = new FileWriter(tempFile,true) ;
	writer.flush();	
	writer.write("30 vaidas Siupienius\n");
		
	}
	public void closingFile() throws IOException{
		writer.close();
	}
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

}
