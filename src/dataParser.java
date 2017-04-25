import com.opencsv.CSVReader;
import org.apache.commons.lang3.*;

import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class dataParser {
	//takes in first name, last name, languages,(totalAvailablity for m-f),  
	
	public static void CSV_parser(String filePath) throws FileNotFoundException{
		
		CSVReader reader = new CSVReader(new FileReader(filePath), ',', '"', 1);

		try {
			List<String[]> rawInput = reader.readAll();
			Classroom room = new Classroom();
			List<Person> temp = new ArrayList<Person>();
			for (String[] item: rawInput){
				Person student = new Person();
				student.set_name(item[1]);
				student.set_lastName(item[2]);
				student.set_languages(item[3]);

				System.out.println(item[4]);
				System.out.println(item[5]);
				int counter = 0;
				String[] days = null;
				List<String[]> weekTime = new ArrayList<String[]>();
				
				//The loop is set for nine, because the time data starts at item[4] w/ 5 time slots
				for (int i = 4; i < 9; i++){
					counter += StringUtils.countMatches(item[i], "-");
					for(int j = 0; j < item[i].length(); j++){
						days = item[i].split(";"); 
					}
					weekTime.add(days);
				}
				student.set_totalAvailablity(counter);
				student.set_availablity(weekTime);
				temp.add(student);
			}
			room.set_roster(temp);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	Uncomment for testing
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter file :");
//		String inputFile = input.next(); 
//		
//		try {
//			CSV_parser(inputFile);
//			Match.matching(pplList);
//		} catch (FileNotFoundException e) {	
//			e.printStackTrace();
//		}
//		input.close();
//	}
//	
}
