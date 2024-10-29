/**
 * En Java, los operadores unarios realizan operaciones sobre un solo operando.
 * Son útiles para cambiar el valor o el estado de una variable en expresiones y condiciones.
 *
 * Unario positivo (+): Indica que el valor es positivo. Generalmente es implícito y se usa poco.
 * * Unario negativo (-): Cambia el signo del valor, convirtiendo positivo en negativo y viceversa.
 */
public class OperadoresUnarios {
    public static void main(String[] args) {
        // Sirven para invertir el signo. Es como hacer *-1

        int i = -5;
        int j = +i; // j = (1) * i ; j=-5 ; Queda el mismo signo
        System.out.println("j = +i; j = (1) * i ; i=-5 ; Queda el mismo signo -> " + j);

        int k= -i; // k = (-1) * i ; k = 5 ; Invierte signo
        System.out.println("k= -i; k = (-1) * i ; i=-5 ; Invierte signo -> " + k);
    }
}
