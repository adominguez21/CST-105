/** 
 * This class is test for Player
 * @author Alondra Dominguez
 *
 */
public class NFLPlayerDriver {

	public static void main(String[] args) {
		/*
		 * No arg testing
		 */
		System.out.println("No arg constructor test");
		NFLPlayer nfl_player1= new NFLPlayer();//player with no param created
		// so all value will be default 
		System.out.println("Player1 ID: Actual "+nfl_player1.getld()+", Expeted;0");
		System.out.println("Player1 name:Actual"+nfl_player1.getName()+",Expeted:null");
		
		/*
		 * Player with param constructor testing
		 */
		System.out.println("\nparamter constructor test");
		//player with values created 
		NFLPlayer nfl_player2= new NFLPlayer(12,"Cousins","team1",11);
		// testing the properties of player that given above 
		System.out.println("Player2name:Actual"+nfl_player2.getName()+",Expeted:Cousins");
		System.out.println("Player2 ID: Actual"+nfl_player2.getld()+",Expeted:12");
		
		/*
		 * using setter and getter
		 */
		System.out.println("\nSetters and getters function testing");
		//setting the player 1 ID to 8 Initially was 0
		System.out.println("Player1 ID set to 8");
		nfl_player1.setID(8);//seted the Id to 8
		System.out.println("Player1 ID: Actual"+nfl_player1.getId+",Expeted:8");;
		
	}

}
