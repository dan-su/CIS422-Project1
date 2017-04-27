import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Match {
	private static List<Person> leastMatched;

	public static void availablitySort(List<Person> inputList){
		Collections.sort(inputList, new Person());
		leastMatched = new ArrayList<Person>(inputList); 
	}
	public static void matching(){
		//for(dint i = 0; i < pplList.; i++){
		//pplList[0]
		//}
		Set<String> intersection = new HashSet<String>();
		//List<Integer> c = new ArrayList<Integer> (a.size() > b.size() ?a.size():b.size());
		c.addAll(a);
		c.retainAll(b);
		
	}

	public static void pickTeamCapn(int numOfTeam){
		Person[] temp = new Person[numOfTeam];
		//Person[] te = new Person[numOfTeam];
		for(int i = 0; i < numOfTeam; i++){
			Team team = new Team();
			temp[i] = leastMatched.get(i);
			team.set_teamCapn(temp[i]);
			System.out.printf("%s, %s\n", temp[i].get_name(), temp[i].get_lastName());
			System.out.println(temp[i].get_totalAvailablity());

		}
		for(int j = 0; j < numOfTeam; j++){
		leastMatched.remove(temp[j]);
		}
		for(Person tp : leastMatched){
			System.out.printf("%s, %s, %d\n", tp.get_name(), tp.get_lastName(), tp.get_totalAvailablity());
		}
	}


//	uncomment for testing
	public static void main(String[] args) {
//		List<Person> list = new ArrayList<Person>();
//
//		System.out.println("start");
//
//		list.add(new Person("Bob", 25));
//		list.add(new Person("Freddy", 50));
//		list.add(new Person("Meg", 4));
//		list.add(new Person("Peg", 8));
//		list.add(new Person("Dylan", 3));
//
//		list.add(new Person("Talaba", 99));

//		availablitySort(list);
//		for(Person a: leastMatched){   // printing the sorted list of ages
//	         System.out.print(a.get_name() +"  : "+ a.get_totalAvailablity() + ", \n");
//	   }
		
//		pickTeamCapn(3);
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