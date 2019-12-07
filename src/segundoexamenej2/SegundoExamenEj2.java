/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoexamenej2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joemo
 */
public class SegundoExamenEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        ArrayList<Pelicula> carrito = new ArrayList<>();
        String temp;
        int opc;
        do {
            temp = JOptionPane.showInputDialog("Seleccione una opcion: \n "
                    + "\n1- Ingresar pelicula terror "
                    + "\n2- Ingresar pelicula accion "
                    + "\n3- Ingresar pelicula drama"
                    + "\n4- Ingresar pelicula comedia"
                    + "\n5- Alquilar pelicula (AGREGAR A CARRITO)"
                    + "\n6- Facturar peliculas"
                    + "\n7- Limpiar carrito"
                    + "\n8- SALIR"
                    + "\n\n Seleccione una opcion: ");
            opc = Integer.parseInt(temp);
            switch (opc) {
                case 1: {
                    Pelicula pelicula = new Pelicula();
                    pelicula.setNombre(JOptionPane.showInputDialog("Digite el nombre de la pelicula"));
                    pelicula.setDirector(JOptionPane.showInputDialog("Digite el nombre del director de la pelicula"));
                    pelicula.setAnno(Integer.parseInt(JOptionPane.showInputDialog("Digite el año la pelicula")));
                    pelicula.setTipo("Terror");
                    pelicula.setDuracion(Double.parseDouble(JOptionPane.showInputDialog("Digite la duracion de la pelicula")));
                    pelicula.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Digite el precio de la pelicula")));
                    peliculas.add(pelicula);
                    break;
                }
                case 2: {
                    Pelicula pelicula = new Pelicula();
                    pelicula.setNombre(JOptionPane.showInputDialog("Digite el nombre de la pelicula"));
                    pelicula.setDirector(JOptionPane.showInputDialog("Digite el nombre del director de la pelicula"));
                    pelicula.setAnno(Integer.parseInt(JOptionPane.showInputDialog("Digite el año la pelicula")));
                    pelicula.setTipo("Accion");
                    pelicula.setDuracion(Double.parseDouble(JOptionPane.showInputDialog("Digite la duracion de la pelicula")));
                    pelicula.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Digite el precio de la pelicula")));
                    peliculas.add(pelicula);
                    break;
                }
                case 3: {
                    Pelicula pelicula = new Pelicula();
                    pelicula.setNombre(JOptionPane.showInputDialog("Digite el nombre de la pelicula"));
                    pelicula.setDirector(JOptionPane.showInputDialog("Digite el nombre del director de la pelicula"));
                    pelicula.setAnno(Integer.parseInt(JOptionPane.showInputDialog("Digite el año la pelicula")));
                    pelicula.setTipo("Drama");
                    pelicula.setDuracion(Double.parseDouble(JOptionPane.showInputDialog("Digite la duracion de la pelicula")));
                    pelicula.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Digite el precio de la pelicula")));
                    peliculas.add(pelicula);
                    break;
                }
                case 4: {
                    Pelicula pelicula = new Pelicula();
                    pelicula.setNombre(JOptionPane.showInputDialog("Digite el nombre de la pelicula"));
                    pelicula.setDirector(JOptionPane.showInputDialog("Digite el nombre del director de la pelicula"));
                    pelicula.setAnno(Integer.parseInt(JOptionPane.showInputDialog("Digite el año la pelicula")));
                    pelicula.setTipo("Comedia");
                    pelicula.setDuracion(Double.parseDouble(JOptionPane.showInputDialog("Digite la duracion de la pelicula")));
                    pelicula.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Digite el precio de la pelicula")));
                    peliculas.add(pelicula);
                    break;
                }
                case 5: {
                    temp = "";
                    int cont = 0, index;
                    for (Pelicula pelicula : peliculas) {
                        temp = temp + "\n Indice: " + cont
                                + "\n Nombre: " + pelicula.getNombre()
                                + "\n Director: " + pelicula.getDirector()
                                + "\n Casa: " + pelicula.getCasa()
                                + "\n Tipo: " + pelicula.getTipo()
                                + "\n Año: " + pelicula.getAnno()
                                + "\n Precio: " + pelicula.getPrecio()
                                + "\n----------------------------";
                        cont++;
                    }
                    JOptionPane.showMessageDialog(null, temp);
                    index = Integer.parseInt(JOptionPane.showInputDialog("Digite el indice de la pelicula a agregar al carrito"));
                    carrito.add(peliculas.get(index));
                    break;
                }
                case 6: {
                    temp="";
                    double total=0;
                    for (Pelicula pelicula : carrito) {
                      if(pelicula.getTipo().equalsIgnoreCase("terror")){  
                      temp = temp + "\n Nombre: " + pelicula.getNombre()
                                + "\n Director: " + pelicula.getDirector()
                                + "\n Casa: " + pelicula.getCasa()
                                + "\n Tipo: " + pelicula.getTipo()
                                + "\n Año: " + pelicula.getAnno()
                                + "\n Precio: " + pelicula.getPrecio()
                                + "\n Precio mas recargo por genero (10%)"+(pelicula.getPrecio()+(0.1*pelicula.getPrecio()))
                                + "\n----------------------------";
                      total=total+(pelicula.getPrecio()+(0.1*pelicula.getPrecio()));
                    }else if(pelicula.getTipo().equalsIgnoreCase("accion")){
                            temp = temp + "\n Nombre: " + pelicula.getNombre()
                                + "\n Director: " + pelicula.getDirector()
                                + "\n Casa: " + pelicula.getCasa()
                                + "\n Tipo: " + pelicula.getTipo()
                                + "\n Año: " + pelicula.getAnno()
                                + "\n Precio: " + pelicula.getPrecio()
                                + "\n Precio mas recargo por genero (15%)"+(pelicula.getPrecio()+(0.15*pelicula.getPrecio()))
                                + "\n----------------------------";
                            total=total+(pelicula.getPrecio()+(0.15*pelicula.getPrecio()));
                            }else if(pelicula.getTipo().equalsIgnoreCase("drama")){
                                temp = temp + "\n Nombre: " + pelicula.getNombre()
                                + "\n Director: " + pelicula.getDirector()
                                + "\n Casa: " + pelicula.getCasa()
                                + "\n Tipo: " + pelicula.getTipo()
                                + "\n Año: " + pelicula.getAnno()
                                + "\n Precio: " + pelicula.getPrecio()
                                + "\n Precio mas recargo por genero (20%)"+(pelicula.getPrecio()+(0.2*pelicula.getPrecio()))
                                + "\n----------------------------";
                            total=total+(pelicula.getPrecio()+(0.2*pelicula.getPrecio()));
                            }else{
                                temp = temp + "\n Nombre: " + pelicula.getNombre()
                                + "\n Director: " + pelicula.getDirector()
                                + "\n Casa: " + pelicula.getCasa()
                                + "\n Tipo: " + pelicula.getTipo()
                                + "\n Año: " + pelicula.getAnno()
                                + "\n Precio: " + pelicula.getPrecio()
                                + "\n Precio mas recargo por genero (5%)"+(pelicula.getPrecio()+(0.05*pelicula.getPrecio()))
                                + "\n----------------------------";
                                total=total+(pelicula.getPrecio()+(0.05*pelicula.getPrecio()));
                            }
                            }
                    
                    JOptionPane.showMessageDialog(null, temp+"\n Total a pagar: "+total);
                    break;
                }
                case 7: {
                    carrito.clear();
                    break;
                }
                case 8: {
                    JOptionPane.showMessageDialog(null, "Hasta la proxima");
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Digite una opcion valida");
                }
            }
        } while (opc != 8);
    }
}
