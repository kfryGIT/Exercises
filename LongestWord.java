//zadanie: ile liter ma najdłuższy wyraz ciągu
public class LongestWord {
    public static int findLongest(String sentence) {
        if (sentence == null) {
            return 0;
        }
        String[] split1 = sentence.split(" ");
        int elmax = 0;
        for (String el : split1) {
            if (elmax < el.length()) elmax = el.length();
        }
        return elmax;
    }
    //zadanie: jaka jest ostaria litera ciągu
    public static char getLastCharacter(String input) {
        int len=input.length()-1;
        return input.charAt(len);
    }
}
