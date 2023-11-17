/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

/**
 *
 * @author lilia
 */
public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private float horaDeSalida;
    private final  float horaDeIngreso; 

 
    public Motocicleta( float horaDeIngreso,int cilindrada, String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.cilindrada = cilindrada;
        this.horaDeIngreso = horaDeIngreso;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
   
    public int getCilindrada() {
        return cilindrada;
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
  public float calcularGanaciaMoto(float horaDesalida,float horaDeIngreso){
   float ganancias;
   float tarifaPorHora=2;
   ganancias=(horaDeSalida-horaDeIngreso)*tarifaPorHora;
   return ganancias; 
  } 
}
