/**
 * El operador instanceof se utiliza para verificar si un objeto es una instancia de una clase específica o de una de sus subclases.
 * Devuelve un valor booleano (true o false) y es útil para realizar comprobaciones de tipos en tiempo de ejecución.
 * Funcionamiento
 * true: si el objeto pertenece a la clase indicada o a una subclase de esta.
 * false: si el objeto no es una instancia de la clase indicada o es null.
 * Ejemplo de uso
 * instanceof se usa comúnmente en estructuras de control para realizar diferentes acciones según el tipo de objeto.
 */

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Objeto de tipo String";
        Number num = Integer.valueOf("8");
        Boolean b1 = true;
        Number decimal = 32.43f;

        System.out.println("Object texto = " + texto);

        System.out.println("(texto instanceof String) = " + (texto instanceof String));
        System.out.println("(texto instanceof Object) = " + (texto instanceof Object));
        System.out.println("(texto instanceof Integer) = " + (texto instanceof Integer));

        System.out.println("Number num = " + num);

        System.out.println("(num instanceof Object) = " + (num instanceof Object));
        System.out.println("(num instanceof Integer) = " + (num instanceof Integer));
        System.out.println("(num instanceof Long) = " + (num instanceof Long));
        System.out.println("(num instanceof Double) = " + (num instanceof Double));

        System.out.println("Number decimal = 32.43f // " + decimal);

        System.out.println("(decimal instanceof Object) = " + (decimal instanceof Object));
        System.out.println("(decimal instanceof Number) = " + (decimal instanceof Number));
        System.out.println("(decimal instanceof Integer) = " + (decimal instanceof Integer));
        System.out.println("(decimal instanceof Long) = " + (decimal instanceof Long));
        System.out.println("(decimal instanceof Double) = " + (decimal instanceof Double));
        System.out.println("(decimal instanceof Float) = " + (decimal instanceof Float));

    }
}
/*

        String texto = "Objeto de tipo String";
        Integer num = 7;

        //boolean b1 = texto instanceof String;
        System.out.println("(texto instanceof String) = " + (texto instanceof String));
        System.out.println("(texto instanceof Object) = " + (texto instanceof Object));
        //System.out.println("(num instanceof String) = " + (num instanceof String));
        System.out.println("(num instanceof Object) = " + (num instanceof Object));
        System.out.println("(num instanceof Integer) = " + (num instanceof Integer));
        System.out.println("(num instanceof Number) = " + (num instanceof Number));
*/
