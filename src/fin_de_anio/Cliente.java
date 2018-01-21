package fin_de_anio;

/**
 * 
 * @author n.entremonzaga.monje
 *
 */

public class Cliente extends Thread {

	private boolean tieneAbrigo;
	private Ropero ropero = null;
	private int maxIntentos;
	private static final int TIEMPO_DEJAR_ABRIGO = 10000;
	public String nombre;
	private int numIntentos;

	public Cliente(String nombre, Ropero ropero, int maxIntentos,
			int numIntentos) {
		this.nombre = nombre;
		this.tieneAbrigo = true;
		this.ropero = ropero;
		this.maxIntentos = maxIntentos;
		this.numIntentos = numIntentos;
	}

	public boolean isTieneAbrigo() {
		return tieneAbrigo;
	}

	public void setTieneAbrigo(boolean tieneAbrigo) {
		this.tieneAbrigo = tieneAbrigo;
	}

	public int getMaxIntentos() {
		return maxIntentos;
	}

	public void setMaxIntentos(int maxIntentos) {
		this.maxIntentos = maxIntentos;
	}

	public void DejarAbrigo() throws Exception {
		synchronized (ropero) {
			try {

				if (isTieneAbrigo() == true) {
					Thread.sleep(TIEMPO_DEJAR_ABRIGO);
					ropero.LlenarInventario(nombre);
					setTieneAbrigo(false);
					System.out.println("Soy " + nombre
							+ " he dejado el abrigo, al intento numero "
							+ numIntentos);
				} else {
					throw new Exception(
							"Soy el cliente "
									+ nombre
									+ "No he podido dejar el abrigo, es mi intento numero "
									+ numIntentos);
				}
			} catch (Exception e) {
				System.out
						.println("Soy "
								+ nombre
								+ ". No he podido dejar el abrigo, es mi intento numero ............. "
								+ numIntentos);
			}
		}
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < getMaxIntentos() && isTieneAbrigo(); i++) {
				DejarAbrigo();
				numIntentos++;
			}
			if (numIntentos >= 2 && isTieneAbrigo() == true) {
				Thread.sleep(2000);
				System.out
						.println("No hay sitio para dejar mas abrigos, se te acabaron los intentos "
								+ nombre);
//				System.out
//				.println("No hay sitio para dejar mas abrigos, se acabaron los intentos ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
