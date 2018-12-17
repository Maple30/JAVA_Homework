
public class AlienPack {
	private Alien[] aliens;
	static int Aliensnum;
	//constructor
	public AlienPack(int num){
		Aliensnum = num;
		aliens = new Alien[Aliensnum];
		
	}
	
	public void addAlien (Alien oth, int index) {
		
		aliens[index] = oth;
	}
	
	public Alien[] getAliens() {
		return aliens;
	}
	
	public int calculateDamage() {
		int counter = 0;
		int TotalAttack = 0;
		
		for(counter = 0; counter < aliens.length; counter++) {
			if(aliens[counter].getClass() == Ogre.class) {
				TotalAttack += 6;
			}else if(aliens[counter].getClass() == Marshmallow.class) {
				TotalAttack += 1;
			}else if(aliens[counter].getClass() == Snake.class) {
				TotalAttack += 10;
			}
		}
		
		return TotalAttack;
	}
}
