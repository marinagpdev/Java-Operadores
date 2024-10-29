/**
 * El operador ternario en Java es una forma concisa de realizar una operación condicional.
 * Se utiliza para evaluar una expresión booleana y devuelve uno de dos valores, dependiendo del resultado de la evaluación.
 * Este operador es una alternativa a la estructura if-else y se compone de tres partes, de ahí su nombre "ternario".
 * Sintaxis
 * condición ? valorSiVerdadero : valorSiFalso;
 */

public class OperadorTernario {
    public static void main(String[] args) {
        // variable = (condicion) ? si_es verdadero : si_es falso;
        String variable = (true) ? "VERDADERO" : "FALSO";
        System.out.println("(true) ? \"VERDADERO\" : \"FALSO\"; = " + ((true) ? "VERDADERO" : "FALSO"));
        System.out.println("(2>3) ? \"VERDADERO\" : \"FALSO\"; = " + ((2>3) ? "VERDADERO" : "FALSO"));

        /* Ejemplo de calculo de promedio utilizando operador ternario

        double notaMate = 0.0;
        double notaCiencia = 0.0;
        double notaHistoria = 0.0;
        double promedio = 0.0;
        String estado;


        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese nota de matematicas entre 2.0 y 7.0");
        notaMate = s.nextDouble();
        System.out.println("Ingrese nota de ciencias entre 2.0 y 7.0");
        notaCiencia = s.nextDouble();
        System.out.println("Ingrese nota de historia entre 2.0 y 7.0");
        notaHistoria = s.nextDouble();

        promedio = (notaMate+notaCiencia+notaHistoria) / 3;
        System.out.println("promedio = " + promedio);

        estado = (promedio>=5.49 ? "Aprobado" : "Desaprobado");

        System.out.println("Resultado: " + estado);
        */
    }
}
