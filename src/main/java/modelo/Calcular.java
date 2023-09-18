/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Calcular {
    private double capital;
    private double interesAnual;
    private double interesGenerado;
    private int plazo;
    
    public Calcular(){
        this.capital=0;
        this.interesAnual=0;
        this.interesGenerado=0;
        this.plazo=0;
    }
    
    public void InteresGenerado(){
        this.interesGenerado=this.capital*(this.interesAnual/100)*this.plazo;
    }

    /**
     * @return the capital
     */
    public double getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(double capital) {
        this.capital = capital;
    }

    /**
     * @return the interesAnual
     */
    public double getInteresAnual() {
        return interesAnual;
    }

    /**
     * @param interesAnual the interesAnual to set
     */
    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    /**
     * @return the interesGenerado
     */
    public double getInteresGenerado() {
        return interesGenerado;
    }

    /**
     * @param interesGenerado the interesGenerado to set
     */
    public void setInteresGenerado(double interesGenerado) {
        this.interesGenerado = interesGenerado;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
}
