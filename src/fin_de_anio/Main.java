package fin_de_anio;

/**
 * 
 * @author n.entremonzaga.monje
 *
 *         Entrar en un local 10 personas, pero solo 5 personas pueden dejar los
 *         abrigos en el ropero. cuando lo hayan dejado las 5 personas los
 *         restantes que quieran dejarlo no podran, tienen dos intentos para
 *         probar si pueden.
 *
 */
public class Main {

	static Ropero ropero1 = new Ropero(5);

	static Cliente cliente1 = new Cliente("Pablo", ropero1, 2, 1);
	static Cliente cliente2 = new Cliente("Daniela", ropero1, 2, 1);
	static Cliente cliente3 = new Cliente("Roberto", ropero1, 2, 1);
	static Cliente cliente4 = new Cliente("Martina", ropero1, 2, 1);
	static Cliente cliente5 = new Cliente("Alberto", ropero1, 2, 1);
	static Cliente cliente6 = new Cliente("Eduardo", ropero1, 2, 1);
	static Cliente cliente7 = new Cliente("Maria", ropero1, 2, 1);
	static Cliente cliente8 = new Cliente("Ana", ropero1, 2, 1);
	static Cliente cliente9 = new Cliente("Jose", ropero1, 2, 1);
	static Cliente cliente10 = new Cliente("Pilar", ropero1, 2, 1);

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
