package fin_de_año;

public class Cliente {

	private boolean tieneAbrigo;
	
	public Cliente() {
		this.tieneAbrigo = true;
	}

	public boolean isTieneAbrigo() {
		return tieneAbrigo;
	}

	public void setTieneAbrigo(boolean tieneAbrigo) {
		this.tieneAbrigo = tieneAbrigo;
	}
	
	public void DejarAbrigo(Ropero ropero) throws Exception{
		try {
			Thread.sleep(5000);
			if(isTieneAbrigo() == true){
				ropero.LlenarInventario();
				setTieneAbrigo(false);
			}else{
				throw new Exception("No has podido dejar el abrigo");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void RecogerAbrigo(Ropero ropero) throws Exception{
		try {
			Thread.sleep(5000);
			if(isTieneAbrigo() == false){
				ropero.VaciarInventario();
				setTieneAbrigo(true);
			}else{
				throw new Exception("No has podido recoger el abrigo, Ya tienes uno......");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
