import com.opencsv.CSVReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

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
				System.out.println(item[1]);
				
				int counter = 0;
				String[] days = null;
				List<String[]> weekTime = new ArrayList<String[]>();
				
				//The loop is set for nine, because the time data starts at item[4] w/ 5 time slots
				for (int i = 4; i < 9; i++){
					//counter += StringUtils.countMatches(item[i], "-");
					counter += item[i].length() - item[i].replace("-", "").length();
					days = item[i].split(";");
					for(int j = 0; j < days.length; j++){
						//system.out.println(days[j]);
						days[j] = days[j].substring(0, 2);
						//System.out.println(days[j]);
					}
					System.out.println();
					//System.out.println(days[i-4]);

					System.out.println(Arrays.deepToString(days));
						
					//System.out.println(days[0]);
					weekTime.add(days);
				}
				student.set_totalAvailablity(counter);
//				for(String[] dy : weekTime){	
//					System.out.println(dy);
//					for(int k =0; k < dy.length; k++){
//						System.out.println(dy[k]);
//					}
//				}
				
//				days[j] = days[j].substring(0, 2);
//				//System.out.println(item[j]);
//				System.out.println(days[j]);
//				System.out.println(days[j].substring(0, 2));
//				System.out.println(days[j]);
				
				//student.set_availablity(weekTime);
				temp.add(student);
			}
			reader.close();
			room.set_roster(temp);

			Match.availablitySort(temp);
			for (int i = 0; i < temp.size(); i++){
				System.out.printf("Person: %s, time: %d\n", temp.get(i).get_name(), temp.get(i).get_totalAvailablity());
				//System.out.println(temp.get(i).get_availablity().toString());
			}
//			for(int i = 0; i < temp.size(); i++){
//				System.out.println(temp.get(i).get_name() + " " + temp.get(i).get_availablity());
//			}
			
			} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	Uncomment for testing
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
