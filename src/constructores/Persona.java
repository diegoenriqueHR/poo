/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author DIEGO
 */
public class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(){}
   
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public String getTextoImprimir(){
        return "Nombre: "
                +this.nombre
                + "\n Edad: "
                +this.getEdadComoTexto()
                +"\n---------------------------";
        
    }
    
    public String getEdadComoTexto(){
        String edadTexto = Constructores.convertirATexto(edad);
        return edadTexto;
    }
    
            

    
}
