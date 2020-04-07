package projectg;

public class MyRoom implements Room{
	private int roomIndex;
	private String description;
	private MyMonster monster;

	public MyRoom() {
		roomIndex = 0;
		description = "";
		monster = null;

	}

	public int getRoomIndex() {
		return roomIndex;
	}


	public void setRoomIndex(int roomIndex) {
		this.roomIndex = roomIndex;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public MyMonster getMonster() {
		return monster;
	}


	public void setMyMonster(MyMonster monster) {
		this.monster = monster;
	}



	public MyRoom (int roomIndex, String description, MyMonster monster) {
		this.description= description;
		this.roomIndex = roomIndex;

		this.monster = monster;

	}


	@Override
	public boolean isComplete() {
		if(monster.isAlive()) {
			return false;
		}
		else {



			return true;}

	}

	@Override
	public void enter(MyPlayer player) {
		if(monster.isAlive())
		{
			System.out.println(player.getName()+" "+player.getDescription() +" This Room is "+ this.description+ " and has "
					+monster.getName()+" "+ monster.getDescription()+ "!");}
		



	}



}

