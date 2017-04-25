public class Team{
	private Person[] members;
	private Integer quality;
	private String diversity;
	private Person teamCapn;
	
	public void set_members(Person[] new_members){
		//sets all members of the team
		this.members = new_members;
	}
	public Person[] get_members(){
		return members;
	}
	public void set_quality(Integer new_quality){
		//sets the quality of the team, which is based off the 
		//avg of sum of members' availablityMatch
		this.quality = new_quality;
	}
	public Integer get_quality(){
		return quality;
	}
	public void set_diversity(String new_diversity){
		//sets the diversity aspect of the team 
		diversity = new_diversity;
	}
	public String get_diversity(){
		return diversity;
	}
	public void set_teamCapn(Person new_teamCapn){
		//sets the team "captain", which is the person with the lowest availablityMatch value
		this.teamCapn = new_teamCapn;
	}
	public Person get_teamCapn(){
		return teamCapn;
	}
}