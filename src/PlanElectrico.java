import java.util.ArrayList;

public class PlanElectrico {

	private int cantidadCiudades;
	private int cantidadCiudadesElectricas;
	private MatrizSimetrica matriz;
	private ArrayList<Nodo> ciudades;
	
	public PlanElectrico(int cantidadCiudades, int cantidadCiudadesElectricas) {
		this.cantidadCiudades = cantidadCiudades;
		this.cantidadCiudadesElectricas = cantidadCiudadesElectricas;
		this.ciudades = new ArrayList<Nodo>();
	}

	public int getCantidadCiudadesElectricas() {
		return this.cantidadCiudadesElectricas;
	}

	public void addCiudadElectrica(int ciudad) {
		this.ciudades.add(new Nodo(ciudad, true));
	}

	public int getCantidadCiudades() {
		return this.cantidadCiudades;
	}

	public void setMatriz(MatrizSimetrica matriz) {
		this.matriz = matriz;
	}
	
	public ArrayList<Nodo> getCiudades() {
		return this.ciudades;
	}
	
	public int resolver() {
		return 3;
	}
}
