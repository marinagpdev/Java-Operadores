/**
 * La precedencia de operadores se refiere al orden en el que se evalúan los operadores en una expresión.
 * En otras palabras, determina qué operaciones se realizan primero cuando hay múltiples operadores en una expresión.
 * La precedencia es fundamental para entender cómo se interpretan las expresiones y los cálculos.
 * Uso de Paréntesis: Para controlar el orden de evaluación, se pueden usar paréntesis.
 * Los operadores dentro de los paréntesis se evalúan primero, independientemente de su precedencia.
 */
public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i =14;
        int j = 8;
        int k = 20;

        double promedio = (i+j+k) / 3d; // Si no se pone parentesis tiene precedencia la division;

        System.out.println("Segun se usen o no parentesis, el calculo sera diferente. \nPromedio (i+j+k) / 3d = " + promedio);

    }
}
