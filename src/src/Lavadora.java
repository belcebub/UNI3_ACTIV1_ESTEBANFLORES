/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author beelze
 */
public class Lavadora extends Electrodomestico{
    private final static int CARGA_DEF = 5; 
    
    private int carga;

    public Lavadora() {
        carga = CARGA_DEF;
    }

    public Lavadora(float precioBase, int peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEF;
    }

    public Lavadora(float precioBase, String color, char consEnergetico, int peso, int carga) {
        super(precioBase, color, consEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
}
