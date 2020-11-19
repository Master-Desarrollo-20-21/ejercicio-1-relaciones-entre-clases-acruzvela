package cruz;

import java.util.HashMap;

public class Attempt {
    private ProposedCombination proposed;
    private HashMap<Peg, Integer> pegs;

    public Attempt(String input) {
        this.proposed = new ProposedCombination(input);
    }

    public Attempt result(SecretCombination secret) {
      this.pegs=secret.compare(this.proposed);
		  return this;
    }

    public boolean isWinner() {
		  return pegs.get(Peg.BLACK) == Combination.COMBINATION_NUMBER;
	  }
    
    @Override
    public String toString() {
		  return this.proposed.toString() + " ---> " + this.pegs.get(Peg.BLACK)  + " blacks - " + this.pegs.get(Peg.WHITE) + " whites.";
	  }



}
