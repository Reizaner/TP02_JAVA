/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria;

/**
 *
 * @author Usuario
 */
public class Servicio {
    private String tipoServi;
    private Double Precio;
    private String informe;
    private Animal m1;

    public Animal getM1() {
        return m1;
    }

    public void setM1(Animal m1) {
        this.m1 = m1;
    }
    
    
    public String getTipoServi() {
        return tipoServi;
    }

    public void setTipoServi(String tipoServi) {
        this.tipoServi = tipoServi;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }
    
    
}
