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
<<<<<<< HEAD
			Match.availablitySort(temp);
			for (int i = 0; i < temp.size(); i++){
				System.out.printf("Person: %s, time: %d\n", temp.get(i).get_name(), temp.get(i).get_totalAvailablity());
=======
			for(int i = 0; i < temp.size(); i++){
				System.out.println(temp.get(i).get_name() + " " + temp.get(i).get_availablity());
>>>>>>> 5de96a76fb4fd6e81a1277b7a3bdb3fee8426a90
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	Uncomment for testing
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
<<<<<<< HEAD
		System.out.println("Enter file :");
=======
	System.out.println("Enter file :");
>>>>>>> 5de96a76fb4fd6e81a1277b7a3bdb3fee8426a90
		String inputFile = input.next(); 
		
		try {
			CSV_parser(inputFile);
<<<<<<< HEAD
			//Match.availablitySort(pplList);
=======
			//Match.matching(pplList);
>>>>>>> 5de96a76fb4fd6e81a1277b7a3bdb3fee8426a90
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		}
		input.close();
	}
	
}
