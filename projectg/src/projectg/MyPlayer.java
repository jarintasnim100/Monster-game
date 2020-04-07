package projectg;

public class MyPlayer extends MyCreature implements Player {
	private int healAmount;

	public MyPlayer(String name, String description, int hitPoints, int damage, int healAmount)
	{
		super(name, description, hitPoints, damage);
		this.healAmount = healAmount;
	}

	public void heal() {
		setHitPoints(healAmount);//mycreature

		System.out.println(this.getName() + "is healed by " + this.healAmount );




	}




}
