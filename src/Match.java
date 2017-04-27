import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Match {
	private static List<Person> leastMatched;
	

	public static void availablitySort(List<Person> inputList){
		Collections.sort(inputList, new Person());
		leastMatched = new ArrayList<Person>(inputList); 
	}
	public static void matching(List<Person> pplList){
		//for(dint i = 0; i < pplList.; i++){
		//pplList[0]
		//}
	}

	public static void pickTeamCapn(int numOfTeam){
		Person[] temp = new Person[numOfTeam];
		Person[] te = new Person[numOfTeam];
		for(int i = 0; i < numOfTeam; i++){
			Team team = new Team();
			temp[i] = leastMatched.get(i);
			team.set_teamCapn(temp[i]);

			//System.out.println(temp[i].get_name());
			//System.out.println(temp[i]);
//			for(Person a: leastMatched){// printing the sorted list of ages
//				System.out.print(a.get_name() +"  : "+ a.get_totalAvailablity() + ", ");
//			}
			te = team.get_members();
			System.out.println(te[1].get_name());
//			leastMatched.sort(new Person());
			//leastMatched.remove(temp[i].get_totalAvailablity());
			//System.out.println(temp[i]);
		}
	}
		//

//	uncomment for testing
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();

		System.out.println("start");

		list.add(new Person("Bob", 25));
		list.add(new Person("Freddy", 50));
		list.add(new Person("Meg", 4));
		list.add(new Person("Peg", 8));
		list.add(new Person("Dylan", 3));

		list.add(new Person("Talaba", 99));

		availablitySort(list);
//		for(Person a: leastMatched){   // printing the sorted list of ages
//	         System.out.print(a.get_name() +"  : "+ a.get_totalAvailablity() + ", \n");
//	   }
		
		pickTeamCapn(3);
//		for(Person a: leastMatched){   // printing the sorted list of ages
//	         System.out.print(a.get_name() +"  : "+ a.get_totalAvailablity() + ", \n");
//	   }
//		for(int i = 0; i < 6; i++){// printing the sorted list of ages
//			System.out.println("ehhh");
//			System.out.print(leastMatched.get(i).get_name() +"  : "+ leastMatched.get(i).get_totalAvailablity() + ", ");
//		}
//		pickTeamCapn(3);
//
//		availablitySort(list);
//		 for(Person a: leastMatched){   // printing the sorted list of ages
//	         System.out.print(a.get_name() +"  : "+ a.get_totalAvailablity() + ", \n");
//	   }

	}
}