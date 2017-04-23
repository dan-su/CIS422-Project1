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
				System.out.println(student.get_lastName());
				System.out.println(student.get_name());
				System.out.println(student.get_languages());

				int counter = 0;
				for( int i=0; i<item[4].length(); i++ ) {
				    if( item[4].charAt(i) == '-' ) {
				        counter++;
				    } 
				}
				int count = StringUtils.countMatches(item[4], "-");
				//slipt string for time and langauage
				String[] times = item[4].split(";");
				for(String e: times ){
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
