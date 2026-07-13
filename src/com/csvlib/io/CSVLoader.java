package com.csvlib.io;
import com.csvlib.core.DataTable;
import java.io.*;
import java.util.Arrays;

public class CSVLoader {
    public static DataTable load(String filePath) throws IOException {
        DataTable table = new DataTable();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                table.addRow(Arrays.asList(line.split(",")));
            }
        }
        return table;
    }
}