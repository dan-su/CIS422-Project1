import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class Person implements Comparator<Person>, Comparable<Person>{
	private String name;
	private String lastName;
	private List<String[]> availablity;
	private Integer totalAvailablity;
	private HashMap<String, Integer> availablityMatch;
	private String languages;

//	Uncomment for testing availablitySort
	Person(){}
	Person(String n, int a){
		name = n;
		totalAvailablity = a;
	}
	
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
	public void set_availablity(List<String[]> new_availablity){
		this.availablity = new_availablity;
	}
	public List<String[]> get_availablity(){
		return availablity;
	}
	public void set_availablityMatch(HashMap<String, Integer> new_availablityMatch){
		this.availablityMatch = new_availablityMatch;
	}
	public HashMap<String, Integer> get_availablityMatch(){
		return availablityMatch;
	}
	public void set_totalAvailablity(Integer new_totalAvailablity){
		this.totalAvailablity = new_totalAvailablity;
	}
	public Integer get_totalAvailablity(){
		return totalAvailablity;
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
		return Integer.compare(p0.get_totalAvailablity(), p1.get_totalAvailablity());
	}
}