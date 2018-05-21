
public class NFLPlayerManager {
	import java.util.ArrayList;

	import java.util.Scanner;

	public class NFLPlayerManager {

	static ArrayList <NFLPlayer> player = new ArrayList<>(); // change the array list name (player) with the actual name in the question

	public static void createPlayers()

	{

	String name, address;

	int id;

	String playerType = "1";

	Scanner kybd = new Scanner(System.in);

	while(true){

	System.out.println("Select Player Type:\n");

	System.out.println("Enter 1 for Defensive Players.");

	System.out.println("Enter 2 for Offensive Players.");

	System.out.println("Enter Q to exit");

	System.out.print("Enter your choice: ");

	playerType = kybd.nextLine();

	if(playerType.equalsIgnoreCase("Q"))

	return;

	if(!(playerType.equals("1") || playerType.equals("2")))

	{

	System.out.println("Invalid Choice!\n");

	continue;

	}

	System.out.println();

	System.out.print("Enter the player's name: ");

	name = kybd.nextLine();

	System.out.print("Enter the player's id: ");

	id = Integer.parseInt(kybd.nextLine());

	System.out.print("Enter the Player's address: ");

	address = kybd.nextLine();

	if(playerType.equals("1"))

	{

	// add new Defensive player into the same arraylist

	player.add(new DefensivePlayer(id, name, address));

	System.out.println("\nDefensive Player added");

	}

	else if(playerType.equals("2"))

	{
	// add new offensive players into the same aaraylist

	player.add(new OffensivePlayer(id, name, address));

	System.out.println("\nOffensive Player added");

	}

	}

	}

	public static void main(String args[])

	{

	createPlayers();

	}

	}

}
