import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivo {

	public PlanElectrico leer(String archivo) throws FileNotFoundException {
		
		File file = new File(archivo);
		Scanner scanner = new Scanner(file);
		
		PlanElectrico planElectrico = new PlanElectrico(scanner.nextInt(), scanner.nextInt());
		for (int i = 0; i < planElectrico.getCantidadCiudadesElectricas(); i++) {
			planElectrico.addCiudadElectrica(scanner.nextInt());
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
}
