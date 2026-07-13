package com.csvlib.processor;
import com.csvlib.core.DataTable;

public interface ICSVProcessor {
    void execute(DataTable table);
}