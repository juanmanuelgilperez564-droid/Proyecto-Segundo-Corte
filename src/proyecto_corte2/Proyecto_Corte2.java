package proyecto_corte2;
/*Importaciones de clases de otro paquete para que no se pueda 
acceder directamente a los atributos desde el main*/

import Juego.Arquero;
import Juego.Guerrero;
import Juego.Personaje;
import Juego.Mago;

public class Proyecto_Corte2 {
    public static void main(String[] args) {
        Personaje p1 = new Personaje();
        
        System.out.println(p1.toString());
    }
}