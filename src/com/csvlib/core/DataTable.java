package com.csvlib.core;
import com.csvlib.processor.ICSVProcessor;
import java.util.ArrayList;
import java.util.List;

public class DataTable {
    private List<List<String>> data = new ArrayList<>();

    public void addRow(List<String> row) { data.add(row); }

    public void removeRow(int index) {
        if (index >= 0 && index < data.size()) {
            data.remove(index);
        }
    }
    
    // Método para imprimir, solicitado en tus requisitos
    public void printTable() {
        for (List<String> row : data) {
            System.out.println(String.join(" | ", row));
        }
    }

    public void apply(ICSVProcessor processor) {
        processor.execute(this);
    }
    
    public List<List<String>> getData() { return data; }


    public void addColumn(String value) {
            for (List<String> row : data) {
                row.add(value);
            }
        }
    public void removeColumn(int index) {
    for(List<String> row : data) {
        if(index >= 0 && index < row.size()) row.remove(index);
    }
    }

    
}