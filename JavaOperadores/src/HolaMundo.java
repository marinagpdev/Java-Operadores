import javax.swing.*;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
        System.out.println("name = " + name);
        Scanner scanner = new Scanner(System.in);
        //double numero1 = new scanner()
        System.out.println("Ingrese el nombre: ");
        String name1 = scanner.next();
        String nombreSaludo = name1;
        System.out.println("Hola querido/a: "+nombreSaludo.toUpperCase());
        var num = 15; // asignacion dinamica
        System.out.println(num + 1);
        // num = "15"; // error porque ya le asigno el tipo int
        // System.out.println(num + 1);
    }
}
