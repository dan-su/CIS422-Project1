import java.util.List;

public class Classroom {
	private List<Person> roster;
	private List<Team> potenTeam;
	private List<Team> finalTeam;
	
	public void set_roster(List<Person> new_roster){
		//sets every person of the team
		this.roster = new_roster;
	}
	public List<Person> get_roster(){
		return roster;
	}
	public void set_potenTeam(List<Team> new_potenTeam){
		//sets every person of the team
		this.potenTeam = new_potenTeam;
	}
	public List<Team> get_potenTeam(){
		return finalTeam;
	}
	public void set_finalTeam(List<Team> new_finalTeam){
		//sets every person of the team
		this.potenTeam = new_finalTeam;
	}
	public List<Team> get_finalTeam(){
		return potenTeam;
	}
}
