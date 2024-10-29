import javax.swing.*;

/**
 * Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
 * Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
 * Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
 * Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.
 * Restricción no usar loops en el desarrollo de la tarea.
 *
 * Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
 */
public class Tarea06NombreMasLargo {
    public static void main(String[] args) {

        String[] nombresflia = new String[3];

        nombresflia[0] = JOptionPane.showInputDialog(null, "Ingrese nombre y apellido del primer miembro de la familia: ");
        nombresflia[1] = JOptionPane.showInputDialog(null, "Ingrese nombre y apellido del segundo miembro de la familia: ");
        nombresflia[2] = JOptionPane.showInputDialog(null, "Ingrese nombre y apellido del tercer miembro de la familia: ");

        String[] nombreApellido; // array para split del nombre y apellido ingresado
        Integer[] longitudNombres = new Integer[3]; // array de la longitud de cada nombre

        for (int j = 0; j < nombresflia.length; j++) {
            nombreApellido = nombresflia[j].split(" ");
            longitudNombres[j] = nombreApellido[0].length();
        }

        int indiceNombreMasLargo =  0;

        indiceNombreMasLargo = ( longitudNombres[0] >  longitudNombres[1] ) ? 0 : 1;
        indiceNombreMasLargo = ( longitudNombres[2] > longitudNombres[indiceNombreMasLargo] ) ? 2 : indiceNombreMasLargo;

        System.out.println(nombresflia[indiceNombreMasLargo] + " tiene el nombre mas largo.");

    }
}
