package projekt_jabberwocky;

public class Jabberwocky_Model {
	private Service service = new Service();
	
	public void myMethod() {
		service.execute();
	}
	
	//Um die Klasse zu testen, kann entfernt werden
	public static void main (String[] args) {
		Jabberwocky_Model model = new Jabberwocky_Model();
		model.myMethod();
	}

}
