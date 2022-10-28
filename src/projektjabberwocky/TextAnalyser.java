package projektjabberwocky;

import java.util.HashMap;
import java.util.Map;

public class TextAnalyser {

    /*
     * All analysis are saved here
     */
//	private List<AnalyseDto> mapPatternNumberOf = new ArrayList();

//	public AnalyseDto getPossibilities(String content, String pattern) {
//		return null;
//	}

    /**
     * Bekommmt den Text und das Pattern, und retourniert die Anzahl der Treffer
     *
     * @param content Inhalt des Files
     * @param pattern Suchpattern
     * @return Anzahl
     */
    public int analyse(String content, String pattern) {

        // if(content.charAt(0) > content.length(); int i)

        return 0; // anzahl Matches
    }


    /**
     * nextChar findet den nächsten Char gemäss der Fenstergrösse heraus
     * @param content inhalt vom .txt
     * @param windowsSize vom slider gewählte grösse
     */
    public static void generateStats(String content, int windowsSize){


        for (int i = 0; i < content.length()-windowsSize+1; i++) {
            String window = content.substring(i, i+windowsSize);
            System.out.println(window);

        }
    }

    public Map<String, Map<String, Integer>> nextChar(String content) {

        /*
         *
         * Ebene 1: <key: Pattern: value: Map<nextChar, anzahl Vorkommen>
         * Beispiel PDF: key: th, Map => key: nextChar, Anzahl Vorkommen
         */
        Map<String, Map<String, Integer>> map = new HashMap<>();


        // Research RegEx, next char of pattern
//		String twoChars;
        content.charAt(0);
//


        for (int i = 0; i < content.length() - 2; i++) {






            content.substring(i, i + 2);

            /*
             * Gibt es Pattern bereits
             *    - ja: nimm die Map by Pattern und aktualisiere sie => Anzahl++
             *    - nein: erstelle neuen Map eintrag mit neuer Map => neue nextChar, Anzahl = 1
             *
             */

        }

        return map;
    }


    public static void main(String[] args) {
//        TextAnalyser analyser = new TextAnalyser();
//        String content = "ABCsfasdfdsabasrwaevasd f";
//        Map<String, Map<String, Integer>> nextChar = analyser.nextChar(content); // Pattern AB => erwarten C
//        System.out.println(nextChar);

        generateStats("ABCDERFTH", 3);
    }


}
