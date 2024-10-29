/**
 * El operador instanceof se utiliza para verificar si un objeto es una instancia de una clase específica o de una de sus subclases.
 * Devuelve un valor booleano (true o false) y es útil para realizar comprobaciones de tipos en tiempo de ejecución.
 * Funcionamiento
 * true: si el objeto pertenece a la clase indicada o a una subclase de esta.
 * false: si el objeto no es una instancia de la clase indicada o es null.
 * Ejemplo de uso
 * instanceof se usa comúnmente en estructuras de control para realizar diferentes acciones según el tipo de objeto.
 */

public class OperadorInstanceOf {

    public static void main(String[] args) {
        String texto = "Objeto de tipo String";
        Integer num = 7;

        System.out.println("texto = " + texto);
        System.out.println("num = " + num);

        //boolean b1 = texto instanceof String;
        System.out.println("(texto instanceof String) = " + (texto instanceof String));
        System.out.println("(texto instanceof Object) = " + (texto instanceof Object));
        //System.out.println("(num instanceof String) = " + (num instanceof String));
        System.out.println("(num instanceof Object) = " + (num instanceof Object));
        System.out.println("(num instanceof Integer) = " + (num instanceof Integer));
        System.out.println("(num instanceof Number) = " + (num instanceof Number));

    }
}
