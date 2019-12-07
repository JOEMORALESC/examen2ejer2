/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoexamenej2;

/**
 *
 * @author joemo
 */
public class Pelicula {

    String nombre;
    String tipo;
    String director;
    String casa;
    double duracion;
    int anno;
    double precio;

    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public Pelicula(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Pelicula(String nombre, String tipo, String director) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.director = director;
    }

    public Pelicula(String nombre, String tipo, String director, String casa) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.director = director;
        this.casa = casa;
    }

    public Pelicula(String nombre, String tipo, String director, String casa, int duracion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.director = director;
        this.casa = casa;
        this.duracion = duracion;
    }

    public Pelicula(String nombre, String tipo, String director, String casa, double duracion, int anno) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.director = director;
        this.casa = casa;
        this.duracion = duracion;
        this.anno = anno;
    }

    public Pelicula(String nombre, String tipo, String director, String casa, double duracion, int anno, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.director = director;
        this.casa = casa;
        this.duracion = duracion;
        this.anno = anno;
        this.precio = precio;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDirector(String director){
        this.director=director;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public void setCasa(String casa){
        this.casa=casa;
    }
    
    public String getCasa(){
        return this.casa;
    }
    
    public void setDuracion(double duracion){
        this.duracion=duracion;
    }
    
    public double getDuracion(){
        return this.duracion;
    }
    
    public void setAnno(int anno){
        this.anno=anno;
    }
    
    public int getAnno(){
        return this.anno;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
}
