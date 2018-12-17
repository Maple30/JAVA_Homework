
public class Ogre extends Alien{
	//constructor
	public Ogre() {
		super();
	}
	
	public Ogre(String Name, int Health) {
		super(Name, Health);
	}
	
	public int getDamage() {
		return 6;
	}
	
	public String toString() {
		return super.toString() + "  Damage: " + this.getDamage();
	}
}
