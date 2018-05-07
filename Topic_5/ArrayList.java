import java.io.File; 
import java.io.FileNtFoundException;
import java.util.ArrayList;
import java.util.Scanner

public class ArrayList {
	
	public String fileName= "NFLPlayer.txt";
	

	public ArrayList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<NFLPlayer>players= new ArrayList<NFLPlayer>();
		try //catching all exceptions thrown by fillSports method
		fillSportsArrayList(players);
				
	printNFLPlayers(players);
				
	public static void fillArrayList(ArrayList<NFLPlayer>players)throws Exception 
	{
		//creating a scanner object to read the file
		Scanner file= new Scanner(new File(fileName));
		while(file.hasNextline()//read the file until last line) {
				
				String line= file.nextLine();
		NFLPlayer= new NFLPlayer 
		a.setName(array[0]);
		a.setRank(Integer.parseInt(array[1]));
		a.setAge(Integer.parseInt(array[2]));
		a.setLosses(Integer.parseInt(array[3]));
		a.setWins(Integer.parseInt(array[4]));
		
		players.add(a);
	}

	}

}
