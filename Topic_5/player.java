
public class player {

	public static void main(String[] args) {
	
		private int id; 
		private String name; 
		private String teamName; 
		private int score; 
		
		//default constructor 
		
	public player() {
	}
	//constructor with param
	//that initialize the all properties public player(int id, String name, String teamName,int score){
	this.id=id;
	this.name=name;
	this.teamName=teamName
	this.score=score; 
	
	//accesser and mutators for properties 
	
	public int getld() {
		return id; 
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public void setName(String name) {
		return teamName; 
	}
	public void setScore(int score) {
		this.score=score
	}
	
}
