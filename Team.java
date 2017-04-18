public class Team {
	private Person[] members;
	private Integer quality;
	private Integer diversity;
	private Person teamCapn;
	
	public void set_members(Person[] new_members){
		members = new_members;
	}
	public Person[] get_members(){
		return members;
	}
	public void set_quality(Integer new_quality){
		quality = new_quality;
	}
	public Integer get_quality(){
		return quality;
	}
	public void set_diversity(Integer new_diversity){
		diversity = new_diversity;
	}
	public Integer get_diversity(){
		return diversity;
	}
	public void get_teamCapn(Person new_teamCapn){
		teamCapn = new_teamCapn;
	}
	public Person get_teamCapn(){
		return teamCapn;
	}
}