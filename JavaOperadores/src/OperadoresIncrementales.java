/**
 * Los operadores incrementales se utilizan para aumentar o disminuir el valor de una variable en una unidad.
 * Estos operadores simplifican el código, especialmente en estructuras de control como bucles.
 *
 * Tipos de Operadores Incrementales en Java
 * Incremento (++): Aumenta el valor de la variable en 1.
 * Decremento (--): Disminuye el valor de la variable en 1.
 * Formas de Uso
 * Forma prefija (++variable o --variable): Primero incrementa o decrementa el valor y luego devuelve el resultado.
 * * Forma postfija (variable++ o variable--): Primero devuelve el valor actual de la variable y luego incrementa o decrementa el valor.
 *
 * Ejemplo
 * Estos operadores son útiles para simplificar expresiones, como en los bucles for, y en operaciones donde se requiere un aumento o disminución continuo.
 */
public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre-Incremento
        int i = 1;
        int j = ++i; // i=i+1 ; Se incrementa y luego se asigna a j
        System.out.println("i = 1");
        System.out.println("Preincremento: j = ++i -> " + j);

        // Post-Incremento
        i = 2;
        j = i++; // j = i y luego incrementa i en 1; j = 2 / i = 3;
        System.out.println("i = 2");
        System.out.println("Post-Incremento: j = i++ -> " + j);

        // Pre-Decremento
        i = 3;
        j = --i; // i=i-1 ; Se decrementa y luego se asigna a j ; Los dos valen 2
        System.out.println("i = " + 3);
        System.out.println("Pre-Decremento: j = --i -> " + j);

        // Post-Decremento
        i = 4;
        j = i--; // Se asigna el valor de i a j y luego se decrementa i=i-1 ; i=3/ j=4
        System.out.println("i = " + 4);
        System.out.println("Post-Decremento: j = i-- ->" + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("El valor de j es 6, pero se imprime antes de incrementar (j++) = " + (j++)); // El valor de j es 6, pero se imprime antes de incrementar
        System.out.println("j = " + j);
    }
}
