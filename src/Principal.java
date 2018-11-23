import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		PlanElectrico planElectrico = Archivo.leer("archivos/consigna.in");
		
		Archivo.escribir("archivo/consiga.out", planElectrico.resolver());
	}
}
