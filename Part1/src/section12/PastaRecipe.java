package section12;

public class PastaRecipe extends Recipe {
	public PastaRecipe(String chef) {
		super(chef);
	}
	
	void makeSauce() {
		System.out.println("파스타 소스를 직접 만듭니다.");
	}
}
