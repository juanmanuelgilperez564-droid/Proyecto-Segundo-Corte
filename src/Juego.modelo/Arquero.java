package Juego;
public class Arquero extends Personaje {
    //Atributos
    private int distanciaAtaque;
    private double presicion;
    private boolean flechasEspeciales;
    private long cantidadFlechas;
    
    //Metodos constructores
    public Arquero(){
        this("Arquerín", 1, 100, true, 500, 50, false, 1000L);
    }
    
    public Arquero(String nombre, int nivel, double salud, boolean esBueno, boolean flechasEspeciales){
        super(nombre, nivel, salud, esBueno);
        this.flechasEspeciales = flechasEspeciales;
        
        if(flechasEspeciales == true){
            this.distanciaAtaque = 1000;
            this.cantidadFlechas = 1000000L;
            this.presicion = 100;
        }
        else{
            this.distanciaAtaque = 500;
            this.cantidadFlechas = 1000L;
            this.presicion = 50;
        }
    }
    
    public Arquero(String nombre, int nivel, double salud, boolean esBueno, int distanciaAtaque, double presicion, boolean flechasEspeciales, long cantidadFlechas){
        super(nombre, nivel, salud, esBueno);
        this.distanciaAtaque = distanciaAtaque;
        this.presicion = presicion;
        this.flechasEspeciales = flechasEspeciales;
        this.cantidadFlechas = cantidadFlechas;
    }
    //Metodo toString()
    @Override
    public String toString(){
        return super.toString() + 
                "{" +
                " Distancia de ataque: " + distanciaAtaque +
                " - Presición: " + presicion +
                " - ¿Tiene flechas especiales?: " + flechasEspeciales +
                " - Cantidad de flechas: " + cantidadFlechas +
                "}";
    }
}
