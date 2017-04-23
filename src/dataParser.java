import com.opencsv.CSVReader;
import org.apache.commons.lang3.*;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class dataParser {
	//takes in fname, lname, languages,(availiblityfor m-f),  
	
	public static void CSV_parser(String filePath) throws FileNotFoundException{
		
		CSVReader reader = new CSVReader(new FileReader(filePath), ',', '"', 1);
		
		try {
			List<String[]> pplList = reader.readAll();
			for (String[] item: pplList){
				Person student = new Person();
				student.set_name(item[1]);
				student.set_lastName(item[2]);
				student.set_languages(item[3]);
				//System.out.println(student.get_lastName());
				//System.out.println(student.get_name());
				//System.out.println(student.get_languages());

//				if we don't want to the library to be added
				int counter = 0;
				String [][] times = new String [][];
				for (int i=4; i < 9; i++){
					counter += StringUtils.countMatches(item[i], "-");
				}
				student.set_totalAvailablity(counter);
				System.out.println(student.get_totalAvailablity());
				//slipt string for time and langauage
				String[] times = item[4].split(";");
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
