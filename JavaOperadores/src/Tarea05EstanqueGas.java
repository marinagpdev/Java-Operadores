import java.util.Scanner;

/**
 * Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
 *
 * La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.
 *
 * Si la capacidad actual es 70 litros: imprimir Estanque lleno
 * Si está entre 60 y menor a 70: imprimir Estanque casi lleno
 * Si está entre 40 y menor a 60: imprimir Estanque  3/4
 * Si está entre 35 y menor a 40: imprimir Medio Estanque
 * Si está entre 20 y menor a 35: imprimir Suficiente
 * Si está entre 1 y menor a 20: imprimir Insuficiente
 */
public class Tarea05EstanqueGas {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double capacidad = 0.0;
        String mensaje = "";

        System.out.println("Ingrese la medidad actual del estanque en litros: ");
        capacidad = s.nextDouble();

        if (capacidad > 70) {
            mensaje = "Error. La capacidad maxima del estanque es 70 litros. Vuelva a medir." ;
        } else if (capacidad == 70) {
            mensaje = "Estanque lleno";
        } else if (capacidad>=60 && capacidad<70) {
            mensaje = "Estanque casi lleno";
        } else if (capacidad>=40 && capacidad<60) {
            mensaje = "Estanque 3/4";
        } else if (capacidad>=35 && capacidad<40) {
            mensaje = "Medio Estanque";
        } else if (capacidad>=20 && capacidad<35) {
            mensaje = "Suficiente";
        } else if (capacidad>=1 && capacidad<20) {
            mensaje = "Insuficiente";
        }

        System.out.println(mensaje);

    }
}
