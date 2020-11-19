package cruz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SecretCombination extends Combination {
	public SecretCombination(){
		init();
	}

    private void init() {
		List<Color> values = Arrays.asList(Color.values());
	    Collections.shuffle(values);
		for( int i = 0 ; i < this.colors.length ; i++) {
			this.colors[i] = values.get(i);
		}
	}

	public HashMap<Peg, Integer> compare(ProposedCombination proposed) {
		HashMap<Peg, Integer> pegs=new HashMap<Peg, Integer>();
		pegs.put(Peg.WHITE,0);
		pegs.put(Peg.BLACK,0);
		for(int i = 0 ; i < this.colors.length ; i++ ) {
			int index = indexOf(this.colors[i], proposed);
			if(index == i) {
				pegs.put(Peg.BLACK,pegs.get(Peg.BLACK)+1);
			}else if(index > -1) {
				pegs.put(Peg.WHITE,pegs.get(Peg.WHITE)+1);
			}
		}
		return pegs;
	}
   
} // SecretCombination
