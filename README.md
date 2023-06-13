# labvideojuego
Esta aplicación Java permite insertar datos de personajes de videojuego en dos grupos o fracciones: Alianza y Horda. Cada fracción se divide en distintas razas, como se detalla a continuación:

Fracciones:
Alianza:
Valientes Humanos
Inquebrantables Enanos
Místicos Draenei
Ingeniosos Gnomos
Espirituales Elfos de la Noche
Bestiales Huargen
Horda:
Orcos Curtidos en la Batalla
Astutos Trols
Descomunales Tauren
Malditos Renegados
Extravagantes Elfos de Sangre
Arteros Goblins
Funcionalidades:
Creación de la interfaz Escribible con el método escribirAArchivo(), encargado de escribir en un archivo.
Creación de la clase Personaje con los atributos id (entero), fraccion (cadena) y raza (cadena), que implementa la interfaz Escribible.
Implementación del método escribirAArchivo() en la clase Personaje, que escribe en un archivo el valor de sus atributos, utilizando el método toString() sobrescrito. El nombre del archivo se forma mediante la concatenación de los atributos fraccion y raza.
Creación de la clase ManejadorDePersonajes con el atributo personajes de tipo List<Personaje>. Esta clase tiene dos métodos:
generarPersonajes(): lee las fracciones desde el archivo "FRACCIONES.txt" y, por cada fracción, lee las razas correspondientes desde archivos específicos ("RAZAS_ALIANZA.txt" o "RAZAS_HORDA.txt"). Crea una instancia de la clase Personaje para cada raza leída, cargando los atributos id, raza y fraccion según la iteración.
escribirArchivosPersonajes(): lee el contenido de la lista de personajes cargada por el método generarPersonajes() y crea un archivo por cada personaje, utilizando el método escribirAArchivo().
Instrucciones de uso:
En el archivo "FRACCIONES.txt", escribir las fracciones (ALIANZA y HORDA) en líneas separadas.
Crear archivos específicos ("RAZAS_ALIANZA.txt" y "RAZAS_HORDA.txt") y enumerar las razas correspondientes a cada fracción en líneas separadas.
Ejecutar el método main(...) en la clase Test.
Se instanciará un objeto de la clase ManejadorDePersonajes y se llamarán a los métodos generarPersonajes() y escribirArchivosPersonajes().
Los personajes se generarán y se guardarán en archivos correspondientes a cada raza y fracción.
