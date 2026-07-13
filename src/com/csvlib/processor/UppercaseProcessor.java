package com.csvlib.processor;
import com.csvlib.core.DataTable;


public class UppercaseProcessor implements ICSVProcessor {
    @Override
    public void execute(DataTable table) {
        // Recorremos los datos y convertimos todo a mayúsculas
        for (java.util.List<String> row : table.getData()) {
            for (int i = 0; i < row.size(); i++) {
                row.set(i, row.get(i).toUpperCase());
            }
        }
    }
}
