/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gaming_console_report;

/**
 *
 * @author Student
 */
public class GAMING_CONSOLE_REPORT {
    public static void main(String[] args) {
    
         // Single-dimensional array for city names
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };

        // Single-dimensional array for console names
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };

        // Two-dimensional array for console sales
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Display the gaming console report
        System.out.println("============================================================");
        System.out.println("                 GAMING CONSOLE REPORT");
        System.out.println("============================================================");

        // Display the table headings
        System.out.printf("%-20s %-12s %-12s %-12s%n",
                "CITY", "PS5", "XBOX", "SWITCH");

        System.out.println("------------------------------------------------------------");

        // Display all city sales
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-12d %-12d %-12d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println("============================================================");
        System.out.println();
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("============================================================");

        int highestSales = 0;
        String cityWithMostSales = "";

        // Calculate total sales for each city
        for (int i = 0; i < cities.length; i++) {

            int total = 0;

            for (int j = 0; j < consoles.length; j++) {
                total += sales[i][j];
            }

            System.out.printf("%-20s %d%n", cities[i], total);

            // Find city with the most sales
            if (total > highestSales) {
                highestSales = total;
                cityWithMostSales = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("============================================================");
    }
}