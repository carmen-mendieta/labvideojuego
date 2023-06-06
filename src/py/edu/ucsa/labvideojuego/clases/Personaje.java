package py.edu.ucsa.labvideojuego.clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import py.edu.ucsa.interfaces.Escribible;

public class Personaje implements Escribible {
	private int id;
	private String fraccion;
	private String raza;

	public Personaje() {

	}

	public Personaje(int id, String fraccion, String raza) {
		super();
		this.id = id;
		this.fraccion = fraccion;
		this.raza = raza;
	}

	@Override
	public void escribirArchivo() {
		String nombreArchivo = this.fraccion + "_" + this.raza;
		String contenido = this.toString();
		try {
			FileWriter writer = new FileWriter(
					"C:\\Users\\mariam\\Desktop\\java\\labvideojuego\\" + nombreArchivo + ".txt");
			BufferedWriter bufWriter = new BufferedWriter(writer);
			bufWriter.write(contenido);
			bufWriter.close();
		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
			System.out.println(e.getMessage());
		}

	}

	@Override
	public String toString() {
		return "Personaje [id=" + id + ", fraccion=" + fraccion + ", raza=" + raza + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFraccion() {
		return fraccion;
	}

	public void setFraccion(String fraccion) {
		this.fraccion = fraccion;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}
