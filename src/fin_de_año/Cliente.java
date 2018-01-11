package fin_de_año;

public class Cliente extends Thread {

	private boolean tieneAbrigo;
	private Ropero ropero = null;

	public Cliente(Ropero ropero) {
		this.tieneAbrigo = true;
		this.ropero= ropero;
	}

	public boolean isTieneAbrigo() {
		return tieneAbrigo;
	}

	public void setTieneAbrigo(boolean tieneAbrigo) {
		this.tieneAbrigo = tieneAbrigo;
	}

	public void DejarAbrigo() throws Exception {
		synchronized (ropero) {
			try {
				Thread.sleep(5000);
				if (isTieneAbrigo() == true) {
					ropero.LlenarInventario();
					setTieneAbrigo(false);
					System.out.println("has dejado el abrigo");
				} else {
					throw new Exception("No has podido dejar el abrigo");
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void RecogerAbrigo(Ropero ropero) throws Exception {
		try {
			Thread.sleep(5000);
			if (isTieneAbrigo() == false) {
				ropero.VaciarInventario();
				setTieneAbrigo(true);
			} else {
				throw new Exception(
						"No has podido recoger el abrigo, Ya tienes uno......");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			DejarAbrigo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
