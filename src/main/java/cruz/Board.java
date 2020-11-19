package cruz;

public class Board {
    public String inputCombination() {
		Console.getInstance().outln(Color.printAllColors());
		String input;
		do {
            input=Console.getInstance().inString("Propose a combination, p.e. rgby: ");
		}while(!this.isValid(input));
		return input;
    } // inputCombination

    private boolean isValid(String input) {
		if(!this.isValidLength(input)) {
			Console.getInstance().outln("Wrong proposed combination length");
			return false;
		}
		if(!this.isValidColor(input)) {
			Console.getInstance().outln("Wrong colors they must be: " + Color.printAllColors());
			return false;
		}
		if(this.isRepeatedColor(input)) {
			Console.getInstance().outln("Wrong proposed, can not repeat color.");
			return false;
		}
		return true;
	}

    private boolean isValidLength(String input) {
		return input.length()==Combination.COMBINATION_NUMBER;
    }
    
    private boolean isValidColor(String input) {
		return Color.contains(input);
    }
    
    private boolean isRepeatedColor(String input) {
		return Color.hasDuplicateColor(input);
    }

    public void printAttempt(String string) {
		Console.getInstance().outln(string);
    }
    
    public void finish(String string) {
		Console.getInstance().outln(string);
	}
}
