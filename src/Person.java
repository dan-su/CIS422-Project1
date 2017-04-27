import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Person implements Comparator<Person>, Comparable<Person>{
	private String name;
	private String lastName;
	private List<String[]> availability;
	private Integer totalAvailability;
	private HashMap<String, Integer> availabilityMatch;
	private String languages;

//	Uncomment for testing availabilitySort
//	Person(){}
//	Person(String n, int a){
//		name = n;
//		totalavailability = a;
//	}
	
	public void set_name(String new_name){
		this.name = new_name;
	}
	public String get_name(){
		return name;
	}
	public void set_lastName(String new_lastName){
		this.lastName = new_lastName;
	}
	public String get_lastName(){
		return lastName;
	}
	public void set_availability(List<String[]> new_availability){
		this.availability = new_availability;
	}
	public List<String[]> get_availability(){
		return availability;
	}
	public void set_availabilityMatch(HashMap<String, Integer> new_availabilityMatch){
		this.availabilityMatch = new_availabilityMatch;
	}
	public HashMap<String, Integer> get_availabilityMatch(){
		return availabilityMatch;
	}
	public void set_totalAvailability(Integer new_totalAvailability){
		this.totalAvailability = new_totalAvailability;
	}
	public Integer get_totalAvailability(){
		return totalAvailability;
	}
	public void set_languages(String new_language){
		this.languages = new_language;
	}
	public String get_languages(){
		return languages;
	}
	@Override
	public int compareTo(Person p0) {
		// TODO Auto-generated method stub
		return (this.get_name()).compareTo(p0.get_name());
	}
	@Override
	public int compare(Person p0, Person p1) {
		// TODO Auto-generated method stub
		return Integer.compare(p0.get_totalAvailability(), p1.get_totalAvailability());
	}
}