package fin_de_año;

public class Main {

	static Ropero ropero1 = new Ropero(2);
	
	static Cliente cliente1 = new Cliente(ropero1);
	static Cliente cliente2 = new Cliente(ropero1);
	static Cliente cliente3 = new Cliente(ropero1);
	static Cliente cliente4 = new Cliente(ropero1);
	
	public static void main(String[] args) {
		cliente1.start();
		cliente2.start();
		cliente3.start();
		cliente4.start();
	}
}
