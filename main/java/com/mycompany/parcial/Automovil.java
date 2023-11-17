/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

/**
 *
 * @author lilia
 */
public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private float horaDeSalida;
    private final  float horaDeIngreso; 
   

    // Constructores, getters y setters

    // Otros métodos específicos para automóviles
    
    public Automovil(float horaDeIngreso,int numeroPuertas, String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.numeroPuertas = numeroPuertas;
        this.horaDeIngreso = horaDeIngreso;
    }
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
     public float getHoraDeSalida() {
        return horaDeSalida;
    }

    public float getHoraDeIngreso() {
        return horaDeIngreso;
    }   

    public void setHoraDeSalida(float horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }
   public float calcularGanaciaAuto(float horaDesalida,float horaDeIngreso){
   float ganancias;
   float tarifaPorHora=10;
   ganancias=(horaDeSalida-horaDeIngreso)*tarifaPorHora;
   return ganancias;
   }

    
}
