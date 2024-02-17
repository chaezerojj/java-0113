package section12;

public class Recipe {
	String chef;
	
	public Recipe(String chef) {
		this.chef = chef;
	}
	
	void info() {
		System.out.println( chef +" 셰프님의 레시피 입니다.");
	}
}
