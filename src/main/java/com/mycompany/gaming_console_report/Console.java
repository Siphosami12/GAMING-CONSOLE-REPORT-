/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gaming_console_report;

/**
 *
 * @author Student
 */
public abstract class Console implements IConsole{
      // Variables
    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor
    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Getter for console type
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    // Getter for store
    @Override
    public String getStore() {
        return store;
    }

    // Getter for total sales
    @Override
    public int getTotalSales() {
        return totalSales;
    }

    // Abstract printReport method
    public abstract void printReport();

}
