
public class Nodo {

	private int ciudad;
	private boolean electrica;
	
	public Nodo(int ciudad, boolean electrica) {
		super();
		this.ciudad = ciudad;
		this.electrica = electrica;
	}

	public int getCiudad() {
		return ciudad;
	}

	public void setCiudad(int ciudad) {
		this.ciudad = ciudad;
	}

	public boolean isElectrica() {
		return electrica;
	}

	public void setElectrica(boolean electrica) {
		this.electrica = electrica;
	}
}
