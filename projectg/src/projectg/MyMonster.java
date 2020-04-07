package projectg;

public class MyMonster extends MyCreature implements Monster {
	private boolean isEnraged;
	private int enrageThreshold;

	public MyMonster() {
		enrageThreshold = 0;
		isEnraged = false;
	}

	public MyMonster(String name, String description, int hitPoints, int damage, int enrageThreshold) {
		super(name, description,hitPoints,damage);
		this.enrageThreshold = enrageThreshold;

	}

	public boolean isEnraged() {
		return isEnraged;
	}

	public void setEnraged(boolean isEnraged) {
		this.isEnraged = isEnraged;
	}

	public int getEnrageThreshold() {
		return enrageThreshold;
	}

	public void setEnrageThreshold(int enrageThreshold) {
		this.enrageThreshold = enrageThreshold;
	}
	
	public void enrage() {
		if(!isEnraged && this.getHitPoints()>0) {
			setDamage(getDamage() * 2);
			isEnraged = true;
			System.out.println(this.getName()+" has been enraged ");
		}
	}

	

	public boolean	canEnrage() {
		if (getHitPoints() < this.enrageThreshold) {
			return true;
		}
		return false;
	}

}



