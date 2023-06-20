package py.edu.ucsa.labvideojuego.clases;

public class TestPersonaje {
	public static void main(String[] args) {
		System.out.println(" ");

		ManejadordePersonajes manejador = new ManejadordePersonajes();
		manejador.generarPersonajes();
		manejador.escribirArchivosPersonajes();

	}

}
