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
    
    private float precioBase;
    private String color;
    private char consEnergetico;
    private int peso;

    public Electrodomestico() {
        this.precioBase = PRECIO_DEF;
        this.color = COLOR_DEF;
        this.consEnergetico = CONSUMO_DEF;
        this.peso = PESO_DEF;
    }

    public Electrodomestico(float precioBase, int peso) {
        this.color = COLOR_DEF;
        this.consEnergetico = CONSUMO_DEF;
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(float precioBase, String color, char consEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consEnergetico = consEnergetico;
        this.peso = peso;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsEnergetico() {
        return consEnergetico;
    }

    public int getPeso() {
        return peso;
    }
    
    public void comprobarConsumoEnergetico(char letra){
        if(letra > 'A' && letra < 'F'){
            this.consEnergetico = letra;
        }
        this.consEnergetico = CONSUMO_DEF;
    }
    
    public void comprobarColor(String color){
        if (color.equals("negro") || color.equals("NEGRO")){
            this.color = color;
        } else {
            if(color.equals("ROJO") || color.equals("rojo")){
                this.color = color;
            } else {
                if(color.equals("azul") || color.equals("AZUL")){
                    this.color = color;
                } else {
                    if(color.equals("gris") || color.equals("GRIS")){
                       this.color = color; 
                    }
                }
            } 
        }
        this.color = COLOR_DEF;
    }
    public void precioFinal(char consEnergico, float peso){
        switch (consEnergetico) {
            case 'A':
                precioBase += 100f;
                break;
            case 'B':
                precioBase += 80f;
                break;
            case 'C':
                precioBase += 60f;
                break;
            case 'D':
                precioBase += 50f;
                break;
            case 'E':
                precioBase += 30f;
                break;
            case 'F':
                precioBase += 10f;
        }
        if (peso < 20){
            precioBase += 10f;
        } else{
            if (peso >= 20 && peso < 50){
                precioBase += 50f;
            } else {
                if(peso >= 50 && peso <= 80){
                    precioBase += 80f;
                } else {
                    precioBase += 100f;
                }
            }
        }
    }
}
