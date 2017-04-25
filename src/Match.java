import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Match {
	public static List<Person> leastMatched;
	
	public static void availablitySort(List<Person> pplList){
		Collections.sort(pplList, new Person());
		pplList = leastMatched; 
	}
	public static void matching(List[] pplList){
		//for(dint i = 0; i < pplList; i++){
		//pplList[0]
		//}
	}
	public static void pickTeamCapn(int numOfTeam){
		Person[] temp = new Person[numOfTeam];
		for(int i = 0; i < numOfTeam; i++){
			Team team = new Team();
			temp[i] = leastMatched.get(i);
			team.set_teamCapn(leastMatched.get(i));
			leastMatched.sort(new Person());
		}
		
	}
	public static void assemblyTeam(List[] remainingMemeber){
		//unsure

	}
//	uncomment for testing
//	public static void main(String[] args) {
//		List<Person> list = new ArrayList<Person>();
//
//		list.add(new Person("Bob", 25));
//		list.add(new Person("Freddy", 50));
//		list.add(new Person("Meg", 4));
//		list.add(new Person("Peg", 8));
//		list.add(new Person("Dylan", 3));
//		
//		availablitySort(list);
//		 for(Person a: list){   // printing the sorted list of ages
//	         System.out.print(a.get_name() +"  : "+ a.get_totalAvailablity() + ", ");
//	   }
//	}
}