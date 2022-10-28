package projektjabberwocky;

public class JabberwockyModel {
	private Service service = new Service();
	
	public void myMethod() {
		service.execute();
	}
	
	//Um die Klasse zu testen, kann entfernt werden
	public static void main (String[] args) {
		JabberwockyModel model = new JabberwockyModel();
		model.myMethod();
	}

}
