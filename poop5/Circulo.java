/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 *
 * @author jopl1
 */
public class Circulo {
    static double PI = Math.PI;
    private double radio;
    private String color;

    /**
     * Se crea el circulo
     */
    public Circulo() {
    }
    /**
     * Este constructor tiene un parámetro
     * @param radio se le da valor al radio
     */
    public Circulo(double radio) {
        this.radio = radio;
    }
    /**
     * 
     * @return Es el radio de nuestro circulo
     */
    public double getRadio() {
        return radio;
    }
    /**
     * 
     * @param radio Es de tipo double
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * 
     * @return Se imprimie la informacion del circulo
     */
    @Override
    public String toString() {
        return "Circulo{" + "radio = " + radio + ", color = " + color + '}';
    }
    /**
     * 
     * @return se saca el perimetro del circulo 
     */
    public double perimetro(){
        return 2 * PI * radio;
    }
    /**
     * 
     * @return se saca el area del circulo 
     */
    public double area(){
        return PI * radio * radio;
    }
    
    
}
