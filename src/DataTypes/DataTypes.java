package DataTypes;

public class DataTypes {
    public static void main(String[] args) {
        //Tipos de datos en java
        //Enteros (su valor por default es 0)
        byte tipoByte = 127; // Valor maximo positivo es 127 - negativo es
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000; // Valor maximo positivo es 32000 - negativo es
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647; // Almacena hasta 32 Bytes
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321; // Almacena hasta 64 Bytes
        System.out.println("tipoLong = " + tipoLong);

        //Punto flotante (su valor por default es 0.0)
        float tipoFloat = 3.14F; // Se usa F en la literal para indicar que es tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.151216; // Almacena hasta 64 Bytes en punto flotante
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracter (su valor por el default es '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);


        //Booleano (su valor por default es false)
        boolean tipoBoolean = true; // Este tipo solo almacena true y false
        System.out.println("tipoBoolean = " + tipoBoolean);
    }
}
