# Aplicación de inserción de datos de personajes de videojuego
Esta aplicación Java permite insertar datos de personajes de videojuego en dos grupos o fracciones: Alianza y Horda. Cada fracción se divide en distintas razas, como se detalla a continuación:

## Alianza:
- Los Valientes Humanos, Los Inquebrantables Enanos, Los Místicos Draenei, Los
Ingeniosos Gnomos, Los Espirituales Elfos de la Noche, Los Bestiales Huargen

## Horda:
- Los Orcos Curtidos en la Batalla, Los Astutos Trols, Los
Descomunales Tauren, Los Malditos Renegados, Los Extravagantes Elfos de Sangre, Los ArterosGoblins


 Cada categoría tiene diferentes tipos de razas. Puede escribir los datos de los personajes en archivos y también leer esos archivos para mostrar la información de los personajes.
 
 ### Fracción del código
 
 ```java
  FileReader reader = new FileReader("C:\\Users\\mariam\\Desktop\\java\\labvideojuego\\FRACCIONES.txt");
            BufferedReader bufReader = new BufferedReader(reader);
            String line = null;
            line = bufReader.readLine();
            while (line != null) {
                FileReader readerRaza = new FileReader(
                        "RAZAS_" + line.toUpperCase() + ".txt");
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
                
```
