package Juego;
public class Mago extends Personaje{
    //Atributos
    private int puntosMana;
    private double potenciaHechizo;
    private boolean tieneBarita;
    private String elemento;
    //Metodos constructores
    //Constructor 1. por defecto
    public Mago(){
        this("Pepe", 1, 100, false, 10, 50, false, "tierra");
    }
    //Constructor 2. Nombre y puntos de mana
    public Mago(String nombre, int puntosMana){
        super(nombre);
        this.puntosMana = puntosMana;
        
        if(puntosMana >= 100){
            this.potenciaHechizo = 1000;
            this.tieneBarita = true;
            this.elemento = "Fuego";
        }
        else if(puntosMana >= 75 && puntosMana<100){
            this.potenciaHechizo = 500;
            this.tieneBarita = true;
            this.elemento = "Hielo";
        }
        else if(puntosMana >= 50 && puntosMana<75){
            this.potenciaHechizo = 100;
            this.tieneBarita = true;
            this.elemento = "Aire";
        }
        else{
            this.potenciaHechizo = 50;
            this.tieneBarita = false;
            this.elemento = "Tierra";
        }
    }
    //Constructor 3. General
    public Mago(String nombre, int nivel, double salud, boolean esBueno, int puntosMana, double potenciaHechizo, boolean tieneBarita, String elemento){
        super(nombre, nivel, salud, esBueno);
        this.puntosMana = puntosMana;
        this.potenciaHechizo = potenciaHechizo;
        this.tieneBarita = tieneBarita;
        this.elemento = elemento;
    }
    //Metodo toString
    @Override
    public String toString(){
        return super.toString() + 
                "{" +
                " Puntos de maná: " + puntosMana +
                " - Potencia de hechizo: " + potenciaHechizo +
                " - ¿Tiene barita?: " + tieneBarita +
                " - Elemento: " + elemento +
                "}";
    }
}
