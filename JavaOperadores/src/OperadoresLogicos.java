/**
 * En Java, los operadores lógicos permiten realizar operaciones de lógica booleana,
 * evaluando expresiones que resultan en valores true o false.
 * Son especialmente útiles en estructuras de control como if, while y for.
 *
 * AND lógico (&&): Evalúa dos expresiones y devuelve true solo si ambas son true.
 * Realiza una evaluación de corto circuito, es decir, si la primera expresión es false, no evalúa la segunda.
 *
 * OR lógico (||): Evalúa dos expresiones y devuelve true si al menos una de ellas es true.
 * También realiza una evaluación de corto circuito, de modo que si la primera expresión es true, no evalúa la segunda.
 */
public class OperadoresLogicos {


    public static void main(String[] args) {
        // AND: operador &&
        // si todas se cumplen es TRUE
        // Si la primera no se cumple, entonces ya no se continua evaluando

        System.out.println("(true && (1==2)) = " + (true && (1==2))); // FALSE

        // OR: operador ||
        // Si al menos una se cumple es TRUE

        System.out.println("((4>3) || false) = " + ((4>3) || false)); // TRUE


        // Se evaluan los operadores de izquierda a derecha.
        // Pero depende tambien del operador, && (and) tiene mas precedencia que || (or))
        // Se puede poner () para cambiar el orden y para que quede mas claro en la lectura del codigo.
        System.out.println("(1==1 && 3>1 || 2==1) = " + (1==1 && 3>1 || 2==1));
        

    }
}
