package fin_de_anio;

public class Cliente extends Thread {

	private boolean tieneAbrigo;
	private Ropero ropero = null;
	private int maxIntentos;
	private static final int TIEMPO_DEJAR_ABRIGO = 5000;
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
				Thread.sleep(TIEMPO_DEJAR_ABRIGO);
				if (isTieneAbrigo() == true) {
					ropero.LlenarInventario(nombre);
					setTieneAbrigo(false);
					System.out.println("Soy el cliente " + nombre
							+ " he dejado el abrigo, es mi intento numero "
							+ numIntentos);

				} else if (numIntentos == 2) {

					System.out
							.println("No hay sitio para dejar mas abrigos, se te acabaron los intentos cliente "
									+ nombre);

				} else {
					throw new Exception(
							"Soy el cliente "
									+ nombre
									+ "No he podido dejar el abrigo, es mi intento numero "
									+ numIntentos);
					// System.out.println("Soy el cliente " + nombre
					// + ". No he podido dejar el abrigo, es mi intento numero "
					// + numIntentos);

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out
						.println("Soy el cliente "
								+ nombre
								+ ". No he podido dejar el abrigo, es mi intento numero ............. "
								+ numIntentos);
			}
		}
	}

	// No se usa de momento
	// public void RecogerAbrigo(Ropero ropero) throws Exception {
	// try {
	// Thread.sleep(5000);
	// if (isTieneAbrigo() == false) {
	// ropero.VaciarInventario();
	// setTieneAbrigo(true);
	// } else {
	// throw new Exception(
	// "No has podido recoger el abrigo, Ya tienes uno......");
	// }
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// //e.printStackTrace();
	// System.out.println("No has podido recoger el abrigo, Ya tienes uno......");
	// }
	// }

	@Override
	public void run() {

		try {
			for (int i = 0; i < getMaxIntentos() && isTieneAbrigo(); i++) {
				DejarAbrigo();
				// ropero.LlenarInventario(nombre);
				numIntentos++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
