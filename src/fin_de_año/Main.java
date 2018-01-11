package fin_de_año;

public class Main {

	static Ropero ropero1 = new Ropero(5);
	
	static Cliente cliente1 = new Cliente(ropero1,2);
	static Cliente cliente2 = new Cliente(ropero1,2);
	static Cliente cliente3 = new Cliente(ropero1,2);
	static Cliente cliente4 = new Cliente(ropero1,2);
	static Cliente cliente5 = new Cliente(ropero1,2);
	static Cliente cliente6 = new Cliente(ropero1,2);
	static Cliente cliente7 = new Cliente(ropero1,2);
	static Cliente cliente8 = new Cliente(ropero1,2);
	static Cliente cliente9 = new Cliente(ropero1,2);
	static Cliente cliente10 = new Cliente(ropero1,2);
	
	public static void main(String[] args) {
		cliente1.start();
		cliente2.start();
		cliente3.start();
		cliente4.start();
		cliente5.start();
		cliente6.start();
		cliente7.start();
		cliente8.start();
		cliente9.start();
		cliente10.start();
	}
}
