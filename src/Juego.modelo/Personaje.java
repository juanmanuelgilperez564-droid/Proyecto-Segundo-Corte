package Juego;
public class Personaje {
    //Atributos
    protected String nombre;
    protected int nivel;
    protected double salud;
    protected boolean esBueno;
    
    //Constructores
    
    //Constructor 1. Por defecto
    public Personaje(){
        this("Pedro", 1, 100, false);
    }
    //Constructor 2. Solo nombre
    public Personaje(String nombre){
        this(nombre, 1, 100, true);
    } 
    //Constructor 3. General
    public Personaje(String nombre, int nivel, double salud, boolean esBueno){
        this.nombre=nombre;
        this.nivel=nivel;
        this.salud=salud;
        this.esBueno=esBueno;
    }
    
    //Getters y Setters
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    
    public int getNivel(){return nivel;}
    public void setNivel(int nivel){
        if(nivel > 0){this.nivel = nivel;}
        else{System.out.println("Nivel no puede ser menor a cero");}
    }
    
    public double getSalud(){return salud;}
    public void setSalud(double salud){this.salud = salud;}
    
    public boolean getesBueno(){return esBueno;}
    public void setEsBueno(boolean esBueno){this.esBueno = esBueno;}
    
    //Método toString
    @Override
    public String toString(){
        return "Personaje: {" +
                "Nombre: " + nombre +
                " Nivel: " + nivel +
                " Salud: " + salud +
                " ¿Es bueno?: " + esBueno + "}";
    }
}