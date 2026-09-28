/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gaming_console_report;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class RunApplication {
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);

     // Get console type
      System.out.print("Enter console device type: ");
      String consoleType = input.nextLine();

     // Get store name
      System.out.print("Enter store name: ");
      String storeName = input.nextLine();

     // Get total sales
      System.out.print("Enter total amount of sales: ");
      int totalSales = input.nextInt();

      // Create ConsoleSales object
      ConsoleSales consoleSales = new ConsoleSales(
                consoleType,
                storeName,
                totalSales
        );

        // Display report
        System.out.println();
        consoleSales.printReport();

        input.close();
    
    }
}
