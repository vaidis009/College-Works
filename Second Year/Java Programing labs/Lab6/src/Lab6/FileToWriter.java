package Lab6;

import java.io.*;

public class FileToWriter {	
	
	public static void main(String[] args) throws Exception {
		
		 File tempFile = new File("G:\\2015\\labs\\programing labs\\Lab6\\src\\Lab6\\test.txt");
		
		FileWriter writer = new FileWriter(tempFile, true);
		
		writer.write("hello");

	}

}
