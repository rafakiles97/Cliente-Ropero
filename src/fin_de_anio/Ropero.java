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
//		try {
			if (getAforoAbrigos() >= getAforoMaxAbrigos()) {
				throw new Exception("No hay sitio para mas abrigos");
			} else {
				setAforoAbrigos(getAforoAbrigos() + 1);
			}
//		} catch (Exception e) {
//			System.out.println("Lo siento cliente " + nombre
//					+ ", no hay sitio para mas abrigos");
//		}
	}

	// No se usa de momento
	// public void VaciarInventario() throws Exception {
	// if (getAforoAbrigos() <= 0) {
	// throw new Exception("No hay abrigos en el ropero");
	// }else{
	// setAforoAbrigos(getAforoAbrigos()-1);
	// }
	// }
}
