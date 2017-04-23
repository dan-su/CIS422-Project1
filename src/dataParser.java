import com.opencsv.CSVReader;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class dataParser extends Person{
	//takes in fname, lname, languages,(availiblityfor m-f),  
	
	public static void CSV_parser(String filePath) throws FileNotFoundException{
		
		CSVReader reader = new CSVReader(new FileReader(filePath), ',', '"', 1);
		
		try {
			List<String[]> myList = reader.readAll();
			for (String[] item: myList){
				Person student = new Person();
				student.set_name(item[1]);
				student.set_lastName(item[2]);
				student.set_languages(item[3]);
				//slipt string for time and langauage
				for(String e: item ){

				System.out.println(e);

				}
			}
			reader.close();
		} catch (IOException e) {
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
			e.printStackTrace();
		}
		input.close();
	}
	
}
