package recursividad.escalera;

/**
 * @author OscarNedzelsky A00513376
 */
public class Escalera {
    public static void descenso(int e){
        if (e == 0) { //Caso base: si el contador llega a 0 es que el usuario ya llegó al último escalón.
            System.out.println("Ha llegado al último escalón.");
        }
        else {
            System.out.println("Se encuentra en el escalón #" + e);
            descenso(e - 1); //Dominio: le quita un escalón al contador para indicar que ya bajó un escalón más y manda el dato actualizado de nuevo al método.
        }
    }
}
