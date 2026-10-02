
public class Bratz extends Doll	{
	public String career;
	public String personality;
	public Bratz bestfriend;
	
	Bratz(String name, String hairColor, String outfit, String career, String personality){
		super(name, hairColor, outfit, career);
		this.personality = personality;
	}
	
	Bratz(String name, String hairColor, String outfit, String career, String personality, Bratz bestfriend){
		super(name, hairColor, outfit, career);
		this.personality = personality;
		this.bestfriend = bestfriend;
		
	}
	
	public String toString() {
		return "Hello, I am " + this.name + ". I am a Bratz. I am a/an " + this.career 
				+ ". I love to wear " + this.outfit + ".";
	}
	
	void present() {
		System.out.println(toString());
	}
	
}
