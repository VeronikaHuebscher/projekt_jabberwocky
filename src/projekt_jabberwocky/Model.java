package projekt_jabberwocky;

public class Model {
	private Service service = new Service();
	
	public void myMethod() {
		service.execute();
	}
	
	public static void main (String[] args) {
		Model model = new Model();
		model.myMethod();
	}

}
