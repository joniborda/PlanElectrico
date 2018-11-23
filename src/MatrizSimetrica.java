
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
		if (fila < columna) {
			return this.matriz[fila][columna];
		}
		
		return this.matriz[columna][fila];
	}
}
