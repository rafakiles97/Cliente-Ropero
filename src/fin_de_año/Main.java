package fin_de_a�o;

public class Main {

	static Ropero ropero1 = new Ropero(5);
	
	static Cliente cliente1 = new Cliente(ropero1);
	static Cliente cliente2 = new Cliente(ropero1);
	static Cliente cliente3 = new Cliente(ropero1);
	static Cliente cliente4 = new Cliente(ropero1);
	static Cliente cliente5 = new Cliente(ropero1);
	static Cliente cliente6 = new Cliente(ropero1);
	static Cliente cliente7 = new Cliente(ropero1);
	static Cliente cliente8 = new Cliente(ropero1);
	static Cliente cliente9 = new Cliente(ropero1);
	static Cliente cliente10 = new Cliente(ropero1);
	
	public static void main(String[] args) {
		cliente1.start();
		cliente2.start();
		cliente3.start();
		cliente4.start();
	}
}
