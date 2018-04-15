package com.company;

import com.company.InterfacesFuncionales.NumericFunc;

public class LambdaBloque {
    public static void main(String[] args) {

        NumericFunc numer;

        numer = (n) -> {
          int resultado = 1;
          // Obtener el valor absoluto de un numero
            n = n < 0 ? -n : n;

            for(int i = 2; i<= n/i; i++ ) {
                if ((n % i) == 0) {
                    resultado = i;
                    break;
                }
            }

            return  resultado;

        };
        System.out.println(" el factorial mas pequeño de 12 es " + numer.func(12));
        System.out.println(" el factorial mas pequeño de 11 es " + numer.func(11));
        System.out.println(" el factorial mas pequeño de 09 es " + numer.func(9));
        System.out.println(" el factorial mas pequeño de 05 es " + numer.func(5));

    }
}
