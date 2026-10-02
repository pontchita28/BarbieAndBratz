class Barbie extends Doll{
	public Dreamhouse dreamhouse;
	
	Barbie(String name, String hairColor, String outfit, String career){
		super(name, hairColor, outfit, career);
	}
	
	public void defineDreamhouse(String color, String adress, int nbRooms, int value) {
		this.dreamhouse = new Dreamhouse(color, adress, nbRooms, value);
	}
	
	public String toString() {
		return "My name is " + this.name + ". I am a Barbie. I am a/an " 
				+ this.career + ". I love to wear " + this.outfit + ".";
	}
	
	public void present () {
		System.out.println(this.toString());
	}
}
