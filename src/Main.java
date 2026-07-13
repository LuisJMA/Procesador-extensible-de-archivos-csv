import com.csvlib.core.DataTable;
import com.csvlib.io.CSVLoader;
import com.csvlib.processor.ICSVProcessor;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. Cargar el archivo
            DataTable tabla = CSVLoader.load("datos.csv");
            System.out.println("Archivo cargado exitosamente.");

            // 2. Uso básico: Imprimir
            tabla.printTable();

            // 3. EXPANSIÓN: Creamos una funcionalidad nueva SIN TOCAR la librería
            // Definimos un procesador que pone una columna en mayúsculas (ejemplo)
            ICSVProcessor procesadorMayusculas = new ICSVProcessor() {
                @Override
                public void execute(DataTable table) {
                    System.out.println("\n--- Ejecutando procesador personalizado ---");
                    // Aquí el usuario pone su lógica propia
                }
            };

            // Aplicamos la extensión
            tabla.apply(procesadorMayusculas);

        } catch (IOException e) {
            System.err.println("Error al cargar el archivo: " + e.getMessage());
        }
    }
}