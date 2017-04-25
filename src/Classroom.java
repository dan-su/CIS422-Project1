import java.util.List;

public class Classroom {
	private List<Person> roster;
	
	public void set_roster(List<Person> new_roster){
		//sets every person of the team
		roster = new_roster;
	}
	public List<Person> get_roster(){
		return roster;
	}
}
