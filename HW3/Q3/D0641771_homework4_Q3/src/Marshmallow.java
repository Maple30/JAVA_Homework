
public class Marshmallow extends Alien{
	//constructor
	public Marshmallow() {
		super();
	}
	
	public Marshmallow(String Name, int Health) {
		super(Name, Health);
	}
	
	public int getDamage() {
		return 1;
	}
	
	public String toString() {
		return super.toString() + "  Damage: " +this.getDamage();
	}
}
