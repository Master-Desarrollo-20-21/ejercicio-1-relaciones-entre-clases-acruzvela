package cruz;

public class Combination {
    protected static final int COMBINATION_NUMBER=4;
    protected Color[] colors;

    public Combination() {
        this.colors=new Color[Combination.COMBINATION_NUMBER];
    }
    
    protected int indexOf(Color color, Combination combination) {
		for (int i = 0 ; i < combination.colors.length ; i++ ) {
			if(color.equals(combination.colors[i])) {
				return i;
			}
		}
		return -1;
    }
    
    @Override
	public String toString() {
		String result = "";
		for(Color color : this.colors) {
			result += " "+color;
		}
		return result;
	}


} // Combination
