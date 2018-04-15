package com.company;

import com.company.InterfacesFuncionales.NumericTest;

public class Main {

    public static void main(String[] args) {

        //Esta expresion determina si un numero es factorial de otro

        // Primero hacemos referncia a la interfaz con una variable por el polimorfismo.
        NumericTest isFactorial;
        // Creamos la lambda que define el patron si un numero da exacto al dividirlo entre el otro devuelve true
        // Si es distinto devuelve false.
        isFactorial = ((n, d) -> (n % d ) == 0);
        // Creamos las condiciones.
        if(isFactorial.test(5,2)){
            System.out.println("Es factorial");
        }else{
            System.out.println("No es factorial");
        }
        // Creamos la condicion para el caso contrario.
        if(!isFactorial.test(10,2)){
            System.out.println("No es factorial");
        }
        // ESta expresión devuelve si es mayor o menor.
        NumericTest comparacion;
        comparacion = (n,d) -> (n < d );
        if (comparacion.test(5, 10)){
            System.out.println(" a es menor que b");
        }else{
            System.out.println( "b es mayor que a ");
        }
        //Devuelve si el los valores son absolutos son iguales.

        NumericTest absoluto;
        absoluto = (n, d) -> (n < 0 ? -n : n ) == (d < 0 ? -d : d);
        if (absoluto.test(-4, 4)){
            System.out.println("El absoluto de los dos numeros es igual.");
        }else{
            System.out.println(" Los numeros introducidos no son iguales.");
        }
    }
}
