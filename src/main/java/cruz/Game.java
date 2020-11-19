package cruz;

import java.util.ArrayList;

public class Game {
    private final int ATTEMPTS_NUMBER=10;
    private Board board;
    private SecretCombination secretCombination;
    private ArrayList<Attempt> attempts;
    private int numAttempt;

    public Game() {
        this.board=new Board();
        this.secretCombination=new SecretCombination();
        this.attempts=new ArrayList<Attempt>();
    }

    public void play(){
    	do {
            String input=this.board.inputCombination();
            attempts.add(new Attempt(input).result(this.secretCombination));
 			numAttempt++;
			printAttempts();
		}while(haveMoreAttempts());
		finish();
    }

    private void finish(){
        if(lastAttempt().isWinner()) {
			board.finish("You win :-)!!");
		}else {
            board.finish("You have exceeded the number of attempts :-(\n"+
            "Secret combination: "+secretCombination.toString());
		}
    }

    private void printAttempts() {
		for(Attempt attempt: this.attempts) {
			this.board.printAttempt(attempt.toString());
		}
    }
    
	private boolean haveMoreAttempts() {
		return !lastAttempt().isWinner() && this.numAttempt < ATTEMPTS_NUMBER;
	}
	
	private Attempt lastAttempt() {
		return this.attempts.get(numAttempt - 1);
	}
} // Game
