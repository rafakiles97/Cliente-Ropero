package fin_de_año;

public class Cliente extends Thread {

	private boolean tieneAbrigo;
	private Ropero ropero = null;
	private int maxIntentos;
	private static final int TIEMPO_DEJAR_ABRIGO= 10000;

	public Cliente(Ropero ropero, int maxIntentos) {
		this.tieneAbrigo = true;
		this.ropero = ropero;
		this.maxIntentos = maxIntentos;
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
					ropero.LlenarInventario();
					setTieneAbrigo(false);
					System.out.println("has dejado el abrigo");
				} else {
					throw new Exception("No has podido dejar el abrigo");
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("No has podido dejar el abrigo");
			}
		}
	}
// No se usa de momento
//	public void RecogerAbrigo(Ropero ropero) throws Exception {
//		try {
//			Thread.sleep(5000);
//			if (isTieneAbrigo() == false) {
//				ropero.VaciarInventario();
//				setTieneAbrigo(true);
//			} else {
//				throw new Exception(
//						"No has podido recoger el abrigo, Ya tienes uno......");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println("No has podido recoger el abrigo, Ya tienes uno......");
//		}
//	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < getMaxIntentos() && isTieneAbrigo(); i++) {
				DejarAbrigo();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
