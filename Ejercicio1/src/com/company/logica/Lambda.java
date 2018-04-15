package com.company.logica;

import com.company.InterfacesFuncionales.StringFunciones;

public class Lambda {

    // Este metodo contiene como aprametro de entrada una interfaz funcional.
    // Se puede referenciar cualquier instancia compatible on ella incluoda con una expresion lambda.
    // El segundo parametro es con el cual se va a operar.
    public String chaneStr (StringFunciones sf, String a){
        return sf.funcion(a);
    }

}
