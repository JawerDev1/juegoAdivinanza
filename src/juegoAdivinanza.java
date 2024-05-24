import java.util.HashSet;
import java.util.Scanner;

public class juegoAdivinanza {
    private HashSet<String> palabras = new HashSet<>();
    private int contador = 0;

    public juegoAdivinanza(HashSet<String> palabras){
        for (String palabra : palabras){
            this.palabras.add(palabra.toLowerCase());
        }
    }

    public void jugar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego de adivinanza de palabras!");

        //Si la lista no esta vacia ingresa al loop
        while (!palabras.isEmpty()){
            System.out.println("Ingresa una palabra: ");
            String palabra = sc.nextLine().toLowerCase();
            if (palabras.contains(palabra)){
                palabras.remove(palabra);
                contador++;
                System.out.println("Correcto ! Llevas " + contador + " palabra(s)    adivinadas.");
            }else {
                System.out.println("Incorrecto. Intenta de nuevo.");
            }
        }
        System.out.println("Felicidades! Adivinaste todas las palabras.");
    }
}
