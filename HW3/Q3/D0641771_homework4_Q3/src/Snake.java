
public class Snake extends Alien {

	public Snake() {
		super();
	}
	
	public Snake(String Name, int Health) {
		super(Name, Health);
	}
	
	public int getDamage() {
		return 10;
	}
	
	public String toString() {
		return super.toString() + "  Damage: " + this.getDamage();
	}
	
}
