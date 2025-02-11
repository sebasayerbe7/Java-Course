package Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // Operadores Unarios - permiten realizan acciones sobre un solo operando. Incluye incremento/decremento
        int a = 3, b = -2, resultado;
        var c  = true;
        // Operador Unico +
        resultado = +a;
        System.out.println("resultado +a =" + resultado);
        // Operador Unico -
        resultado = -a;
        System.out.println("resultado -a =" + resultado);

        // Operadores Unirios Incremento/Decremento
        // Pre-incremento
        a = 3;
        resultado = ++a; // Primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento =" + a);
        // post-incremento
        a = 3;
        resultado = a++; // primero se usa el valor y despues se incrementa
        System.out.println("resultado a++ =" + resultado);
        System.out.println("a en este momento se incrementa =" + a);

        // Pre-decremento
        b = 2;
        resultado = --b; // Primero se incrementa y despues se usa el valor
        System.out.println("resultado --b =" + resultado);
        System.out.println("b ya se decremento =" + b);
        // Post-Decremento
        b = 2;
        resultado = b--; // Primero se usa el valor y despues se incrementa
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento se decrementa =" + b);
    }
}
