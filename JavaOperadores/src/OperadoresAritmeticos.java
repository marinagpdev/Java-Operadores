import javax.swing.*;

/**
 * En Java, los operadores aritméticos basicos son:
 *
 * Suma (+): Realiza la adición de dos valores.
 * Resta (-): Realiza la resta del segundo valor respecto al primero.
 * Multiplicación (*): Multiplica dos valores.
 * División (/): Divide el primer valor por el segundo; puede dar un resultado entero o decimal.
 * Módulo (%): Calcula el residuo de la división entre dos valores.
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i+j;

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j); // Concatena el string con el valor de i, y como es un string concatena el valor de j. Resultado i + j = 54

        System.out.println("i + j = " + (i + j)); // Con los parentesis primero de suma y luego concatena el string. Resultado i + j = 9

        System.out.println("(i - j) = " + (i - j)); // Sin parentesis da error, porque el signo - no es valido para los strings. Lo mismo para * / . Resultado (i - j) = 1

        System.out.println("i * j = " + i * j);  // Primero se realiza la multiplicacion y luego concatena el string. Resultado i * j = 20

        System.out.println("i / j = " + i / j); // como son int, se muestra solo la parte entera. Resultado i / j = 1

        System.out.println("(float) i / j = " + (float) i / j); // Ahora si muestra decimales. Resultado (float) i / j = 1.25

        System.out.println("i % j = " + i % j); // % para obtener el resto. Resultado i % j = 1
        System.out.println("8 % 5 = " + 8 % 5); // Resultado 8 % 5 = 3 (resto de 8/5 es 3)

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para saber si es par o impar"));

        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }
}
