import java.util.ArrayList;

public class PlanElectrico {

	private int cantidadCiudades;
	private int cantidadCiudadesElectricas;
	private MatrizSimetrica matriz;
	private ArrayList<Integer> ciudades;
	
	public PlanElectrico(int cantidadCiudades, int cantidadCiudadesElectricas) {
		this.cantidadCiudades = cantidadCiudades;
		this.cantidadCiudadesElectricas = cantidadCiudadesElectricas;
		this.ciudades = new ArrayList<Integer>();
	}

	public int getCantidadCiudadesElectricas() {
		return this.cantidadCiudadesElectricas;
	}

	public void addCiudadElectrica(int ciudad) {
		this.ciudades.add(ciudad);
	}

	public int getCantidadCiudades() {
		return this.cantidadCiudades;
	}

	public void setMatriz(MatrizSimetrica matriz) {
		this.matriz = matriz;
	}
}
