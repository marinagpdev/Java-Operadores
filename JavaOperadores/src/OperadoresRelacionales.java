/**
 * En Java, los operadores relacionales comparan dos valores y devuelven un resultado booleano (true o false). Son clave en expresiones condicionales y estructuras de control.
 *
 * Operadores Relacionales en Java
 * Mayor que (>): Verifica si el primer valor es mayor que el segundo.
 * Menor que (<): Verifica si el primer valor es menor que el segundo.
 * Mayor o igual que (>=): Verifica si el primer valor es mayor o igual al segundo.
 * Menor o igual que (<=): Verifica si el primer valor es menor o igual al segundo.
 * Igual a (==): Verifica si ambos valores son iguales.
 * Distinto de (!=): Verifica si ambos valores son diferentes.
 *
 * Estos operadores devuelven true o false dependiendo del resultado de la comparación entre los valores.
 */
public class OperadoresRelacionales {

    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 123e-7f;
        double l = 2.1423e3;
        boolean m = false;

        boolean b1 = i == j ; // igual a
        System.out.println("Igual a -> boolean b1 = 3 == 7 ; " + b1);

        System.out.println("Invierte el valor -> !b1 = " + !b1); // Invierte el valor de false a true

        boolean b3 = i!=j; //<>
        System.out.println("Es distinto i y j? -> 3!=7 = " + b3); // Es distinto i y j? true

        boolean b4 = true;
        System.out.println("b4 = " + b4);
        System.out.println("(b4==true) = " + (b4==true));
        System.out.println("(b4!=true) = " + (b4!=true));

        System.out.println("i = " + i + "; j= " + j);
        
        System.out.println("i>j = " + (i>j));
        System.out.println("i<j = " + (i<j));

        System.out.println("l = " + l + "; k= " + k);

        System.out.println("(l>=k) = " + (l>=k));
        System.out.println("(l<=k) = " + (l<=k));
        
    }
    

}
