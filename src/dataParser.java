import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class dataParser {
	//takes in fname, lname, (availiblityfor m-f), languages 
	
	public static void CSV_parser(String filePath) throws FileNotFoundException{
		CSVReader reader = new CSVReader(new FileReader(filePath));
		String [] nextLine;
		
		try {
			while ((nextLine = reader.readNext()) != null) {
				// nextLine[] is an array of values from the line
				Person student = new Person();
				student.set_name(nextLine[0]);
				student.set_lastName(nextLine[1]);
				//student.set_availablity(nextLine[2]);//need to change this structure 
				System.out.println(nextLine[0] + nextLine[1] + "etc...");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file :");
		String inputFile = input.next(); 
		
		try {
			CSV_parser(inputFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
