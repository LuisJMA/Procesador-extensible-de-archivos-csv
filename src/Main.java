import com.csvlib.core.DataTable;
import com.csvlib.io.CSVLoader;
import com.csvlib.processor.UppercaseProcessor; // Importa tu procesador
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            DataTable tabla = CSVLoader.load("datos.csv");
            System.out.println("Archivo cargado:");
            tabla.printTable();

            // Usamos la clase que ya creaste en UppercaseProcessor.java
            System.out.println("\n--- Ejecutando procesador de mayúsculas ---");
            tabla.apply(new UppercaseProcessor());

            tabla.printTable();

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}