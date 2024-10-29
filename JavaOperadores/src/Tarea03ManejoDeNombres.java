import java.util.Scanner;

/**
 * La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
 * Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
 * Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
 * Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
 * Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
 * N.es_A.ia_E.pe
 */
public class Tarea03ManejoDeNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el integrante UNO: ");
        String integrante1 = scanner.next();
        System.out.println("Ingrese el integrante DOS: ");
        String integrante2 = scanner.next();
        System.out.println("Ingrese el integrante TRES: ");
        String integrante3 = scanner.next();

        String nombre;
        String salida;

        nombre = integrante1;
        salida = nombre.substring(1,2).toUpperCase().concat(".")+nombre.substring(nombre.length()-2).concat("_");

        nombre = integrante2;
        salida  += nombre.substring(1,2).toUpperCase().concat(".")+nombre.substring(nombre.length()-2).concat("_");

        nombre = integrante3;
        salida  += nombre.substring(1,2).toUpperCase().concat(".")+nombre.substring(nombre.length()-2);

        System.out.println();
        System.out.println(salida);

    }
    
    private static String getNombreTransformado(String nombre) {
/*
        String salida = getNombreTransformado(integrante1).concat("_")
                .concat(getNombreTransformado(integrante2)).concat("_")
                .concat(getNombreTransformado(integrante3));
*/
        return nombre.substring(1,2).toUpperCase().concat(".")+nombre.substring(nombre.length()-2);
    }
    
}
