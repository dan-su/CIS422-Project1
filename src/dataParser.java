import com.opencsv.CSVReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class dataParser {
	//takes in first name, last name, languages,(total Availability for m-f),  
	
	public static void CSV_parser(String filePath) throws FileNotFoundException{
		
		CSVReader reader = new CSVReader(new FileReader(filePath), ',', '"', 1);
		System.out.println(reader.getLinesRead());

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
					counter += item[i].length() - item[i].replace("-", "").length();
					days = item[i].split(";");
					for(int j = 0; j < days.length; j++){
						days[j] = days[j].substring(0, 2);
					}

					weekTime.add(days);
				}
				student.set_totalAvailability(counter);
				student.set_availability(weekTime);
				temp.add(student);
			}
			reader.close();
			room.set_roster(temp);
			
			Match.availabilitySort(temp);
			Match.pickTeamCapn(AutomatedGrouping.number_of_groups);
			Match.assemeblyTeam();

			} catch (IOException e) {
			e.printStackTrace();
		}
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
//
//		} catch (FileNotFoundException e) {	
//			e.printStackTrace();
//		}
//		input.close();
//	}
//	
//}
