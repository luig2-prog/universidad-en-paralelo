/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadvecparalelo;

import java.util.Scanner;

/**
 *
 * @author jose9
 */
public class ActividadVecParalelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        String[] nombres = new String[10];
        float[] notas = new float[10];
        float nt;
        float min = 3;
        String nom = "";
        
        System.out.println("POR FAVOR INGRESAR NOMBRES Y NOTAS");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre del estudiante: ");
            nombres[i] = lec.next();
            System.out.println("Ingrese la nota del estudiante: ");
            notas[i] = lec.nextFloat();
        }
        System.out.println("--------------------------------");
        System.out.println("LOS MEJORES SON");
        System.out.println("--------------------------------");
            String mensaje = "";
           for (int i = 0; i < nombres.length; i++) {
                if (notas[i] >= min) {
                    nt = notas[i];
                    nom = nombres[i];
                    mensaje += nt + " Nombre: " + nom + "\n";
                }
            }
           
           System.out.println(mensaje);
        }
    }

