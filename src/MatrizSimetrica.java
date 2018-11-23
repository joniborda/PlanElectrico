
public class MatrizSimetrica {

	private int[][] matriz;
	private int cantidadNodos;

	public MatrizSimetrica(int cantidadNodos) {
		this.cantidadNodos = cantidadNodos;
		
		this.matriz = new int[cantidadNodos][];
		for (int i = 0; i < cantidadNodos; i++) {
			this.matriz[i] = new int[i];
		}
	}
	
	public int getCosto(int fila, int columna) {
		if (fila == columna) {
			return 0;
		}
		if (fila < columna) {
			return this.matriz[fila][columna];
		}
		
		return this.matriz[columna][fila];
	}
	
	public void setCosto(int fila, int columna, int costo) {
		if (fila == columna) {
			return;
		}
		System.out.println(fila + " " + columna);
		if (fila > columna) {	
			System.out.println(fila + " " + columna);

			this.matriz[fila][columna] = costo;
		}
		this.matriz[columna][fila] = costo;
	}
}
