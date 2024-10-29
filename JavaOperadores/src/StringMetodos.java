
public class StringMetodos {

    public static void main(String[] args) {

        String palabra = "Palabra";
        System.out.println("palabra = " + palabra);
        System.out.println("Metodos:");
        System.out.println("palabra.length()=" + palabra.length());
        System.out.println("palabra.toUpperCase() = " + palabra.toUpperCase());
        System.out.println("palabra.toLowerCase() = " + palabra.toLowerCase());
        System.out.println("palabra.equals(\"Palabra\") = " + palabra.equals("Palabra"));
        System.out.println("palabra.equals(\"palabra\") = " + palabra.equals("palabra"));
        System.out.println("palabra.equalsIgnoreCase(\"palabra\") = " + palabra.equalsIgnoreCase("palabra"));
        System.out.println("palabra.compareTo(\"Palabra\") = " + palabra.compareTo("Palabra")); // es igual a equals
        System.out.println("palabra.compareTo(\"Papaya\") = " + palabra.compareTo("Papaya"));
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println("palabra.charAt("+i+") = " + palabra.charAt(i));    
        }
        System.out.println("palabra.substring(4) = " + palabra.substring(4));
        System.out.println("palabra.substring(4,6) = " + palabra.substring(4,6));
        
        String otraPalabra = "rompecabezas";

        System.out.println("otraPalabra.replace(\"a\",\"A\") = " + otraPalabra.replace("a","A"));
        System.out.println("otraPalabra.indexOf('e') = " + otraPalabra.indexOf('e'));
        System.out.println("otraPalabra.lastIndexOf('e') = " + otraPalabra.lastIndexOf('e'));
        System.out.println("otraPalabra.indexOf('z') = " + otraPalabra.indexOf('x'));
        System.out.println("otraPalabra.contains(\"cabezas\") = " + otraPalabra.contains("cabezas"));
        System.out.println("otraPalabra.startsWith(\"rompe\") = " + otraPalabra.startsWith("rompe"));
        System.out.println("otraPalabra.endsWith(\"ezas\") = " + otraPalabra.endsWith("ezas"));
        System.out.println("\" rompecabezas   \".trim() = " + " rompecabezas   ".trim());
        System.out.println();
        String archivo = "documento.docx";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("Extension: archivo.substring(i+1) = " + archivo.substring(i+1));

        System.out.println();
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char [] arreglo = trabalenguas.toCharArray();
        for (int j = 0; j < arreglo.length; j++) {

            System.out.println("arreglo[j] = " + arreglo[j]);
            
        }
        System.out.println("trabalenguas = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");
        int largo = arreglo2.length;
        for (int j = 0; j < largo; j++) {
            System.out.println(arreglo2[j]);

        }
    }
    
}
