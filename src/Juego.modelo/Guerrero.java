package Juego;
public class Guerrero extends Personaje {
    //Atributos
    private char combate;
    //A para agresivo, D para defensivo
    private int fuerzaAtaque;
    private double peso;
    private boolean tieneEscudo;
    //Metodos constructores
    //Constructor 1. Por defecto
    public Guerrero(){
        this("Oswaldo", 1, 100, true, 'A', 100, 90, false);
    }
    //Constructor 2. nombre y tipo de combate
    public Guerrero(String nombre, char combate){
        super(nombre);
        this.combate=combate;
        
        if(combate == 'A'){
            this.fuerzaAtaque=100;
            this.peso=90;
            this.tieneEscudo=false;
        }
        else{
            this.fuerzaAtaque=50;
            this.peso=70;
            this.tieneEscudo=true;
        }
    }
    //Constructor 3. General
    public Guerrero(String nombre, int nivel, double salud, boolean esBueno, char combate, int fuerzaAtaque, double peso, boolean tieneEscudo){
        super(nombre, nivel, salud, esBueno);
        this.combate = combate;
        this.fuerzaAtaque = fuerzaAtaque;
        this.peso = peso;
        this.tieneEscudo = tieneEscudo;
    }
    //Método toString
    @Override
    public String toString(){
        return super.toString() + 
                "{" +
                " Combate: " + combate +
                " - fuerzaAtaque: " + fuerzaAtaque +
                " - Peso: " + peso +
                " - ¿Tiene escudo?: " + tieneEscudo +
                "}";
    }
}