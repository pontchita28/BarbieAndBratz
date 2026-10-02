abstract class Doll {
	public String name;
	public String hairColor; 
	public String outfit;
	public String career;
	
	Doll(String name, String hairColor, String outfit, String career){
		this.name = name;
		this.hairColor = hairColor;
		this.outfit = outfit;
		this.career = career;
	}
	
	void changeOutfit(String newOutfit) {
		this.outfit = newOutfit;
	}
	
	void changeHairColor(String newHairColor) {
		this.hairColor = newHairColor;
	}
	
	public String toString() {
		return "Hello, I am " + this.name + ". I am a " + this.career 
				+ "I love to wear " + this.outfit + ".";
	}
	
	
	void present() {
		System.out.println(toString());
	}
	
}