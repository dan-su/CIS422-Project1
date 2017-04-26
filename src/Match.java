import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Match {
	private static List<Person> leastMatched;
	
<<<<<<< HEAD
	public static void availablitySort(List<Person> inputList){
		inputList.sort(new Person());
		leastMatched = new ArrayList<Person>(inputList); 
=======
	public static void availablitySort(List<Person> pplList){
		Collections.sort(pplList, new Person());
//		pplList = leastMatched; 
>>>>>>> 5de96a76fb4fd6e81a1277b7a3bdb3fee8426a90
	}
	public static void matching(List<Person> pplList){
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
<<<<<<< HEAD
			System.out.print(leastMatched.get(i).get_name());
//			for(Person a: leastMatched){// printing the sorted list of ages
//				System.out.print(a.get_name() +"  : "+ a.get_totalAvailablity() + ", ");
//			}
=======
//			leastMatched.sort(new Person());
>>>>>>> 5de96a76fb4fd6e81a1277b7a3bdb3fee8426a90
		}
	}
		//

//	uncomment for testing
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
<<<<<<< HEAD
		System.out.println("start");
=======

>>>>>>> 5de96a76fb4fd6e81a1277b7a3bdb3fee8426a90
		list.add(new Person("Bob", 25));
		list.add(new Person("Freddy", 50));
		list.add(new Person("Meg", 4));
		list.add(new Person("Peg", 8));
		list.add(new Person("Dylan", 3));
<<<<<<< HEAD
		list.add(new Person("Talaba", 99));

		availablitySort(list);
		for(int i = 0; i < 6; i++){// printing the sorted list of ages
			System.out.println("ehhh");
			System.out.print(leastMatched.get(i).get_name() +"  : "+ leastMatched.get(i).get_totalAvailablity() + ", ");
		}
		pickTeamCapn(3);
=======
		
		availablitySort(list);
		 for(Person a: list){   // printing the sorted list of ages
	         System.out.print(a.get_name() +"  : "+ a.get_totalAvailablity() + ", ");
	   }
>>>>>>> 5de96a76fb4fd6e81a1277b7a3bdb3fee8426a90
	}
}