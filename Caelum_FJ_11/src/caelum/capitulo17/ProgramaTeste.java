package caelum.capitulo17;

public class ProgramaTeste {

	public static void main(String[] args) {
		Programa programa1 = new Programa();
		programa1.setId(1);
		
		Thread thread1 = new Thread(programa1);
		thread1.start();
	    
	    Programa programa2 = new Programa();
		programa1.setId(2);
		
		Thread thread2 = new Thread(programa2);
		thread2.start();
	}

}
