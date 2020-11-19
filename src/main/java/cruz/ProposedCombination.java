package cruz;

public class ProposedCombination extends Combination{
	public ProposedCombination(String input){
		init(input);
	}

    private void init(String input) {
		for(int i=0; i<input.length();i++) {
			this.colors[i]=Color.valueOf(input.charAt(i));
		}
    }
    
} // ProposedCombination
