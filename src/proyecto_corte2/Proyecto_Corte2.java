package proyecto_corte2;
/*Importaciones de clases de otro paquete para que no se pueda 
acceder directamente a los atributos desde el main*/
import Juego.Arquero;
import Juego.Guerrero;
import Juego.Personaje;
import Juego.Mago;
import java.util.Scanner;

public class Proyecto_Corte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a este videojue... Digo proyecto de POO");
        System.out.println("Escoje el nombre de tu personaje");
        String nombre1 = scanner.nextLine();
        System.out.println("Escoge el nivel de tu personaje");
        int nivel1 = scanner.nextInt();
        System.out.println("Escoje la salud de tu personaje");
        double salud1 = scanner.nextDouble();
        System.out.println("Escoge si tu personaje es bueno o no (true o false)");
        boolean esBueno1 = scanner.nextBoolean();
        //Con el constructor 3 porque no van a tener mucha relevancia estos datos
        Personaje personaje1 = new Personaje(nombre1, nivel1, salud1, esBueno1);
        scanner.nextLine();
        System.out.println("Personaje creado");
        System.out.println(personaje1.toString());
        
        System.out.println("Escoje el nombre de tu guerrero");
        String nombre2 = scanner.nextLine();
        System.out.println("Escoje el tipo de combate (A o D)");
        char combate2 = scanner.next().charAt(0);
        //Con el constructor 2, porque el ususario no debe escoger su vida, ni nivel ni nada similar
        Guerrero guerrero1 = new Guerrero(nombre2, combate2);
        scanner.nextLine();
        System.out.println("Guerrero creado");
        System.out.println(guerrero1.toString());
        
        System.out.println("Escoge el nombre de tu arquero");
        String nombre3 = scanner.nextLine();
        System.out.println("¿Tiene flechas especiales? (true o false)");
        boolean flechas3 = scanner.nextBoolean();
        //Con el constructor de 2 parametros porque solo puede escoger su nombre y sus flechas
        Arquero arquero1 = new Arquero(nombre3, flechas3);
        scanner.nextLine();
        System.out.println("Arquero creado");
        System.out.println(arquero1.toString());
        
        System.out.println("Escoge el nombre de tu mago");
        String nombre4 = scanner.nextLine();
        System.out.println("Cuantos puntos de mana tiene");
        int mana4 = scanner.nextInt();
        //Con el constructor de 2 parametros porque solo puede escoger su nombre y sus puntos de maná
        Mago mago1 = new Mago(nombre4, mana4);
        scanner.nextLine();
        System.out.println("Mago creado");
        System.out.println(mago1.toString());
        
        //Con el constructor de 1 parametro porque los enemigos vienen asi por defecto
        Personaje enemigo1 = new Personaje();
        Guerrero enemigo2 = new Guerrero();
        Arquero enemigo3 = new Arquero();
        Mago enemigo4 = new Mago();
        System.out.println("Estos son los enemigos que enfrentarán");
        System.out.println(enemigo1.toString());
        System.out.println(enemigo2.toString());
        System.out.println(enemigo3.toString());
        System.out.println(enemigo4.toString());
        
        System.out.println("Continuará... En el proyecto del corte 3");
    }
}