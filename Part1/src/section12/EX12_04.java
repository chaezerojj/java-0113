package section12;

public class EX12_04 {

	public static void main(String[] args) {
//		Recipe r = new Recipe("김일남");
//		r.info();
		
		PastaRecipe pr = new PastaRecipe("Choi");
		pr.info();
		pr.makeSauce();
		
		StakeRecipe sr = new StakeRecipe("Park");
		sr.info();
		sr.grillStake();
	}

}
