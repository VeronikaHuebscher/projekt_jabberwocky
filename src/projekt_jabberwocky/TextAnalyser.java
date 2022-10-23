package projekt_jabberwocky;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	 * 
	 * @return Anzahl
	 */
	public int analyse(String content, String pattern) {

		// if(content.charAt(0) > content.length(); int i)

		return 0; // anzahl Matches
	}

	
	
	/**
	 * Ermittle das naechste Zeichen
	 * 
	 * @param content Inhalt des Files
	 * @return
	 */
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
//		char firstChar;
//		char secondChar;
		char thirdChar = 'a';

		for (int i = 0; i < content.length() - 2; i++) {
			char firstChar = content.charAt(i);
			char secondChar = content.charAt(i+1);
			thirdChar = content.charAt(i + 2);


			String twoChars = String.valueOf(firstChar) + String.valueOf(secondChar);
			
		
			content.substring(i, i+2);
			
			/*
			 * Gibt es Pattern bereits
			 *    - ja: nimm die Map by Pattern und aktualisiere sie => Anzahl++
			 *    - nein: erstelle neuen Map eintrag mit neuer Map => neue nextChar, Anzahl = 1
			 * 
			 */

		}
		
		return map;
	}
	
	
	public static void main (String[] args) {
		TextAnalyser analyser = new TextAnalyser();
		String content = "ABCsfasdfdsabasrwaevasd f";
		Map<String, Map<String, Integer>> nextChar = analyser.nextChar(content); // Pattern AB => erwarten C
		System.out.println(nextChar);
	}
	

}
