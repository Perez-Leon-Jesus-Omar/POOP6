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
class Fecha {    
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }
    /***
     * 
     * Este constructor recibe 3 parametros
     * @param dia Es el dia de la fecha de nacimiento es de tipo int
     * @param mes Es el mes de la fecha de nacimiento es de tipo int
     * @param anio Es el aÃ±o de la fecha de nacimiento es de tipo int 
     */
    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * 
     * @return Se imprime la fecha con todos los datos  
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia = " + dia + ", mes = " + mes + ", anio = " + anio + '}';
    }
          
}
