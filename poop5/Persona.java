/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Esta es la clase persona que se utilizo en la Practica 5
 * @author Jesus Omar
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    /**
     * Se genera la persona
     */
    public Persona() {
    }
    
    /**
     * Es el constructor que recibe 3 parametros
     * @param nombre Nombre de nuestra persona, de tipo String
     * @param apellido Apellido de nuestra persona, de tipo String
     * @param fNacimiento Fecha de nacimiento de nuestra persona, de tipo fNacimiento
     */    
    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @param nombre Se le agrega el nombre a la persona 
     * @param apellido Se le agrega el apellido a la persona
     */

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = new Fecha(3,5,2000);
    }
    /**
     * 
     * @return nombre Es de tipo String 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre Es el nombre de nuestra persona 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return apellido Es de tipo String 
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * 
     * @param apellido Es el nombre de nuestra persona 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * 
     * @return fNacimiento Es de tipo Fecha
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * 
     * @param fNacimiento Se crea la fecha de nacimiento de la persona
     */
    
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @return Aqui se imprimen los datos de la persona
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", apellido = " + apellido + ", fNacimiento = " + fNacimiento + '}';
    }
    
    
    
}
