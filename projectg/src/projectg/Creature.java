package projectg;

public interface Creature {
	void attack(MyCreature creature);
	void takeDamage(int damage);
	String toString();
	boolean isAlive();
	void heal();

}
