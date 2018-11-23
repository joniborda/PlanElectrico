import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		PlanElectrico planElectrico = Archivo.leer("archivos/consigna.in");
		
		Archivo.escribir("archivos/consigna.out", planElectrico.resolver());
	}
}
