public class OffensivePlayer extends NFLPlayer {

	public OffensivePlayer()

{
		super();
}

public OffensivePlayer(int id, String name, String address)

{

super(id, name, address);

}

@Override

public String toString() {

return "OffensivePlayer [id=" + super.getId() + ", name=" + super.getName() + ", address=" + super.getAddress() + "]";

}

}
