package cruz;

/**
 * Hello world!
 *
 */
public class Mastermind 
{
    public static void main( String[] args )
    {
        new Mastermind().play();
    }

    public void play(){
        do {
			new Game().play();
		}while(this.isResume());
    }

    private boolean isResume() {
		String answer;
		do
			answer = Console.getInstance().inString("¿Do you want to play another game y/n?");
		while(!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N"));
		return answer.equalsIgnoreCase("Y");
	}
}
