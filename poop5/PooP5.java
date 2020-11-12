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
public class PooP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ///Clase circulo
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(6.0);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        System.out.println("\nPerimetro c1 = " + c1.perimetro());
        System.out.println("Area del c1 = " + c1.area());
        
        System.out.println("\nPerimetro c2 = " + c2.perimetro());
        System.out.println("Area del c2 = " + c2.area());
        
        ///Uso de .setRadio
        System.out.println("\n***********************");
        c1.setRadio (9.0);
        System.out.println("Perimetro c1 = " + c1.perimetro());
        System.out.println("Area del c1 = " + c1.area());
        
        ///Clase Persona
        System.out.println("\n***********************");
        Persona amigo = new Persona();
        Fecha fNacimiennto = new Fecha(3,4,2002);
        amigo.setNombre("Ranitidino");
        amigo.setApellido("Ramirez");
        amigo.setfNacimiento(fNacimiennto);
        
        ///con toString
        System.out.println("Info 1: " + amigo.toString());
        ///sin toString tambien funciona ya que esta incluido en la clase
        System.out.println("Info 1: " + amigo);
        
        Persona amigo2 = new Persona("Damocles","Pachamama",new Fecha(20,4,1993));
        System.out.println("Info 2: " + amigo2);
        
        
        Persona amigo3 = new Persona("Tarantulo","Arampulo");
        System.out.println("Info 3: " + amigo3);
        
        ///Ejercicios para reporte: De las clases que creamos, hacer la estructura con getter y setter
    }
    
}
