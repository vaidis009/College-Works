package Lab6;
import java.util.*;
public class CraetingFile {

	public static void main(String[] args) {
	
		// formatter outputs a string to file same as printf
		final Formatter fileName;
		
		
		
		try {
			fileName=  new Formatter("G:\\2015\\labs\\programing labs\\Lab6\\src\\Lab6\\createdFile.txt");
			System.out.println("you have created file");
		}
		catch(Exception e){
			System.out.println("you have error");
		}
		
		
		
	}

}
