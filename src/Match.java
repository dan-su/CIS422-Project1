import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Match {
	private static List<Person> leastMatched;
	private static List<Person> teamCapn;
	private static List<Team> suggestedT = new ArrayList<Team>();

	public static void availablitySort(List<Person> inputList){
		Collections.sort(inputList, new Person());
		leastMatched = new ArrayList<Person>(inputList); 
		matching();
	}

	public static void matching(){
		Person p0 = null;
		Person p1 = null;
		TreeSet<String> c = null;
		Set<String> a = null;
		Set<String> b = null;
		Integer count = 0;
		HashMap<String, Integer> matchTo = new HashMap<String, Integer>();

		for(int i = 0; i < leastMatched.size(); i++){
			p0 = leastMatched.get(i);
			for(int j = 1; j < leastMatched.size()-1; j++){
				p1 = leastMatched.get(j);

				for(int k = 0; k < p1.get_availablity().size(); k++){
					a = new TreeSet<String>();
					a.addAll(Arrays.asList(p0.get_availablity().get(k)));
					b = new TreeSet<String>();
					b.addAll(Arrays.asList(p1.get_availablity().get(k)));

					c = new TreeSet<String> (a);
					c.retainAll(b);

					if(c.isEmpty() || c.contains("No")){
						//						System.out.println("no matches");
					}else{
						//						System.out.printf("matches %d\n", c.size());
						//						System.out.println(c);
						count += c.size();
					}
				}
				matchTo.put(p1.get_name(),count);
				p0.set_availablityMatch(matchTo);
				matchTo.put(p0.get_name(),count);
				p1.set_availablityMatch(matchTo);
				count = 0;
			}
			leastMatched.remove(p0);
		}
	}

	public static List<Team> assemeblyTeam() {
		
		for(int j = 0; j < AutomatedGrouping.number_of_groups; j++){
			leastMatched.remove(teamCapn.get(j));
		}
		
		for(Team s : suggestedT){
			HashMap.Entry<String, Integer> maxEntry = null;
			System.out.println(s.get_teamCapn().get_name());
			Person[] tmpMemb = new Person[AutomatedGrouping.size_of_groups];
			for(int k = 0; k < AutomatedGrouping.size_of_groups-1; k++){
				for (HashMap.Entry<String, Integer> entry : s.get_teamCapn().get_availablityMatch().entrySet()){
					if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
						maxEntry = entry;
					}
				}
				System.out.println(maxEntry.getValue() + " "+ maxEntry.getKey());
				Person tm = new Person();
				tm.get_name(); 
				tmpMemb[k] = leastMatched.indexOf(maxEntry.getKey());
				maxEntry = null;
			}
		}
		 
		return suggestedT;
		
	}
	
	public static void pickTeamCapn(int numOfTeam){
		Person[] temp = new Person[numOfTeam];
		
		for(int i = 0; i < numOfTeam; i++){
			Team team = new Team();
			temp[i] = leastMatched.get(i);
			team.set_teamCapn(temp[i]);
			suggestedT.add(team);
		}
		teamCapn = new ArrayList<Person>(leastMatched);
	}

}
