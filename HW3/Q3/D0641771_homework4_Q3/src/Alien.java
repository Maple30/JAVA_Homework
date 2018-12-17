
public class Alien {
	private String Name;
	private int Health;
	
	//constructor
	public Alien() {
		Name = "N/A";
		Health = 0;
	}
	
	public Alien(String Name, int Health) {
		this.Name = Name;
		this.Health = Health;
	}
	
	//accessor method
	public String getname() {
		return Name;
	}
	
	public int gethealth() {
		return Health;
	}
	
	//mutator method
	
	public void setname(String Name) {
		this.Name = Name;
	}
	
	public void sethealth(int Health) {
		this.Health = Health;
	}
	
	public String toString() {
		return "Name: " + Name + " Health: " + Health;
	}
}
