/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nataliguillen.estudiocasopractico1_nataliguillenrodriguez;


public class Revista extends Publicacion {
    
    //Atributo
    private int numeroEdicion;

    //Constructor
    public Revista(String titulo, String editorial, int paginas,
            int numeroEdicion) {
        super(titulo, editorial, paginas);
        this.numeroEdicion = numeroEdicion;
    }

    //Getter y Setter
    public int getNumeroEdicion() {
        return numeroEdicion;
    }
    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
    
}
