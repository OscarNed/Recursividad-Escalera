package recursividad.escalera;
import java.util.Scanner;

/**
 * @author OscarNedzelsky A00513376
 */
public class RecursividadEscalera {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuántos escalones tiene la escalera que desea bajar?"); //Pide al usuario que teclee el número de escalones de la escalera.
        int escalones = scan.nextInt();
        Escalera.descenso(escalones); //Inicia el método recursivo.
    }
    
}
