import java.util.ArrayList;

public class PlanElectrico {

	private int cantidadCiudades;
	private int cantidadCiudadesElectricas;
	private MatrizSimetrica matriz;
	private Nodo[] ciudades;

	public PlanElectrico(int cantidadCiudades, int cantidadCiudadesElectricas) {
		this.cantidadCiudades = cantidadCiudades;
		this.cantidadCiudadesElectricas = cantidadCiudadesElectricas;
		this.ciudades = new Nodo[cantidadCiudades];
		for (int i = 0; i < this.cantidadCiudades; i++) {
			this.ciudades[i] = new Nodo(i, false);
		}
	}

	public int resolver() {
		int costoTotal = 0;
		int costoMin = 999999;
		for (Nodo n : this.ciudades) {
			if (!n.isElectrica()) {
				for (int i = 0; i < this.cantidadCiudades; i++) {
					if (costoMin > this.matriz.getCosto(n.getCiudad(), i) && this.esElectrico(i)) {
						costoMin = this.matriz.getCosto(n.getCiudad(), i);
					}
				}
				costoTotal += costoMin;
				costoMin = 999999;
			}
		}
		return costoTotal;
	}

	public int getCantidadCiudadesElectricas() {
		return this.cantidadCiudadesElectricas;
	}

	public void addCiudadElectrica(int ciudad) {
		this.ciudades[ciudad] = new Nodo(ciudad, true);
	}
	
	public boolean esElectrico(int numeroDeNodo) {
		return this.ciudades[numeroDeNodo].isElectrica();
	}

	public int getCantidadCiudades() {
		return this.cantidadCiudades;
	}

	public void setMatriz(MatrizSimetrica matriz) {
		this.matriz = matriz;
	}

}
