package fin_de_anio;

/**
 * 
 * @author n.entremonzaga.monje
 *
 */

public class Ropero {

	private int aforoMaxAbrigos;
	private int aforoAbrigos;
	boolean haySitio;

	public Ropero(int aforoMaxAbrigos) {
		super();
		this.aforoMaxAbrigos = aforoMaxAbrigos;
		aforoAbrigos = 0;
		haySitio = true;

	}

	public int getAforoAbrigos() {
		return aforoAbrigos;
	}

	public void setAforoAbrigos(int aforoAbrigos) {
		this.aforoAbrigos = aforoAbrigos;
	}

	public int getAforoMaxAbrigos() {
		return aforoMaxAbrigos;
	}

	public void LlenarInventario(String nombre) throws Exception {
		if (getAforoAbrigos() >= 5 && haySitio) {
			Thread.sleep(10000);
			System.out.println("No hay mas sitios para mas abrigos");
			haySitio = false;
		}
		if (getAforoAbrigos() >= getAforoMaxAbrigos()) {
			throw new Exception("No hay sitio para mas abrigos");
		} else {
			setAforoAbrigos(getAforoAbrigos() + 1);
		}
	}
}
