import java.util.Scanner;

/**
 * Programa Ejemplo Basico de Login que usa operadores logicos
 * Hay tres usuarios definidos de manera estatica:
 * admin/admin123
 * marina/marina123
 * pepito/pepito123
 * Tarea: Ingresar el usuario y password. Validarlos.
 */
public class TareaOperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usuarios = {"admin","marina","pepito"};
        String[] passwords = {"admin123","marina123","pepito123"};

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Ingrese el usuario:");

        String u = scanner.next();

        System.out.println("Ingrese el password:");

        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usuarios.length; i++) {
            if ( u.equals(usuarios[i]) && p.equals(passwords[i]) ) {
                esAutenticado = true;
                break; // Sale del for cuando encuentra el usuario.
            }
        }

        System.out.println((esAutenticado)?"Bienvenido usuario ".concat(u).concat("!"):"Usuario/Password incorrectos!");

    }
}
