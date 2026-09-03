package proyecto_corte2;
public class Personaje {
    //Atributos
    protected String nombre;
    protected int nivel;
    protected double salud;
    protected boolean esBueno;
    
    //Constructores
    public Personaje(){
        this("Pedro", 1, 100, true);
    }
    public Personaje(String nombre){
        this(nombre, 1, 100, true);
    } 
    public Personaje(String nombre, int nivel, double salud, boolean esBueno){
        this.nombre=nombre;
        this.nivel=nivel;
        this.salud=salud;
        this.esBueno=esBueno;
    }
}