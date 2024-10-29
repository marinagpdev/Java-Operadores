import java.util.Scanner;

/**
 * El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
 * Utilizar operador ternario.
 */
public class Tarea04OrdenarNumeros {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double num1 = s.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double num2 = s.nextDouble();

        double mayor;
        double menor;

        mayor = (num1 > num2) ? num1 : num2;
        menor = (num1 < num2) ? num1 : num2;


        System.out.println("Los numeros ingresados de mayor a menor son: \n" + mayor + "\n" + menor);

    }
}
