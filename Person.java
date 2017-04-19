import java.util.HashSet;
import java.util.HashMap;

public class Person {
	private String name;
	private String lastName;
	private HashSet<Integer> availablity;
	private HashMap<String, Integer> availablityMatch;
	private String[] languages;
	
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
		//set the % match with person's name
		availablityMatch = new_availablityMatch;
	}
	public HashMap<String, Integer> get_availablityMatch(){
		return availablityMatch;
	}
	public void set_languages(String[] new_languages){
		languages = new_languages;
	}
	public String[] get_languages(){
		return languages;
	}
}