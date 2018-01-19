package fin_de_anio;

/**
 * 
 * @author n.entremonzaga.monje
 *
 */

public class Ropero {

	private int aforoMaxAbrigos;
	private int aforoAbrigos;

	public Ropero(int aforoMaxAbrigos) {
		super();
		this.aforoMaxAbrigos = aforoMaxAbrigos;
		aforoAbrigos = 0;

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
		if (getAforoAbrigos() >= getAforoMaxAbrigos()) {
			throw new Exception("No hay sitio para mas abrigos");
		} else {
			setAforoAbrigos(getAforoAbrigos() + 1);
		}
		if (getAforoAbrigos() >= 5) {
			System.out.println("No hay mas sitios para mas abrigos");
		}
	}
}
