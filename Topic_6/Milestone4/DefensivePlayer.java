
	public class DefensivePlayer extends NFLPlayer{

		public DefensivePlayer()

		{

		super();

		}

		public DefensivePlayer(int id, String name, String address)

		{

		super(id, name, address);

		}

		@Override

		public String toString() {

		return "DefensivePlayer [id=" + super.getId() + ", name=" + super.getName() + ", address=" + super.getAddress() + "]";

		}

		}
}
