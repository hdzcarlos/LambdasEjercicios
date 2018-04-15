package com.company;

import com.company.InterfacesFuncionales.StringTest;

public class MainString {

    public static void main(String[] args) {

        StringTest stringTest;


        // Vamos a determinar si una cadena contiene a otra con esta lambda
        stringTest = (a,d) -> (a.indexOf(d)) != -1;
        String str = "Esto es una cadaena de caracteres.";

        if(stringTest.test(str,"de")){
            System.out.println("la palabra `de´ esta en la cadena");
        }else{
            System.out.println("La palabra no se encuentra.");
        }if(stringTest.test(str,"caEes")){
            System.out.println("La cadena se encuentra en el String.");
        }else{
            System.out.println("La palabra caEes No se encientra la cadena");
        }

    }
}
