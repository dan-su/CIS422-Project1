public class Classroom {
	private Person[] roster;
	
	public void set_roster(Person[] new_roster){
		//sets every person of the team
		roster = new_roster;
	}
	public Person[] set_roster(){
		return roster;
	}
}
