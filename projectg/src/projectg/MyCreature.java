package projectg;

public class MyCreature implements Creature{
	private String name;
	private String description;
	private int hitPoints;
	private int damage;
	private MyRoom room;




	public MyCreature() {
		name = "";
		description = "";
		hitPoints = 0;
		damage = 0;
		room = null;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(MyRoom room) {
		this.room = room;
	}
	public MyCreature (String name, String description,int hitPoints, int damage ) {
		this.name = name;
		this.description = description;
		this.hitPoints = hitPoints;
		this.damage = damage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints+this.hitPoints;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}

	

	public boolean isAlive() {
		if(hitPoints>0) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public void takeDamage(int damage) {
		// TODO Auto-generated method stub
		if(hitPoints>0) {
			hitPoints = hitPoints - damage;} // have to fix this.
		else {
			hitPoints = 0;
		}

		System.out.println(getName() + " has lost " + damage + " health");
		//Please note that hitPoints cannot go below zero.


	}
	public void attack(MyCreature creature) {
		System.out.print(this.name +"attacks target creature's name, dealing damage damage");
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub

	}



}
