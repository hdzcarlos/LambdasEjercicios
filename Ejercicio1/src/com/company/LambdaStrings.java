package com.company;

import com.company.InterfacesFuncionales.StringFunciones;
import com.company.logica.Lambda;

public class LambdaStrings {
    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        /**
         * Creamos dos variables una que contenga la cadena que queremos cambiar.
         * 2 Otra que va a recibir la cadena ya modificada.
         */
        String inStr = "Esto es una cadena de Java para modificar.";
        String inStrToLower = "EsTo Es UnA CaDeNa CoN KaMeL KeYss PaRa ProBar.";
        String outStr = "";
        /**
         * Creamos otro ejemplo de lambda de bloque, utilizando un metodo de la clase String.
         * Creamos una expresion lambda con un parametro necesrio para operar.
         * Creamos una variale para almacenar el resultado del bucle que va a recorer la cadena.
         * El bucle por cada vuelta que da reinvierte un caracter.
         * ""¿ Explicar el funcionamiento del bucle , no lo tengo muy claro.?""
         */
        StringFunciones revertir = (String str) ->{
          String resultado = "";
            for(int i = str.length()-1; i>=0; i--){
                resultado += str.charAt(i);
            }
            return resultado;
        };
        outStr = lambda.chaneStr(revertir,inStr);
        System.out.println("La cadena original es: "+inStr+" La cadena reinvertida es : " + outStr);
        /**
         * Vamos a reinvertir los espacios por guiones con el metodo replace de la clase String.
         * Asignamos a la variable auxiliar la invocacion del metodo changeStr.
         * Pasamos por parametros una lambda que contiene a la izquierda del operador lambda un string
         *  A la derecha el cuerpo , en este caso es una unica expresion , que contiene una llamada al metodo replace.
         *  como segundo parametro de changeStr introducimos el string a cambiar.
         */
        outStr = lambda.chaneStr((String str) ->  str.replace(" ", "-"),inStr);
        /**
         * Imprimimos por pantalla el resultado.
         */
        System.out.println(outStr);

        /**
         * Esta vez utilizaremos un cuerpo lambda de tipo bloque para concluir con el programa.
         * Hemos utilizado la expresión lambda invocando al metodo changeStr directamente,
         * hemos cresado una variable auxiliar vacia para almacenar el resultado
         * hemos crado un variable de tipo char para almacenar los caracteres que ibamos a invertir.
         * creamos un bucle que recorrer la cadena y ir sacando cada mayuscula y minuscula para ser reinvertidas.
         * Como segundo parametro pasamos la cadena que queremos reinvertir y almacenar en el string de salida.
         * Podruamos haber asignado la lambda a una variable independiente asi sería mas legible la expresion
         *
         * Quedaría así: StringFunc MayusAMinusculas = (str) -> { El bloque de codigo lambda.}
         * finalizariamos asignando a outStr = lambda.chaneStr(MayusAMinusculas,inStrToLower).
         */
            outStr = lambda.chaneStr((str)->{
              String resultado = "";
              char ch;
              for (int i =0; i < str.length(); i++){
                ch = str.charAt(i);
                if (Character.isUpperCase(ch)){
                    resultado += Character.toLowerCase(ch);
                }else{
                    resultado += Character.toUpperCase(ch);
                }
              }
              return resultado;
            },inStrToLower);
        System.out.println("La cadena reinvertidos las mayusculas y minusculas es: " + outStr);

    }
}
