
/**
 * En Java, los operadores de asignación permiten asignar valores a las variables y, en algunos casos,
 * realizar operaciones en el mismo paso:
 *
 * Asignación simple (=): Asigna directamente un valor a una variable.
 * Asignación con suma (+=): Suma el valor al actual de la variable y luego asigna el resultado.
 * Asignación con resta (-=): Resta el valor al actual de la variable y luego asigna el resultado.
 * Asignación con multiplicación (*=): Multiplica el valor por el actual de la variable y luego asigna el resultado.
 * Asignación con división (/=): Divide el valor entre el actual de la variable y luego asigna el
 *
 */
public class OperadoresAsignacion {

    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        i += 2; // i = i + 2 ; i = 7
        System.out.println("i+=2 -> " + i);

        i += 5; // i = i + 5 ; i = 12
        System.out.println("i+=5 -> " + i);

        j -= 4; // j=j-4 ; j = 9-4= 5
        System.out.println("j-=4 -> " + j);

        j *= 4; // j=j*4 ; j = 5*4= 20
        System.out.println("j*=4 -> " + j);
        
        String sqlString = "select * from tabla t";
        sqlString += " where t.id = ";
        sqlString += j;
        System.out.println("sqlString = " + sqlString);
    }
}
