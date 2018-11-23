import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {

	public static PlanElectrico leer(String archivo) throws FileNotFoundException {
		
		File file = new File(archivo);
		Scanner scanner = new Scanner(file);
		
		PlanElectrico planElectrico = new PlanElectrico(scanner.nextInt(), scanner.nextInt());
		for (int i = 0; i < planElectrico.getCantidadCiudadesElectricas(); i++) {
			planElectrico.addCiudadElectrica(scanner.nextInt()-1);
		}
		
		MatrizSimetrica matriz = new MatrizSimetrica(planElectrico.getCantidadCiudades());
		for (int i = 0; i < planElectrico.getCantidadCiudades(); i++) {
			for (int j = 0; j < planElectrico.getCantidadCiudades(); j++) {
				matriz.setCosto(i, j, scanner.nextInt());
			}
		}
		planElectrico.setMatriz(matriz);
		
		scanner.close();
		return planElectrico;
	}
	
	public static void escribir(String archivo, int resultado) throws IOException {
		
		PrintWriter pw = new PrintWriter(new FileWriter(archivo));

		pw.println(resultado);
		pw.close();
	}
}
