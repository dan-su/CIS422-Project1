import java.util.HashMap;
import java.util.HashSet;

public class Person {
	private String name;
	private String lastName;
	private HashSet<Integer> availablity;
	private int totalAvailablity;
	private HashMap<String, Integer> availablityMatch;
	private String languages;
	
	public void set_name(String new_name){
		name = new_name;
	}
	public String get_name(){
		return name;
	}
	public void set_lastName(String new_lastName){
		lastName = new_lastName;
	}
	public String get_lastName(){
		return lastName;
	}
	public void set_availablity(HashSet<Integer> new_availablity){
		availablity = new_availablity;
	}
	public HashSet<Integer> get_availablity(){
		return availablity;
	}
	public void set_availablityMatch(HashMap<String, Integer> new_availablityMatch){
		availablityMatch = new_availablityMatch;
	}
	public void set_totalAvailablity(int new_totalAvailablity){
		totalAvailablity = new_totalAvailablity;
	}
	public int get_totalAvailablity(){
		return totalAvailablity;
	}
	public HashMap<String, Integer> get_availablityMatch(){
		return availablityMatch;
	}
	public void set_languages(String new_language){
		languages = new_language;
	}
	public String get_languages(){
		return languages;
	}
}