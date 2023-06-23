package py.edu.ucsa.labvideojuego.clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManejadordePersonajes {

	private List<Personaje> personajes;

	public List<Personaje> getPersonajes() {
		if (personajes == null) {
			personajes = new ArrayList<>();
		}

		return personajes;
	}

	public void generarPersonajes() {
		try {
			FileReader reader = new FileReader("C:\\Users\\mariam\\Desktop\\java\\labvideojuego\\FRACCIONES.txt");
			BufferedReader bufReader = new BufferedReader(reader);
			String line = null;
			line = bufReader.readLine();
			while (line != null) {
				FileReader readerRaza = new FileReader(
						"C:\\Users\\mariam\\Desktop\\java\\labvideojuego\\RAZAS_" + line.toUpperCase() + ".txt");
				BufferedReader bufReaderRaza = new BufferedReader(readerRaza);
				String r = null;
				r = bufReaderRaza.readLine();
				int indice = 0;
				while (r != null) {
					indice++;
					Personaje personaje = new Personaje();
					personaje.setId(indice);
					personaje.setRaza(r);
					personaje.setFraccion(line);
					System.out.println(personaje.toString());
					this.getPersonajes().add(personaje);
					r = bufReaderRaza.readLine();

				}
				line = bufReader.readLine();
				readerRaza.close();
				bufReaderRaza.close(); 
			}

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
			e.printStackTrace();
		}

	}

	public void escribirArchivosPersonajes() {

		try {
			this.getPersonajes().forEach((x) -> x.escribirArchivo());

		} catch (Exception e) {
			System.out.println("No se encontro el archivo");
			System.out.println(e.getMessage());
		}

	}

}
