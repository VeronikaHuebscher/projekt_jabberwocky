package projekt_jabberwocky;

import FileReader.TextReader;


/**
 * Business Logik
 * 
 * @author veron
 *
 */
public class Service {
	private TextReader reader = new TextReader(); 
	private TextAnalyser analyser = new TextAnalyser();
	
	
	/**
	 * Nutze diese Klasse für Aufrufe zu Klassen, welche die Detailarbeiten machen.
	 * Vermeide detailierte Implementierungen hier, bewahre Übersicht
	 */
	public void execute() {
		String pattern = "Fl"; // temporär hartcodiert
		
		// Text einlesen von File
		String content = reader.readContent();
		
		
		char nextChar = analyser.nextChar(content, pattern);
		
		
		int numberOfPattern = analyser.analyse(content, pattern);
		
		
		// next step: statistik
		
	}

}
