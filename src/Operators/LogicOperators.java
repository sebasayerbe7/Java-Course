package Operators;

public class LogicOperators {
    public static void main(String[] args) {
        boolean a = true, b = false;

        // Opedaror logico AND (regresa true si ambos valores son true)
        var resultado = a && b;
        System.out.println("resultado = " + resultado);

        // Operador logico OR (regresa true si cualquiera de los valores es true)
        resultado =  a || b;
        System.out.println("resultado = " + resultado);


        // Operador logico NOT ! (invierte el valor logico)
        resultado = !a;
        System.out.println("resultado = " + resultado);


    }
}
