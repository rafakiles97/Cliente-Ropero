package fin_de_año;

/**
 * 
 * @author n.entremonzaga.monje
 *
 *         En un local han hecho una superoferta de cotillón para Fin de Año.
 *         Han sacado su entrada 1000 personas porque el precio es muy
 *         competitivo. La entrada da derecho, entre otras cosas, a dejar la
 *         ropa de abrigo en un ropero que atiende un empleado. Lo cierto es que
 *         el tema del ropero va a dejar descontentos a los clientes porque el
 *         acceso al ropero sólo permite atender a una persona a la vez y,
 *         además, sólo hay sitio para dejar 500 abrigos. La paciencia de los
 *         clientes es limitada por lo que solo harán un máximo de 2 intentos
 *         para acceder al ropero. Después de estos 2 intentos los clientes
 *         desistirán. Cuando un cliente consigue que le atiendan en el ropero
 *         puede encontrarse con que: Hay sitio para su ropa de abrigo, en cuyo
 *         caso la dejará y se irá. No hay sitio para su abrigo, en cuyo caso el
 *         cliente se irá. Simula el funcionamiento del ropero en Java
 *         suponiendo que han entrado los 1000 de golpe en el local. Los que
 *         dejan el abrigo tardan unos 10 segundos en hacerlo.
 *
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

	public void LlenarInventario() throws Exception {
		if (getAforoAbrigos() >= getAforoMaxAbrigos()) {
			throw new Exception("No hay sitio para mas abrigos");
		}else{
			setAforoAbrigos(getAforoAbrigos()+1);
		}
	}

	public void VaciarInventario() throws Exception {
		if (getAforoAbrigos() <= 0) {
			throw new Exception("No hay abrigos en el ropero");
		}else{
			setAforoAbrigos(getAforoAbrigos()-1);
		}
	}
}
