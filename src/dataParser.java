import com.opencsv.CSVReader;
import org.apache.commons.lang3.*;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class dataParser {
	//takes in first name, last name, languages,(totalAvailablity for m-f),  
	
	public static void CSV_parser(String filePath) throws FileNotFoundException{
		
		CSVReader reader = new CSVReader(new FileReader(filePath), ',', '"', 1);
		System.out.println("testing!");
		try {
			List<String[]> pplList = reader.readAll();
			for (String[] item: pplList){
				Person student = new Person();
				student.set_name(item[1]);
				student.set_lastName(item[2]);
				student.set_languages(item[3]);

				System.out.println(item[4]);
				System.out.println(item[5]);
				int counter = 0;
				String[] days = new String[];
				List<String[]> weekTime = null;
				
				//The loop is set for nine, because the time data starts at item[4] and have 5 time slots
				for (int i = 4; i < 9; i++){
					counter += StringUtils.countMatches(item[i], "-");
<<<<<<< HEAD
					for(int j = 0; j < item[i].length(); j++){
						days = item[i].split(";"); 
					}
					weekTime.add(days);
=======
					//times [i][0] = item[i].split(";");
>>>>>>> 43f7af55027032c2ee9bde040b63f675368bed19
				}
				
				student.set_totalAvailablity(counter);
			}
			reader.close();
			
		} catch (IOException e) {
			System.out.println("inside parser");
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
