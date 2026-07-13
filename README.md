# CSVLib: Librería de Procesamiento de Datos Modular

CSVLib es una librería Java diseñada bajo principios **SOLID** y el patrón de diseño **Strategy**, permitiendo el procesamiento de archivos CSV de forma flexible, modular y extensible.

## Características
- **Arquitectura Limpia:** Separación estricta de responsabilidades entre carga, almacenamiento y lógica de procesamiento.
- **Extensible:** Capacidad de añadir nuevas funcionalidades (filtros, transformaciones, exportaciones) sin necesidad de modificar el código fuente del núcleo (`Open/Closed Principle`).
- **Manipulación Dinámica:** Soporte para agregar/eliminar filas y columnas en tiempo de ejecución.
- **Basada en SOLID:** Implementación rigurosa de los cinco principios para garantizar mantenibilidad y escalabilidad.

## Estructura del Proyecto
- `com.csvlib.core`: Contiene `DataTable`, el núcleo que gestiona la estructura de datos en memoria.
- `com.csvlib.io`: Contiene `CSVLoader`, encargado de la lectura y carga de archivos CSV.
- `com.csvlib.processor`: Contiene `ICSVProcessor`, la interfaz que permite inyectar lógica de negocio personalizada.

## Cómo ejecutar
Para compilar y ejecutar el proyecto desde la terminal (estando en la raíz del proyecto):

1. **Compilar:**
   ```bash
   javac src/Main.java src/com/csvlib/core/*.java src/com/csvlib/io/*.java src/com/csvlib/processor/*.java



## Cómo extender las capacidades
Para añadir nuevas funcionalidades (por ejemplo, un procesador que convierta datos a mayúsculas) sin modificar `DataTable`:

1. Crea una nueva clase que implemente `ICSVProcessor`:
   ```java
   public class UppercaseProcessor implements ICSVProcessor {
       public void execute(DataTable table) {
           // Lógica para transformar datos a mayúsculas
       }
   }
