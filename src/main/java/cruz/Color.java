package cruz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public enum Color {
    BLUE('b'),
    GREEN('g'),
    CYAN('c'),
    RED('r'),
    PURPLE('p'),
    ORANGE('o'),
    VIOLET('v'),
    YELLOW('y');

    private char nickname;
    
    private Color(char nickname){
        this.nickname=nickname;
    }

    public static Color valueOf(char character) {
        for (Color color : Color.values()) {
            if (color.nickname == character) {
                return color;
            }
        }
        return null;
    }

    public char getNickname(){
        return this.nickname;
    }

    private static ArrayList<Character> getNickNames(){
        ArrayList<Character> nicknames=new ArrayList<Character>();
        for (Color color : Color.values()) {
            nicknames.add(color.getNickname());
        }
        return nicknames;
    }

    public static String printAllColors(){
        String out="";
    
        for (Color color : Color.values()) {
            out+=color+"("+color.getNickname()+"), ";
        }
        return out.substring(0,out.length()-2);
    }

    public static boolean contains(String string) {
        ArrayList<Character> nicknames=getNickNames();
		for(int i=0;i<string.length();i++) {
			if(!nicknames.contains(string.charAt(i))) {
					return false;
			}
		}
		return true;
    }

    public static boolean hasDuplicateColor(String string) {
        Set<Character> chars = new HashSet<Character>();
        for (char c : string.toCharArray()) {
            if (!chars.add(c)) return true;
        }
        return false;
    }
} // Color
