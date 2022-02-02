package ejercicio_08;

public class Cadena {

    private String cadena;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String cadena, int longitud) {
        this.cadena = cadena;
        this.longitud = longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void mostrarVocales() {
        String[] letras = this.cadena.split("");
        int count = 0;

        for (int i = 0; i < letras.length; i++) {
            if (letras[i].toUpperCase().equals("A") || letras[i].toUpperCase().equals("E") || letras[i].toUpperCase().equals("I") || letras[i].toUpperCase().equals("O") || letras[i].toUpperCase().equals("U")) {
                count++;
            }
        }
        
        /*
        switch (letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    cantidadVocales++;
                    break;
            }

        */
        System.out.println("");
        System.out.printf("La frase ingresada tiene %d vocales \n", count);
    }

    public void invertirFrase() {
        
        String cadenaInvertida = "";
        
        for (int i = this.longitud - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida.concat(cadena.substring(i, i+1));
        }
        
        System.out.println("Frase ingresada: " + cadena);
        System.out.println("Frase invertida: " + cadenaInvertida);
    }

    public void vecesRepetido(String letra) {
        String[] partes = this.cadena.split("");
        int count = 0;

        for (int i = 0; i < partes.length; i++) {
            if (partes[i].equals(letra)) {
                count++;
            }
        }
        System.out.printf("La letra '%s' se encuentra repetida %d veces \n", letra, count);

    }

    public void unirFrases() {
        String[] partes = this.cadena.split(" ");

        for (int i = 0; i < partes.length; i++) {
            System.out.print(partes[i]);
        }
        System.out.println("");
    }
    
    public void reemplazar(String letra){
        String oldString = cadena;
        String newString = oldString.replace("a", letra);
        System.out.println(newString);
    }
    
    public boolean contiene(String letra){
        if(cadena.contains(letra)){
            System.out.println("Verdadero, la letra se encuentra en la frase.");
            return true;
        } else {
            System.out.println("Falso, la letra no se encuentra en la frase.");
            return false;
        }
    }

}
