/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Portafolio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// cantidad de empleados
        String Nempleados = JOptionPane.showInputDialog("Ingrese la cantidad de empleados:");
        int cantidadEmpleados = Integer.parseInt(Nempleados);

        // totales
        double montoTotalSEM = 0;
        double montoTotalIVM = 0;

// calcular salarios
        for (int i = 1; i <=cantidadEmpleados; i++) {
            String salarioEmpleado = JOptionPane.showInputDialog("Ingrese el salario del empleado " + i + ":");
            double salario = Double.parseDouble(salarioEmpleado);

            double montoSEM = salario * 9.25;
            double montoIVM = salario * 5.08;

            montoTotalSEM += montoSEM;
            montoTotalIVM += montoIVM;
        }

// total
        double montoTotal = montoTotalSEM + montoTotalIVM;

//resultado
        String resultado = "La empresa deberá pagar a la CCSS un total de " + montoTotal;
        JOptionPane.showMessageDialog(null,resultado);
        }
    }

