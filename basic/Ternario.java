package basic;

import java.util.*;

public class Ternario {

    public static void main(String[] args) {

        /*
         * ¿Qué es?
         * 
         * El operador ternario es una forma de escribir la estrucura if-else de manera
         * simplificada.
         * 
         * Es útil cuando el contenido de ambos bloques es una sola linea y no es
         * extenso, permitiendonos ahorrar lineas de codigo.
         * 
         * Sintaxis: 
         * 
         * (CondicionEvaluar) ? CasoExitoso : CasoNoExitoso;
         *
         */

        Scanner ed = new Scanner(System.in);

        System.out.println("");
        System.out.println("--Operador Ternario--");
        System.out.println("");
        System.out.println("----Numero mayor a 10----");
        System.out.println("");

        System.out.println("Ingrese un numero: ");
        int n = ed.nextInt();

        String r = (n >= 10) ? "Es mayor a 10 o igual " : "Es menor a 10 ";

        System.out.println(r);

        ed.close();
    }

}
