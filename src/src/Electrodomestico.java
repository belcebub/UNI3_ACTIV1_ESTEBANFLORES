/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Geraf
 */
public class Electrodomestico {
    //Constantes
    public final static float PRECIO_DEF = 100f;
    public final static String COLOR_DEF = "BLANCO";
    public final static char CONSUMO_DEF = 'F';
    public final static int PESO_DEF = 5;
    
    float precioBase;
    String color;
    char consEnergetico;
    int peso;

    public Electrodomestico(float precioBase, String color, char consEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consEnergetico = consEnergetico;
        this.peso = peso;
    }
    
    
}
