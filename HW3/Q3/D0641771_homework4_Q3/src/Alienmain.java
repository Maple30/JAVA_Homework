
public class Alienmain {

	public static void main(String[] args) {
		AlienPack Aliens = new AlienPack(3);
		Marshmallow Alien1 = new Marshmallow("MarshmallowMonster", 10); 
		Ogre Alien2 = new Ogre("OgreMonster", 50);
		Snake Alien3 = new Snake("SnakeMonster", 90);
		
		Aliens.addAlien(Alien1, 0);
		Aliens.addAlien(Alien2, 1);
		Aliens.addAlien(Alien3, 2);
		
		System.out.println("The aliens in this pack are:");
		System.out.println(Alien1.toString());
		System.out.println(Alien2.toString());
		System.out.println(Alien3.toString());
		 
		System.out.println("The total damage from this AlienPack is: " + Aliens.calculateDamage());
	}

}